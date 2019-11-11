package com.nexacorp.mczonalds;

import com.nexacorp.mczonalds.items.ItemZoda;
import com.nexacorp.mczonalds.items.ItemZugget;
import com.nexacorp.mczonalds.items.ItemZup;

import net.minecraft.item.Item;

public final class ModItems {

	public static final Item ZUP_EMPTY = new ItemZup("empty");
	public static final Item ZUP_WATER = new ItemZup("water");
	public static final Item ZUP_MILK = new ItemZup("milk");
	public static final Item ZUP_ZODA = new ItemZup("zoda");
	public static final Item ZODA_FULL = new ItemZoda(ItemZoda.Contenance.FULL);
	public static final Item ZODA_HALF = new ItemZoda(ItemZoda.Contenance.HALF);
	public static final Item ZODA_EMPTY = new ItemZoda(ItemZoda.Contenance.EMPTY);
	public static final Item ZUGGET_COOKED = new ItemZugget(true);
	public static final Item ZUGGET_RAW = new ItemZugget(false);

	public static final Item[] ITEMS = new Item[] {
			ZUP_EMPTY, ZUP_WATER, ZUP_MILK, ZUP_ZODA,
			ZODA_FULL, ZODA_HALF, ZODA_EMPTY,
			ZUGGET_COOKED, ZUGGET_RAW
		};
}
