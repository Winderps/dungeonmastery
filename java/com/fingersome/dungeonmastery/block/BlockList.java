package com.fingersome.dungeonmastery.block;

import com.fingersome.dungeonmastery.tileentity.TileEntityBlockBarrel;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockList
{
	//DECLARE ITEMS
	public static BlockLimbostone BlockLimbostone;
	public static BlockLimbosand BlockLimbosand;
	public static BlockWorldstone BlockWorldstone;
	public static BlockDeathstone BlockDeathstone;
	
	public static BlockBarrel BlockBarrel;
	public static BlockPot BlockPot;
	public static BlockCrate BlockCrate;
	public static BlockBookcase BlockBookcase;
	
	public static void Init()
	{
		//INITIALISE ITEMS
		//Death
			BlockLimbosand 	= new BlockLimbosand(Material.sand);
			BlockLimbostone = new BlockLimbostone(Material.rock);
			BlockDeathstone = new BlockDeathstone(Material.rock);
			BlockWorldstone = new BlockWorldstone(Material.rock);
			
		//Storage
			BlockBarrel 	= new BlockBarrel(Material.wood);
			BlockPot 		= new BlockPot(Material.rock);
			BlockCrate 		= new BlockCrate(Material.wood);
			BlockBookcase = new BlockBookcase(Material.wood);
		
			
			
		//REGISTER ITEMS
		//Death
			GameRegistry.registerBlock(BlockLimbosand, BlockInfo.BLOCK_LIMBOSAND_UNLOCALIZED);
			GameRegistry.registerBlock(BlockLimbostone, BlockInfo.BLOCK_LIMBOSTONE_UNLOCALIZED);
			GameRegistry.registerBlock(BlockDeathstone, BlockInfo.BLOCK_DEATHSTONE_UNLOCALIZED);
			GameRegistry.registerBlock(BlockWorldstone, BlockInfo.BLOCK_WORLDSTONE_UNLOCALIZED);
		
		//Storage
			GameRegistry.registerBlock(BlockBarrel, BlockInfo.BLOCK_BARREL_UNLOCALIZED);
			GameRegistry.registerBlock(BlockPot, BlockInfo.BLOCK_POT_UNLOCALIZED);
			GameRegistry.registerBlock(BlockCrate, BlockInfo.BLOCK_CRATE_UNLOCALIZED);
			GameRegistry.registerBlock(BlockBookcase, BlockInfo.BLOCK_BOOKCASE_UNLOCALIZED);
	}
	
	public static void RegisterTileEntities()
	{
		//REGISTER TILEENTITIES
		//Storage
			GameRegistry.registerTileEntity(TileEntityBlockBarrel.class, BlockInfo.TILE_BARREL_KEY);
	}
	
}
