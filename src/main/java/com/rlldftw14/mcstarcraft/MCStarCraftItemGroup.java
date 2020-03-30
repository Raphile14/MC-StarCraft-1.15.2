package com.rlldftw14.mcstarcraft;

import com.rlldftw14.mcstarcraft.init.ModItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MCStarCraftItemGroup extends ItemGroup {
	
	public MCStarCraftItemGroup(String label) {
		super(label);
	}
	
	@Override
	public ItemStack createIcon() {
		return new ItemStack(ModItemInit.zerg_drone_egg.get());
	}
		
}