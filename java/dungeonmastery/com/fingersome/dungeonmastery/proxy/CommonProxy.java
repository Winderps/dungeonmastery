package com.fingersome.dungeonmastery.proxy;

import com.fingersome.dungeonmastery.DungeonMastery;
import com.fingersome.dungeonmastery.container.ContainerCharacterInventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;



public class CommonProxy implements IGuiHandler 
{


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
			case DungeonMastery.GuiCharacterInventory: return new ContainerCharacterInventory(player.inventory, !world.isRemote, player);
		}
		return null;
	}

	public World getClientWorld() 
	{
		return null;
	}


	public void registerProxies() 
	{
		
	}

}