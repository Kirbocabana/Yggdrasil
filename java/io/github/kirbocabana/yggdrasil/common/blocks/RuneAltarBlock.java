package io.github.kirbocabana.yggdrasil.common.blocks;

import io.github.kirbocabana.yggdrasil.core.init.TileEntityTypeInit;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class RuneAltarBlock extends Block{

	public RuneAltarBlock() {
		super(AbstractBlock.Properties.of(Material.WOOD).strength(4f, 30f).sound(SoundType.WOOD));
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return TileEntityTypeInit.RUNE_ALTAR_TILE_ENTITY_TYPE.get().create();
	}
	

}