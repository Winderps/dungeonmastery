package com.fingersome.dungeonmastery.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.fingersome.dungeonmastery.DungeonMastery;
import com.fingersome.dungeonmastery.container.ContainerCharacterInventory;
import com.fingersome.dungeonmastery.container.ContainerCreateCharacterAttributes;
import com.fingersome.dungeonmastery.container.ContainerCreateCharacterClass;
import com.fingersome.dungeonmastery.container.ContainerCreateCharacterFeats1;
import com.fingersome.dungeonmastery.container.ContainerCreateCharacterFeats2;
import com.fingersome.dungeonmastery.container.ContainerCreateCharacterFeats3;
import com.fingersome.dungeonmastery.container.ContainerCreateCharacterRace;
import com.fingersome.dungeonmastery.container.ContainerCreateCharacterSkills;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler
{

	public GuiHandler()
	{
	NetworkRegistry.INSTANCE.registerGuiHandler(DungeonMastery.instance, this);	
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		switch(ID) 
		{
		default: return null;
		case 0: return new ContainerCreateCharacterRace			(player);
		case 1: return new ContainerCreateCharacterClass		(player);
		case 2: return new ContainerCreateCharacterAttributes	(player);
		case 3: return new ContainerCreateCharacterSkills		(player);
		case 4: return new ContainerCreateCharacterFeats1		(player);
		case 5: return new ContainerCreateCharacterFeats2		(player);
		case 6: return new ContainerCreateCharacterFeats3		(player);
		case 7: return new ContainerCharacterInventory		(null, false, player);

		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		switch(ID) 
		{
		default: return null;
		case 0: return new GuiCreateCharacterRace		(player);
		case 1: return new GuiCreateCharacterClass		(player);
		case 2: return new GuiCreateCharacterAttributes	(player);
		case 3: return new GuiCreateCharacterSkills		(player);
		case 4: return new GuiCreateCharacterFeats1		(player);
		case 5: return new GuiCreateCharacterFeats2		(player);
		case 6: return new GuiCreateCharacterFeats3		(player);
		case 7: return new GuiCharacterInventory		(player);
		
		}
		
	}

}
