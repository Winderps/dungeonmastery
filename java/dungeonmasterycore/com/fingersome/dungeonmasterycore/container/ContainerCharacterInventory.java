package com.fingersome.dungeonmasterycore.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerCharacterInventory extends Container 
{

	public ContainerCharacterInventory(InventoryPlayer inventory, boolean b, EntityPlayer player) 
	{

	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) 
	{
		return false;
	}

}
