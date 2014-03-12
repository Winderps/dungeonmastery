package com.fingersome.dungeonmasterycore.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.fingersome.dungeonmasterycore.CoreReference;

public class ItemWandDebugging extends Item
{

	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		player.openGui(CoreReference.MOD_ID, 0, world, (int)player.posX, (int)player.posY, (int)player.posZ);
		return itemstack;
	}
	
	
}
