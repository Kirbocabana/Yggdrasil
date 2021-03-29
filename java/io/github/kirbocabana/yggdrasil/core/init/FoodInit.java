package io.github.kirbocabana.yggdrasil.core.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
	
public class FoodInit {
	
	//Real Foods
	public static final Food BEAR_MEAT = new Food.Builder().nutrition(6).saturationMod(0.5f).meat().build();
	
	public static final Food BOAR_MEAT = new Food.Builder().nutrition(3).saturationMod(0.5f).meat().build();
	
	public static final Food COOKEDBEAR_MEAT = new Food.Builder().nutrition(16).saturationMod(7f).meat().build();
	
	public static final Food COOKEDBOAR_MEAT = new Food.Builder().nutrition(10).saturationMod(5f).meat().build();
	
	//Edible Items
	@SuppressWarnings("deprecation")
	public static final Food ANIMAL_HEART = (new Food.Builder().nutrition(1).saturationMod(0.2f).fast().effect((new EffectInstance(Effects.DAMAGE_BOOST, 1200)), 1.0f)
			.effect((new EffectInstance(Effects.MOVEMENT_SPEED, 1200)), 1.0f).alwaysEat().build());

}
