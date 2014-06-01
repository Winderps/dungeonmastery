package com.fingersome.dungeonmastery.block;

import com.fingersome.dungeonmastery.TileEntity.TileEntityBlockBarrel;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockList
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
	
	public static void RegisterTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityBlockBarrel.class, BlockInfo.TILE_BARREL_KEY);
	}
	
}
