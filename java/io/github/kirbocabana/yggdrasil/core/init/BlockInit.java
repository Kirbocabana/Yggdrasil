package io.github.kirbocabana.yggdrasil.core.init;

import io.github.kirbocabana.yggdrasil.Yggdrasil;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			Yggdrasil.MOD_ID);
	
	public static final RegistryObject<Block> RIFT_BLOCK = BLOCKS.register("rift_block", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(15f, 30f).harvestTool(ToolType.PICKAXE).harvestLevel(3).sound(SoundType.STONE).requiresCorrectToolForDrops().lightLevel((p_235838_1_) -> {return 5;})));

	public static final RegistryObject<Block> YGG_BARK = BLOCKS.register("ygg_bark", 
			() -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(15f, 30f).harvestTool(ToolType.AXE).harvestLevel(3).sound(SoundType.WOOD).requiresCorrectToolForDrops()));
	
	public static final RegistryObject<Block> YGG_HARDWOOD = BLOCKS.register("ygg_hardwood", 
			() -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(15f, 30f).sound(SoundType.WOOD).noDrops()));
	
	public static final RegistryObject<Block> YGG_SAPWOOD = BLOCKS.register("ygg_sapwood", 
			() -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(15f, 30f).sound(SoundType.WOOD).noDrops().randomTicks()));
	
	public static final RegistryObject<Block> RUNE_ALTAR = BLOCKS.register("rune_altar", 
			() -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(15f, 30f).sound(SoundType.WOOD)));
}
