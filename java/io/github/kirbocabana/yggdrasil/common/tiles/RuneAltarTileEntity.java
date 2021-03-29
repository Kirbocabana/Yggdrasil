package io.github.kirbocabana.yggdrasil.common.tiles;

import io.github.kirbocabana.yggdrasil.core.init.TileEntityTypeInit;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class RuneAltarTileEntity extends TileEntity{

	public RuneAltarTileEntity(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}
	
	public RuneAltarTileEntity() {
		this(TileEntityTypeInit.RUNE_ALTAR_TILE_ENTITY_TYPE.get());
		
	}

}
