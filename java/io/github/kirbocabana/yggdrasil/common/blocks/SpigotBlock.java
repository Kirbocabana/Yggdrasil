package io.github.kirbocabana.yggdrasil.common.blocks;

import io.github.kirbocabana.yggdrasil.core.init.TileEntityTypeInit;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class SpigotBlock extends Block{

	public SpigotBlock() {
		super(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD)
				.harvestLevel(0).strength(1F, 1F).sound(SoundType.WOOD));
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypeInit.SPIGOT_TILE_ENTITY_TYPE.get().create();
	}

}
