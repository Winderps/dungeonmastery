package com.fingersome.dungeonmasterycore;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import com.fingersome.dungeonmasterycore.block.BlockBreakableBarrel;
import com.fingersome.dungeonmasterycore.block.BlockBreakableCrate;
import com.fingersome.dungeonmasterycore.block.BlockBreakablePot;
import com.fingersome.dungeonmasterycore.block.BlockCampfire;
import com.fingersome.dungeonmasterycore.block.BlockCorpseGrave;
import com.fingersome.dungeonmasterycore.block.BlockCorpseSkeleton;
import com.fingersome.dungeonmasterycore.block.BlockLimboSand;
import com.fingersome.dungeonmasterycore.block.BlockLimboStone;
import com.fingersome.dungeonmasterycore.block.BlockWorldStone;
import com.fingersome.dungeonmasterycore.block.BlockWorldTeleporter;
import com.fingersome.dungeonmasterycore.gui.GuiHandler;
import com.fingersome.dungeonmasterycore.item.ItemWandDM;
import com.fingersome.dungeonmasterycore.item.ItemWandDebugging;
import com.fingersome.dungeonmasterycore.item.ItemWandLimbo;
import com.fingersome.dungeonmasterycore.proxy.CommonProxy;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityAltarPelor;
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
public static Item itemWandLimbo;
public static Item itemCoinGoldLarge;
public static Item itemCoinSilverLarge;
public static Item itemCoinCopperLarge;
public static Item itemCoinGoldSmall;
public static Item itemCoinSilverSmall;
public static Item itemCoinCopperSmall;

public static Block blockLimboSand;
public static Block blockLimboStone;
public static Block blockWorldStone;
public static Block blockWorldTeleporter;
public static Block blockBreakableBarrel;
public static Block blockBreakableCrate;
public static Block blockBreakablePot;
public static Block blockCorpseSkeleton;
public static Block blockCorpseGrave;
public static Block blockCampfire;
public static Block blockAltarPelor;

public static final int dimensionIdLimbo = 2;
	
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
		itemWandDM = new ItemWandDM().setUnlocalizedName("itemWandDM").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWandWhite");
		itemWandDebugging = new ItemWandDebugging().setUnlocalizedName("itemWandDebugging").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWandYellow");
		itemWandLimbo = new Item().setUnlocalizedName("itemWandLimbo").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWandBlack");
		itemCoinGoldLarge = new Item().setUnlocalizedName("itemCoinGoldLarge").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinGoldLarge");
		itemCoinSilverLarge = new Item().setUnlocalizedName("itemCoinSilverLarge").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinSilverLarge");
		itemCoinCopperLarge = new Item().setUnlocalizedName("itemCoinCopperLarge").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinCopperLarge");
		itemCoinGoldSmall = new Item().setUnlocalizedName("itemCoinGoldSmall").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinGoldSmall");
		itemCoinSilverSmall = new Item().setUnlocalizedName("itemCoinSilverSmall").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinSilverSmall");
		itemCoinCopperSmall = new Item().setUnlocalizedName("itemCoinCopperSmall").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinCopperSmall");
		
		GameRegistry.registerItem(itemWandDM, "itemWandDM");
		GameRegistry.registerItem(itemWandDebugging, "itemWandDebugging");
		GameRegistry.registerItem(itemWandLimbo, "itemWandLimbo");
		GameRegistry.registerItem(itemCoinGoldLarge, "itemCoinGoldLarge");
		GameRegistry.registerItem(itemCoinSilverLarge, "itemCoinSilverLarge");
		GameRegistry.registerItem(itemCoinCopperLarge, "itemCoinCopperLarge");
		GameRegistry.registerItem(itemCoinGoldSmall, "itemCoinGoldSmall");
		GameRegistry.registerItem(itemCoinSilverSmall, "itemCoinSilverSmall");
		GameRegistry.registerItem(itemCoinCopperSmall, "itemCoinCopperSmall");
	
		blockLimboSand = new BlockLimboSand().setBlockName("blockLimboSand").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockLimboSand");
		blockLimboStone = new BlockLimboStone().setBlockName("blockLimboStone").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockLimboStone");
		blockWorldTeleporter = new BlockWorldTeleporter().setBlockName("blockWorldTeleporter").setBlockTextureName(CoreReference.MOD_ID + ":" + "blockWorldTeleporter");
		blockWorldStone = new BlockWorldStone().setBlockName("blockWorldStone").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockWorldStone");
		blockBreakableBarrel = new BlockBreakableBarrel().setBlockName("blockBreakableBarrel").setCreativeTab(coreTab);
		blockBreakableCrate = new BlockBreakableCrate().setBlockName("blockBreakableCrate").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockBreakableCrate");
		blockBreakablePot = new BlockBreakablePot().setBlockName("blockBreakablePot").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockBreakablePot");
		blockCorpseSkeleton = new BlockCorpseSkeleton().setBlockName("blockCorpseSkeleton").setCreativeTab(coreTab);
		blockCorpseGrave = new BlockCorpseGrave().setBlockName("blockCorpseGrave").setCreativeTab(coreTab);
		blockCampfire = new BlockCampfire().setLightLevel(0.7F).setBlockName("blockCampfire").setCreativeTab(coreTab);

		GameRegistry.registerBlock(blockLimboSand, "blockLimboSand");
		GameRegistry.registerBlock(blockLimboStone, "blockLimboStone");
		GameRegistry.registerBlock(blockWorldStone, "blockWorldStone");
		GameRegistry.registerBlock(blockWorldTeleporter, "blockWorldTeleporter");
		GameRegistry.registerBlock(blockBreakableBarrel, "blockBreakableBarrel");
		GameRegistry.registerBlock(blockBreakableCrate, "blockBreakableCrate");
		GameRegistry.registerBlock(blockBreakablePot, "blockBreakablePot");
		GameRegistry.registerBlock(blockCorpseSkeleton, "blockCorpseSkeleton");
		GameRegistry.registerBlock(blockCorpseGrave, "blockCorpseGrave");
		GameRegistry.registerBlock(blockCampfire, "blockCampfire");
		GameRegistry.registerBlock(blockAltarPelor, "blockAltarPelor");
		
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
