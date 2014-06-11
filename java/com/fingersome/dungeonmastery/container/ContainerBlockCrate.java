package com.fingersome.dungeonmastery.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.fingersome.dungeonmastery.tileentity.TileEntityBlockBookcase;
import com.fingersome.dungeonmastery.tileentity.TileEntityBlockCrate;

public class ContainerBlockCrate extends Container
{
	
	private TileEntityBlockCrate crate;

	public ContainerBlockCrate(InventoryPlayer invplayer, TileEntityBlockCrate crate)
	{
		this.crate = crate;
		
		for (int x = 0; x < 9; x++) 
		{
			addSlotToContainer(new Slot(invplayer, x, 7 + 18 * x, 55));
		}
		
		for (int x = 0; x < 3; x++) 
		{
			addSlotToContainer(new Slot(crate, x, 61 + 18 * x, 8));
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) 
	{
		return crate.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int i)
	{
		return null;
	}

	
}
