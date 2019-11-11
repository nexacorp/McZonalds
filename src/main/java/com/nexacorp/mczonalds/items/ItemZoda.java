package com.nexacorp.mczonalds.items;

import com.nexacorp.mczonalds.ModCreativeTab;
import com.nexacorp.mczonalds.ModItems;
import com.nexacorp.mczonalds.ModMain;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemZoda extends Item {

	public enum Contenance {
		FULL, HALF, EMPTY;
	}
	
	private Contenance cont;
	
	public ItemZoda(Contenance cont) {
		this.cont = cont;
		String suffix = "";
		if (cont == Contenance.FULL) {
			suffix = "full";
		} else if (cont == Contenance.HALF) {
			suffix = "half";
		} else {
			suffix = "empty";
		}
		
		setMaxStackSize(1);
		setRegistryName("zoda_" + suffix);
		setUnlocalizedName(ModMain.ID + ".zoda_" + suffix);
		setCreativeTab(ModCreativeTab.INSTANCE);
	}
	
	public Contenance getContenance() {
		return cont;
	}
	
	public int getMaxItemUseDuration(ItemStack stack) {
		return 32;
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase living) {
		ItemZoda item = (ItemZoda) stack.getItem();
		if (item.getContenance() == Contenance.FULL) {
			return new ItemStack(ModItems.ZODA_HALF);
		} else {
			return new ItemStack(ModItems.ZODA_EMPTY);
		}
	}
	
	public EnumAction getItemUseAction(ItemStack stack) {
		ItemZoda item = (ItemZoda) stack.getItem();
		if (item.getContenance() != Contenance.EMPTY) {
			return EnumAction.DRINK;
		} else {
			return super.getItemUseAction(stack);
		}
	}
	
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		ItemStack held = player.getHeldItem(hand);
		ItemZoda item = (ItemZoda) held.getItem();
		if (item.getContenance() != Contenance.EMPTY) {
			player.setActiveHand(hand);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, held);
		} else {
			return super.onItemRightClick(world, player, hand);
		}
	}
	
}
