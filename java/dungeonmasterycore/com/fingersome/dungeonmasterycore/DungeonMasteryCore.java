package com.fingersome.dungeonmasterycore;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.fingersome.dungeonmasterycore.block.BlockAltar;
import com.fingersome.dungeonmasterycore.block.BlockBreakableBarrel;
import com.fingersome.dungeonmasterycore.block.BlockBreakableCrate;
import com.fingersome.dungeonmasterycore.block.BlockBreakablePot;
import com.fingersome.dungeonmasterycore.block.BlockCampfire;
import com.fingersome.dungeonmasterycore.block.BlockCorpseGrave;
import com.fingersome.dungeonmasterycore.block.BlockCorpseSkeleton;
import com.fingersome.dungeonmasterycore.block.BlockLimboSand;
import com.fingersome.dungeonmasterycore.block.BlockLimboStone;
import com.fingersome.dungeonmasterycore.gui.GuiHandler;
import com.fingersome.dungeonmasterycore.item.ItemWandDM;
import com.fingersome.dungeonmasterycore.item.ItemWandDebugging;
import com.fingersome.dungeonmasterycore.proxy.CommonProxy;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCampfire;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseGrave;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseSkeleton;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = CoreReference.MOD_ID, name = CoreReference.MOD_NAME, version = CoreReference.VERSION)

public class DungeonMasteryCore
{

	@Instance
	public static DungeonMasteryCore instance;
	
	@SidedProxy (clientSide="com.fingersome.dungeonmasterycore.proxy.ClientProxy", serverSide="com.fingersome.dungeonmasterycore.proxy.ServerProxy")
	public static CommonProxy proxy;
	
public static Item itemWandDM;
public static Item itemWandDebugging;

public static Block blockLimboSand;
public static Block blockLimboStone;
	
public static Block blockCorpseSkeleton;
public static Block blockCorpseGrave;
public static Block blockCampfire;
public static Block blockAltar;

public static Block blockBreakableBarrel;
public static Block blockBreakableCrate;
public static Block blockBreakablePot;
	
	public static CreativeTabs coreTab = new CreativeTabs("dungeonmasterycoretab")
	{
		public Item getTabIconItem() 
		{
			return DungeonMasteryCore.itemWandDM;
		}		
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		itemWandDM = new ItemWandDM().setUnlocalizedName("itemWandDM").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWandDM");
		itemWandDebugging = new ItemWandDebugging().setUnlocalizedName("itemWandDebugging").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWandDM");
		
		GameRegistry.registerItem(itemWandDM, "itemWandDM");
		GameRegistry.registerItem(itemWandDebugging, "itemWandDebugging");
	
		blockLimboSand = new BlockLimboSand().setBlockName("blockLimboSand").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockLimboSand");
		blockLimboStone = new BlockLimboStone().setBlockName("blockLimboStone").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockLimboStone");
		blockCorpseSkeleton = new BlockCorpseSkeleton().setBlockName("blockCorpseSkeleton").setCreativeTab(coreTab);
		blockCorpseGrave = new BlockCorpseGrave().setBlockName("blockCorpseGrave").setCreativeTab(coreTab);
		blockCampfire = new BlockCampfire().setLightLevel(0.7F).setBlockName("blockCampfire").setCreativeTab(coreTab);
		blockAltar = new BlockAltar().setBlockName("blockAltar").setCreativeTab(coreTab);
		blockBreakableBarrel = new BlockBreakableBarrel().setBlockName("blockBreakableBarrel").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockBreakableBarrel");
		blockBreakableCrate = new BlockBreakableCrate().setBlockName("blockBreakableCrate").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockBreakableCrate");
		blockBreakablePot = new BlockBreakablePot().setBlockName("blockBreakablePot").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockBreakablePot");

		GameRegistry.registerBlock(blockLimboSand, "blockLimboSand");
		GameRegistry.registerBlock(blockLimboStone, "blockLimboStone");
		GameRegistry.registerBlock(blockCorpseSkeleton, "blockCorpseSkeleton");
		GameRegistry.registerBlock(blockCorpseGrave, "blockCorpseGrave");
		GameRegistry.registerBlock(blockCampfire, "blockCampfire");
		GameRegistry.registerBlock(blockAltar, "blockAltar");
		GameRegistry.registerBlock(blockBreakableBarrel, "blockBreakableBarrel");
		GameRegistry.registerBlock(blockBreakableCrate, "blockBreakableCrate");
		GameRegistry.registerBlock(blockBreakablePot, "blockBreakablePot");
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		
		GameRegistry.registerTileEntity(TileEntityCampfire.class, "Campfire");
		GameRegistry.registerTileEntity(TileEntityCorpseGrave.class, "Grave");
		GameRegistry.registerTileEntity(TileEntityCorpseSkeleton.class, "Corpse");
		
		proxy.registerProxies();
	}
	
	@EventHandler
	public void init(FMLPostInitializationEvent e)
	{

	}
	
	@EventHandler
	public void load(FMLPostInitializationEvent e)
	{
		new GuiHandler();
	}
	

	
}
