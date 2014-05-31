package com.fingersome.dungeonmastery.block;

import com.fingersome.dungeonmastery.lib.BlockInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Blocks
{
	public static BlockBarrel BlockBarrel;
	public static BlockLimboStone BlockLimbostone;
	
	public static void Init()
	{
		BlockBarrel = new BlockBarrel(Material.wood);
		GameRegistry.registerBlock(BlockBarrel, BlockInfo.BLOCK_BARREL_UNLOCALIZED);
		
		BlockLimbostone = new BlockLimboStone(Material.rock);
		GameRegistry.registerBlock(BlockLimbostone, BlockInfo.BLOCK_LIMBOSTONE_UNLOCALIZED);
		
		
	}
	
}
