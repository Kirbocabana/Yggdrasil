package io.github.kirbocabana.yggdrasil.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FatFuel extends Item
{
	public FatFuel(Properties properties) {
        super(properties);
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 600;
	}
}
