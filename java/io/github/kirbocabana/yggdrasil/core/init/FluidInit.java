package io.github.kirbocabana.yggdrasil.core.init;

import io.github.kirbocabana.yggdrasil.Yggdrasil;
import io.github.kirbocabana.yggdrasil.common.fluids.SapFluid;
import io.github.kirbocabana.yggdrasil.common.fluids.SapFluidBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {
	
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, 
			Yggdrasil.MOD_ID);
	
	//Textures
	public static final ResourceLocation SAP_STILL_RL = new ResourceLocation(Yggdrasil.MOD_ID, "blocks/sap_still");
	public static final ResourceLocation SAP_FLOWING_RL = new ResourceLocation(Yggdrasil.MOD_ID, "blocks/sap_flowing");
	
	//Registered Fluids
	public static final RegistryObject<FlowingFluid> SAP_FLUID = FLUIDS.register("sap_fluid",
			() -> new SapFluid.Source());
	public static final RegistryObject<FlowingFluid> SAP_FLOWING = FLUIDS.register("sap_flowing",
			() -> new SapFluid.Flowing());
	
	//Block
	public static final RegistryObject<FlowingFluidBlock> SAP_BLOCK = BlockInit.BLOCKS.register("sap", () -> new SapFluidBlock(() -> FluidInit.SAP_FLUID.get(), AbstractBlock.Properties.of(Material.WATER).noDrops().speedFactor(0.5F)));
	
	public static final RegistryObject<Item> SAP_BUCKET = ItemInit.ITEMS.register("sap_bucket", () -> new BucketItem(() -> FluidInit.SAP_FLUID.get(), new Item.Properties().stacksTo(1).tab(Yggdrasil.NORSE_TAB)));

}
