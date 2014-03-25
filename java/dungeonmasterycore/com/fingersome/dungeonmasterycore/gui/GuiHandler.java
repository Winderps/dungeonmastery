package com.fingersome.dungeonmasterycore.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import com.fingersome.dungeonmasterycore.DungeonMasteryCore;
import com.fingersome.dungeonmasterycore.container.ContainerDummy;
import com.fingersome.dungeonmasterycore.lib.References;

import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler
{

	public GuiHandler()
	{
	NetworkRegistry.INSTANCE.registerGuiHandler(DungeonMasteryCore.instance, this);	
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		switch(ID) 
		{
		default: return null;
		case 0: return new ContainerDummy(player);
		case 1: return new ContainerDummy(player);
		case 2: return new ContainerDummy(player);
		case 3: return new ContainerDummy(player);
		case 4: return new ContainerDummy(player);
		case 5: return new ContainerDummy(player);
		case 6: return new ContainerDummy(player);
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		switch(ID) 
		{
		default: return null;
		case 0: return new GuiCreateCharacterRace(player);
		case 1: return new GuiCreateCharacterClass(player);
		case 2: return new GuiCreateCharacterAttributes(player);
		case 3: return new GuiCreateCharacterSkills(player);
		case 4: return new GuiCreateCharacterFeats1(player);
		case 5: return new GuiCreateCharacterFeats2(player);
		case 6: return new GuiCreateCharacterFeats3(player);
		}
		
	}

}
