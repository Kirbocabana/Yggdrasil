package io.github.kirbocabana.yggdrasil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.kirbocabana.yggdrasil.core.init.BlockInit;
import io.github.kirbocabana.yggdrasil.core.init.FluidInit;
import io.github.kirbocabana.yggdrasil.core.init.ItemInit;
import io.github.kirbocabana.yggdrasil.core.init.TileEntityTypeInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;	
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Yggdrasil.MOD_ID)
public class Yggdrasil
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "kirbo_yggdrasil";
    public static final ItemGroup NORSE_TAB = new NorseTab();

    public Yggdrasil() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
    	
    	ItemInit.ITEMS.register(bus);
    	FluidInit.FLUIDS.register(bus);
    	BlockInit.BLOCKS.register(bus);
    	TileEntityTypeInit.TILE_ENTITY_TYPE.register(bus);
        
        MinecraftForge.EVENT_BUS.register(this);
        
        
    }
    
    private void setup(final FMLCommonSetupEvent event) {
    
    }
    
    public static class NorseTab extends ItemGroup {

		public NorseTab() {
			super("Yggdrasil");

		}

		@Override
		public ItemStack makeIcon() {

			return ItemInit.PRIMAL_RUNE.get().getDefaultInstance();
		}
    }
}
