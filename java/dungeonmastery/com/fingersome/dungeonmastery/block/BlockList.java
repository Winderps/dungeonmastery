package com.fingersome.dungeonmastery.block;

import com.fingersome.dungeonmastery.tileentity.TileEntityBlockBarrel;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockList
{
	public static BlockLimbostone BlockLimbostone;
	public static BlockLimbosand BlockLimbosand;
	public static BlockBarrel BlockBarrel;
	public static BlockPot BlockPot;
	public static BlockCrate BlockCrate;
	
	public static void Init()
	{
		BlockLimbostone = new BlockLimbostone(Material.rock);
		GameRegistry.registerBlock(BlockLimbostone, BlockInfo.BLOCK_LIMBOSTONE_UNLOCALIZED);
		
		BlockLimbosand = new BlockLimbosand(Material.sand);
		GameRegistry.registerBlock(BlockLimbosand, BlockInfo.BLOCK_LIMBOSAND_UNLOCALIZED);
		
		BlockBarrel = new BlockBarrel(Material.wood);
		GameRegistry.registerBlock(BlockBarrel, BlockInfo.BLOCK_BARREL_UNLOCALIZED);

		BlockPot = new BlockPot(Material.rock);
		GameRegistry.registerBlock(BlockPot, BlockInfo.BLOCK_POT_UNLOCALIZED);

		BlockCrate = new BlockCrate(Material.wood);
		GameRegistry.registerBlock(BlockCrate, BlockInfo.BLOCK_CRATE_UNLOCALIZED);
	}
	
	public static void RegisterTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityBlockBarrel.class, BlockInfo.TILE_BARREL_KEY);
	}
	
}
