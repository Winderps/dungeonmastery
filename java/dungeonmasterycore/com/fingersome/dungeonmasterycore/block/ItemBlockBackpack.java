package com.fingersome.dungeonmasterycore.block;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBlockBackpack extends Item
{

	public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int side, float x2, float y2, float z2) 
	{		
		if(!world.isRemote)
		{
			world.setBlock(x, y+1, z, BlockList.blockLimboStone);
			System.out.println("yolo");
			
			return true;
		}
		
		return false;
	}
	
}

//why in the flaming fuck doesn't this work =_____=