package io.github.kirbocabana.yggdrasil.common.tiles;

import io.github.kirbocabana.yggdrasil.core.init.TileEntityTypeInit;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;

public class SpigotTileEntity extends TileEntity{

	public SpigotTileEntity(TileEntityType<?> tileEntityTypeIn) {
		super(tileEntityTypeIn);
	}
	
	public SpigotTileEntity() {
		this(TileEntityTypeInit.SPIGOT_TILE_ENTITY_TYPE.get());
		
	}

}
