package com.fingersome.dungeonmasterycore.lib;

import java.util.HashMap;

import com.fingersome.dungeonmasterycore.container.InventoryCharacter;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class PlayerHandler 
{
	private static HashMap<String,InventoryCharacter> playerCharacter = new HashMap<String,InventoryCharacter>();
	
	public static InventoryCharacter getInventoryCharacter(EntityPlayer player) 
	{
		if (!playerCharacter.containsKey(player.getCommandSenderName())) 
		{
			InventoryCharacter inventory = new InventoryCharacter(player);
			playerCharacter.put(player.getCommandSenderName(), inventory);
		}
		return playerCharacter.get(player.getCommandSenderName());
	}
	
	public static void setInventoryCharacter(EntityPlayer player, InventoryCharacter inventory) 
	{
		playerCharacter.put(player.getCommandSenderName(), inventory);
	}
	
	public static void updateInventoryCharacter(EntityPlayer player) 
	{
		InventoryCharacter inventory = getInventoryCharacter(player);
		inventory.saveNBT(player);
	}
	
	public static void loadInventoryCharacter(EntityPlayer player) 
	{
		NBTTagCompound data = player.getEntityData();        
		if (!data.hasKey("Character")) {
			data.setTag("Character", new NBTTagCompound());  
		}
		InventoryCharacter inventory = new InventoryCharacter(player);
		inventory.readNBT(player);
		playerCharacter.put(player.getCommandSenderName(), inventory);
		updateInventoryCharacter(player);
	}
}