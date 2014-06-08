package com.fingersome.dungeonmastery.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

import com.fingersome.dungeonmastery.tileentity.TileEntityBlockBookcase;
import com.fingersome.dungeonmastery.tileentity.TileEntityBlockCrate;

public class ContainerBlockCrate extends Container
{
	
	private TileEntityBlockCrate crate;

	public ContainerBlockCrate(InventoryPlayer invplayer, TileEntityBlockCrate crate)
	{
		this.crate = crate;
		
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) 
	{
		return crate.isUseableByPlayer(player);
	}

}
