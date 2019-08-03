package com.nexacorp.mczonalds.items;

import javax.annotation.Nullable;

import com.nexacorp.mczonalds.ModCreativeTab;

import net.minecraft.item.Item;

public class ItemZup extends Item {

	private final String fluidName;

	public ItemZup(@Nullable String fluidName) {
		this.fluidName = fluidName;
		
		setRegistryName("zup_" + fluidName);
		setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(ModCreativeTab.INSTANCE);
	}

	public String getFluidName() {
		return fluidName;
	}
}
