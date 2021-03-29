package io.github.kirbocabana.yggdrasil.core.init;

import io.github.kirbocabana.yggdrasil.Yggdrasil;
import io.github.kirbocabana.yggdrasil.client.util.ModItemTier;
import io.github.kirbocabana.yggdrasil.common.items.FatFuel;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			Yggdrasil.MOD_ID);
	
	//Animal Drops
    public static final RegistryObject<FatFuel> ANIMAL_FAT = ITEMS.register("animal_fat", 
			() -> new FatFuel(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> ANIMAL_HEART = ITEMS.register("animal_heart",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).food(FoodInit.ANIMAL_HEART).stacksTo(8)));
	
	public static final RegistryObject<Item> BEAR_MEAT = ITEMS.register("bear_meat",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodInit.BEAR_MEAT)));
	
	public static final RegistryObject<Item> BOAR_MEAT = ITEMS.register("boar_meat",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodInit.BOAR_MEAT)));
	
	public static final RegistryObject<Item> COOKEDBEAR_MEAT = ITEMS.register("cookedbear_meat",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodInit.COOKEDBEAR_MEAT)));
	
	public static final RegistryObject<Item> COOKEDBOAR_MEAT = ITEMS.register("cookedboar_meat",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(FoodInit.COOKEDBOAR_MEAT)));
	
	public static final RegistryObject<Item> POLAR_HIDE = ITEMS.register("polar_hide",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> WOLF_HIDE = ITEMS.register("wolf_hide",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	//Magical Crafting Materials
	public static final RegistryObject<Item> STONE_RUNE = ITEMS.register("stone_rune",
			() -> new Item(new Item.Properties().tab(Yggdrasil.NORSE_TAB)));
	
	public static final RegistryObject<Item> PRIMAL_SHARD = ITEMS.register("primal_shard",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> PRIMAL_RUNE = ITEMS.register("primal_rune",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> YGG_SAP = ITEMS.register("ygg_sap",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	//Ingots, Nuggets, & other materials
	public static final RegistryObject<Item> DWARF_INGOT = ITEMS.register("dwarf_ingot",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> DWARF_NUGGET = ITEMS.register("dwarf_nugget",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> ADAMANTITE_INGOT = ITEMS.register("adamantite_ingot",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC).fireResistant()));
	
	//Tools & Weapons
	public static final RegistryObject<Item> IRONVIKING_SHIELD = ITEMS.register("ironviking_shield",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
	
	public static final RegistryObject<Item> IRONVIKING_SWORD = ITEMS.register("ironviking_sword",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));
	
	public static final RegistryObject<Item> RUNE_CHISEL = ITEMS.register("rune_chisel",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS).defaultDurability(100)));
	
	public static final RegistryObject<Item> ADAMANTITE_AXE = ITEMS.register("adamantite_axe",
			() -> new AxeItem(ModItemTier.ADAMANTITE, 9F, -3F, new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1).fireResistant()));
	
	public static final RegistryObject<Item> ADAMANTITE_HOE = ITEMS.register("adamantite_hoe",
			() -> new HoeItem(ModItemTier.ADAMANTITE, -2, 0F,new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1).fireResistant()));
	
	public static final RegistryObject<Item> ADAMANTITE_PICKAXE = ITEMS.register("adamantite_pickaxe",
			() -> new PickaxeItem(ModItemTier.ADAMANTITE, 5, -3F, new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1).fireResistant()));
	
	public static final RegistryObject<Item> ADAMANTITE_SHOVEL = ITEMS.register("adamantite_shovel",
			() -> new ShovelItem(ModItemTier.ADAMANTITE, 5.5F, -3F,new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1).fireResistant()));
	
	public static final RegistryObject<Item> ADAMANTITE_SWORD = ITEMS.register("adamantite_sword",
			() -> new SwordItem(ModItemTier.ADAMANTITE, 8, -2.2F,new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1).fireResistant()));
	
	//BlockItems
	public static final RegistryObject<BlockItem> RIFT_BLOCK = ITEMS.register("rift_block", 
			() -> new BlockItem(BlockInit.RIFT_BLOCK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> YGG_BARK = ITEMS.register("ygg_bark", 
			() -> new BlockItem(BlockInit.YGG_BARK.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> YGG_HARDWOOD = ITEMS.register("ygg_hardwood", 
			() -> new BlockItem(BlockInit.YGG_HARDWOOD.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> YGG_SAPWOOD = ITEMS.register("ygg_sapwood", 
			() -> new BlockItem(BlockInit.YGG_SAPWOOD.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> RUNE_ALTAR = ITEMS.register("rune_altar", 
			() -> new BlockItem(BlockInit.RUNE_ALTAR.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	
	public static final RegistryObject<BlockItem> SPIGOT = ITEMS.register("spigot", 
			() -> new BlockItem(BlockInit.SPIGOT.get(), new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
	
	//Other
	
	//(FluidInit.sap, new Item.Properties().tab(Yggdrasil.NORSE_TAB).stacksTo(1))
	
}
