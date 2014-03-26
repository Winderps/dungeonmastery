package com.fingersome.dungeonmasterycore.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;


public class ContainerCreateCharacterAttributes extends Container 
{

	public ContainerCreateCharacterAttributes(EntityPlayer player)
	{
		
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) 
	{
		return true;
	}

}
