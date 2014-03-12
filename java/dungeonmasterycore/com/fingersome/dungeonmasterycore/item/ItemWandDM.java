package com.fingersome.dungeonmasterycore.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.fingersome.dungeonmasterycore.CoreReference;
import com.fingersome.dungeonmasterycore.DungeonMasteryCore;

import cpw.mods.fml.common.network.NetworkRegistry;

public class ItemWandDM extends Item
{
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		player.setInvisible(true);
	
		return itemstack;
	}
	
}

