package io.github.kirbocabana.yggdrasil.common.fluids;

import io.github.kirbocabana.yggdrasil.core.init.FluidInit;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.fluids.FluidAttributes;

public abstract class SapFluid extends FlowingFluid{

	@Override
	public Fluid getFlowing() {
		return FluidInit.SAP_FLOWING.get();
	}

	@Override
	public Fluid getSource() {
		return FluidInit.SAP_FLUID.get();
	}

	@Override
	protected void beforeDestroyingBlock(IWorld p_205580_1_, BlockPos p_205580_2_, BlockState p_205580_3_) {
	}

	@Override
	protected int getSlopeFindDistance(IWorldReader p_185698_1_) {
		return 0;
	}

	@Override
	protected int getDropOff(IWorldReader p_204528_1_) {
		return 3;
	}

	@Override
	public Item getBucket() {
		return FluidInit.SAP_BUCKET.get();
	}

	@Override
	public int getTickDelay(IWorldReader p_205569_1_) {
		return 100;
	}

	@Override
	protected float getExplosionResistance() {
		return 100F;
	}

	@Override
    protected FluidAttributes createAttributes() {
		return net.minecraftforge.fluids.FluidAttributes.builder(FluidInit.SAP_STILL_RL, FluidInit.SAP_FLOWING_RL).luminosity(0).density(3000).viscosity(6000).temperature(0).build(this);
		   }
	
	protected boolean canSourcesMultiply() {
		return false;
		   }
	
	//public BlockState getBlockState(FluidState state) {return SapFluidBlock.get().defaultBlockState().with(FlowingFluidBlock.LEVEL, Integer.valueOf(getAmount(state)));}
	
		   public boolean isSame(Fluid fluidIn) {
		      return fluidIn == getSource() || fluidIn == getFlowing();
		      }
	
	
	@Override
	public boolean isSource(FluidState p_207193_1_) {
		return false;
	}

	@Override
	public int getAmount(FluidState p_207192_1_) {
		return 0;
	}
	
	   public static class Flowing extends SapFluid {
		      protected void fillStateContainer(StateContainer.Builder<Fluid, FluidState> builder) {
		         super.defaultFluidState();
		         builder.add(LEVEL);
		      }

		      public int getLevel(FluidState p_207192_1_) {
		         return p_207192_1_.getAmount();
		      }

		      public boolean isSource(FluidState state) {
		         return false;
		      }

			@Override
			protected boolean canConvertToSource() {
				return false;
			}

			@Override
			protected boolean canBeReplacedWith(FluidState p_215665_1_, IBlockReader p_215665_2_, BlockPos p_215665_3_,
					Fluid p_215665_4_, Direction p_215665_5_) {
				return false;
			}

			@Override
			protected BlockState createLegacyBlock(FluidState p_204527_1_) {
				return null;
			}
		   }

	   public static class Source extends SapFluid {
		      public int getLevel(FluidState p_207192_1_) {
		         return 8;
		      }

		      public boolean isSource(FluidState state) {
		         return true;
		      }

			@Override
			protected boolean canConvertToSource() {
				return false;
			}

			@Override
			protected boolean canBeReplacedWith(FluidState p_215665_1_, IBlockReader p_215665_2_, BlockPos p_215665_3_,
					Fluid p_215665_4_, Direction p_215665_5_) {
				return false;
			}

			@Override
			protected BlockState createLegacyBlock(FluidState p_204527_1_) {
				return null;
			}
    }

}
