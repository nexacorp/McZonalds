package com.nexacorp.mczonalds;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class ModCreativeTab extends CreativeTabs {

	public static final CreativeTabs INSTANCE = new ModCreativeTab();

	private ModCreativeTab() {
		super(ModMain.ID);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ZUP_ZODA);
	}
}
