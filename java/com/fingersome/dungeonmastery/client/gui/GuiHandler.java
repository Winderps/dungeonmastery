package com.fingersome.dungeonmastery.client.gui;

import com.fingersome.dungeonmastery.DungeonMastery;
import com.fingersome.dungeonmastery.container.ContainerBlockBookcase;
import com.fingersome.dungeonmastery.lib.ModInfo;
import com.fingersome.dungeonmastery.tileentity.TileEntityBlockBookcase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
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
		case 0: TileEntity te = world.getTileEntity(x, y, z);
			if(te != null && te instanceof TileEntityBlockBookcase)
				{return new ContainerBlockBookcase(player.inventory, (TileEntityBlockBookcase)te);}
			break;
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		switch(ID)
		{
		case 0: TileEntity te = world.getTileEntity(x, y, z);
			if(te != null && te instanceof TileEntityBlockBookcase)
				{return new GuiBlockBookcase(player.inventory, (TileEntityBlockBookcase)te);}
			break;
		}
		
		return null;
	}

}
