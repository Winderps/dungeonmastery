package com.fingersome.dungeonmastery.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

import com.fingersome.dungeonmastery.tileentity.TileEntityBlockBookcase;

public class ContainerBlockBookcase extends Container
{
	
	private TileEntityBlockBookcase bookcase;

	public ContainerBlockBookcase(InventoryPlayer invplayer, TileEntityBlockBookcase bookcase)
	{
		this.bookcase = bookcase;
		
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) 
	{
		return bookcase.isUseableByPlayer(player);
	}

}
