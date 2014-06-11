package com.fingersome.dungeonmastery.container;

import com.fingersome.dungeonmastery.item.ItemInfo;
import com.fingersome.dungeonmastery.item.ItemList;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBook;
import net.minecraft.item.ItemStack;

public class SlotBookcase extends Slot
{

	public SlotBookcase(IInventory inventory, int id, int x, int y) 
	{
		super(inventory, id, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack itemstack)
	{
		return true;
		// if (itemstack.??? == itemIWantToLimitSlotToContain)
		// 		{return true);
		// else
		// 		{return false);
	}

}
