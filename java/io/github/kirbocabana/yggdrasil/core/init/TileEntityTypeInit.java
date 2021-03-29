package io.github.kirbocabana.yggdrasil.core.init;

import io.github.kirbocabana.yggdrasil.Yggdrasil;
import io.github.kirbocabana.yggdrasil.common.tiles.RuneAltarTileEntity;
import io.github.kirbocabana.yggdrasil.common.tiles.SpigotTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeInit {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, Yggdrasil.MOD_ID);
	
	public static final RegistryObject<TileEntityType<SpigotTileEntity>> SPIGOT_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE.register("spigot", 
			() -> TileEntityType.Builder.of(() -> new SpigotTileEntity(), BlockInit.SPIGOT.get()).build(null));
	
	public static final RegistryObject<TileEntityType<RuneAltarTileEntity>> RUNE_ALTAR_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE.register("rune_altar", 
			() -> TileEntityType.Builder.of(() -> new RuneAltarTileEntity(), BlockInit.RUNE_ALTAR.get()).build(null));
}
