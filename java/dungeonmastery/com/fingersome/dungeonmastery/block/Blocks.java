package com.fingersome.dungeonmastery.block;

import com.fingersome.dungeonmastery.lib.BlockInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Blocks
{
	public static BlockBarrel BlockLimboStone;
	
	
	public static void Init()
	{
	//Initialize blocks
		BlockLimboStone = new BlockBarrel(Material.rock);
		
	//Register blocks
		GameRegistry.registerBlock(BlockLimboStone, BlockInfo.BLOCK_LIMBOSTONE_UNLOCALIZED);
	
	}
	
}
