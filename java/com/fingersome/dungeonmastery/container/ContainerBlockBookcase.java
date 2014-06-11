package com.fingersome.dungeonmastery.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.fingersome.dungeonmastery.tileentity.TileEntityBlockBookcase;

public class ContainerBlockBookcase extends Container
{
	
	private TileEntityBlockBookcase bookcase;

	public ContainerBlockBookcase(InventoryPlayer invplayer, TileEntityBlockBookcase bookcase)
	{
		this.bookcase = bookcase;
		for (int x = 0; x < 9; x++) 
		{
			addSlotToContainer(new Slot(invplayer, x, 7 + 18 * x, 55));
		}
		
		for (int x = 0; x < 9; x++) 
		{
			addSlotToContainer(new SlotBookcase(bookcase, x, 7 + 18 * x, 8));
		}
		
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) 
	{
		return bookcase.isUseableByPlayer(player);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i)
	{
		return null;
	}

}
