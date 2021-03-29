package io.github.kirbocabana.yggdrasil.client.util;

import java.util.function.Supplier;

import io.github.kirbocabana.yggdrasil.core.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ModItemTier implements IItemTier{
	ADAMANTITE(6, 0, 15f, 2f, 20, () -> Ingredient.of(ItemInit.ADAMANTITE_INGOT.get())),
	LEVIATHAN(6, 0, 15f, 2f, 20, () -> Ingredient.of(ItemInit.ADAMANTITE_INGOT.get())), //FILLER VALUES
	DWARFSTEEL(6, 0, 15f, 2f, 20, () -> Ingredient.of(ItemInit.DWARF_INGOT.get())); //FILLER VALUES

	private final int level;
	private final int uses;
	private final float speed;
	private final float attackDamageBonus;
	private final int enchantmentValue;
	private final Ingredient repairIngredient;

	ModItemTier(int level, int uses, float speed, float attackDamageBonus, int enchantmentValue,
			Supplier<Ingredient> repairIngredient) {
		this.level = level;
		this.uses = uses;
		this.speed = speed;
		this.attackDamageBonus = attackDamageBonus;
		this.enchantmentValue = enchantmentValue;
		this.repairIngredient = repairIngredient.get();
	}

	@Override
	public int getUses() {
		return this.uses;
	}

	@Override
	public float getSpeed() {
		return this.speed;
	}

	@Override
	public float getAttackDamageBonus() {
		return this.attackDamageBonus;
	}

	@Override
	public int getLevel() {
		return this.level;
	}
	
	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}
}