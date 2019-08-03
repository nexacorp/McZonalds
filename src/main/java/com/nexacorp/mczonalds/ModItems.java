package com.nexacorp.mczonalds;

import com.nexacorp.mczonalds.items.ItemZup;

import net.minecraft.item.Item;

public final class ModItems {

	public static final Item ZUP_EMPTY = new ItemZup("empty");
	public static final Item ZUP_WATER = new ItemZup("water");
	public static final Item ZUP_MILK = new ItemZup("milk");
	public static final Item ZUP_ZODA = new ItemZup("zoda");

	public static final Item[] ITEMS = new Item[] {
			ZUP_EMPTY, ZUP_WATER, ZUP_MILK, ZUP_ZODA};
}
