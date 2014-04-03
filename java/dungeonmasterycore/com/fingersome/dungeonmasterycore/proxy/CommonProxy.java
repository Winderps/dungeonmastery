package com.fingersome.dungeonmasterycore.proxy;

import com.fingersome.dungeonmasterycore.DungeonMasteryCore;
import com.fingersome.dungeonmasterycore.container.ContainerCharacterInventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;



public class CommonProxy implements IGuiHandler 
{

	public com.fingersome.dungeonmasterycore.event.KeyHandler keyHandler;

	public void registerHandlers() {}


	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		return null;
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		switch (ID) 
		{
			case DungeonMasteryCore.GuiCharacterInventory: return new ContainerCharacterInventory(player.inventory, !world.isRemote, player);
		}
		return null;
	}

	public World getClientWorld() 
	{
		return null;
	}


	public void registerKeyBindings() {}


	public void registerProxies() 
	{
		
	}

}