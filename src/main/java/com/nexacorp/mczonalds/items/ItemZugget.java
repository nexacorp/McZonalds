package com.nexacorp.mczonalds.items;

import com.nexacorp.mczonalds.ModCreativeTab;
import com.nexacorp.mczonalds.ModMain;

import net.minecraft.item.ItemFood;

public class ItemZugget extends ItemFood {

	private final boolean cooked;
	
	public ItemZugget(boolean cooked) {
		super(3, 2.5f, false);
		this.cooked = cooked;
		String name = cooked ? "zugget_cooked" : "zugget_raw";
		setRegistryName(name);
		setUnlocalizedName(ModMain.ID + "." + name);
		setCreativeTab(ModCreativeTab.INSTANCE);
	}
	
	public boolean isCooked() {
		return cooked;
	}
	
}
