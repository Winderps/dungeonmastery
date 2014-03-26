package com.fingersome.dungeonmasterycore.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;


public class ContainerCreateCharacterClass extends Container 
{

	public ContainerCreateCharacterClass(EntityPlayer player)
	{
		
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) 
	{
		return true;
	}

}
