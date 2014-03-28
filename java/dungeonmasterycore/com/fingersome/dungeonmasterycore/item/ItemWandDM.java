package com.fingersome.dungeonmasterycore.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.fingersome.dungeonmasterycore.DungeonMasteryCore;
import com.fingersome.dungeonmasterycore.lib.References;

import cpw.mods.fml.common.network.NetworkRegistry;

public class ItemWandDM extends Item
{
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		if(player.isInvisible() == true) {player.setInvisible(false);}
		else player.setInvisible(true);
		
		System.out.println("Poof!");
		return itemstack;
	}
	
	
}

