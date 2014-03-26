package com.fingersome.dungeonmasterycore.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;


public class ContainerCreateCharacterSkills extends Container 
{

	public ContainerCreateCharacterSkills(EntityPlayer player)
	{
		
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) 
	{
		return true;
	}

}
