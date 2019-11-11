package com.nexacorp.mczonalds.items;

import javax.annotation.Nullable;

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

// Extends bucket milk to be drinkable
public class ItemZup extends Item {

	private final String fluidName;

	public ItemZup(@Nullable String fluidName) {
		this.fluidName = fluidName;
		
		setMaxStackSize(1);
		setRegistryName("zup_" + fluidName);
		setUnlocalizedName(ModMain.ID + ".zup_" + fluidName);
		setCreativeTab(ModCreativeTab.INSTANCE);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase living) {
		return new ItemStack(ModItems.ZUP_EMPTY);
	}
	
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		ItemStack held = player.getHeldItem(hand);
		ItemZup item = (ItemZup) held.getItem();
		if (!item.getFluidName().equals("empty")) {
			player.setActiveHand(hand);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, held);
		} else {
			return super.onItemRightClick(world, player, hand);
		}
	}
	
	public int getMaxItemUseDuration(ItemStack stack) {
		return 32;
	}
	
	public EnumAction getItemUseAction(ItemStack stack) {
		ItemZup item = (ItemZup) stack.getItem();
		if (!item.getFluidName().equals("empty")) {
			return EnumAction.DRINK;
		} else {
			return super.getItemUseAction(stack);
		}
	}

	public String getFluidName() {
		return fluidName;
	}
}
