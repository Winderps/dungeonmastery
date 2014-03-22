package com.fingersome.dungeonmasterycore;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import com.fingersome.dungeonmasterycore.block.BlockBackpack;
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
import com.fingersome.dungeonmasterycore.tileentity.TileEntityBackpack;
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
public static Item itemWeaponDagger;
public static Item itemWeaponRapier;
public static Item itemWeaponScimitar;
public static Item itemWeaponShortsword;
public static Item itemWeaponBastardsword;
public static Item itemWeaponLongsword;
public static Item itemWeaponGreatsword;
public static Item itemAstralDiamondLarge;
public static Item itemCoinPlatinumLarge;
public static Item itemCoinGoldLarge;
public static Item itemCoinSilverLarge;
public static Item itemCoinCopperLarge;
public static Item itemAstralDiamondSmall;
public static Item itemCoinPlatinumSmall;
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
public static Block blockBackpack;

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
		itemWeaponDagger = new Item().setUnlocalizedName("itemWeaponDagger").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWeaponDagger");
		itemWeaponRapier = new Item().setUnlocalizedName("itemWeaponRapier").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWeaponRapier");
		itemWeaponScimitar = new Item().setUnlocalizedName("itemWeaponScimitar").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWeaponScimitar");
		itemWeaponShortsword = new Item().setUnlocalizedName("itemWeaponShortsword").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWeaponShortsword");
		itemWeaponBastardsword = new Item().setUnlocalizedName("itemWeaponBastardsword").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWeaponBastardsword");
		itemWeaponLongsword = new Item().setUnlocalizedName("itemWeaponLongsword").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWeaponLongsword");
		itemWeaponGreatsword = new Item().setUnlocalizedName("itemWeaponGreatsword").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemWeaponGreatsword");
		itemAstralDiamondLarge = new Item().setUnlocalizedName("itemAstralDiamondLarge").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemAstralDiamondLarge");
		itemCoinPlatinumLarge = new Item().setUnlocalizedName("itemCoinPlatinumLarge").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinPlatinumLarge");
		itemCoinGoldLarge = new Item().setUnlocalizedName("itemCoinGoldLarge").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinGoldLarge");
		itemCoinSilverLarge = new Item().setUnlocalizedName("itemCoinSilverLarge").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinSilverLarge");
		itemCoinCopperLarge = new Item().setUnlocalizedName("itemCoinCopperLarge").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinCopperLarge");
		itemAstralDiamondSmall = new Item().setUnlocalizedName("itemAstralDiamondSmall").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemAstralDiamondSmall");
		itemCoinPlatinumSmall = new Item().setUnlocalizedName("itemCoinPlatinumSmall").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinPlatinumSmall");
		itemCoinGoldSmall = new Item().setUnlocalizedName("itemCoinGoldSmall").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinGoldSmall");
		itemCoinSilverSmall = new Item().setUnlocalizedName("itemCoinSilverSmall").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinSilverSmall");
		itemCoinCopperSmall = new Item().setUnlocalizedName("itemCoinCopperSmall").setCreativeTab(coreTab).setTextureName(CoreReference.MOD_ID + ":" + "itemCoinCopperSmall");
		
		GameRegistry.registerItem(itemWandDM, "itemWandDM");
		GameRegistry.registerItem(itemWandDebugging, "itemWandDebugging");
		GameRegistry.registerItem(itemWandLimbo, "itemWandLimbo");
		GameRegistry.registerItem(itemWeaponDagger, "itemWeaponDagger");
		GameRegistry.registerItem(itemWeaponRapier, "itemWeaponRapier");
		GameRegistry.registerItem(itemWeaponScimitar, "itemWeaponScimitar");
		GameRegistry.registerItem(itemWeaponShortsword, "itemWeaponShortsword");
		GameRegistry.registerItem(itemWeaponBastardsword, "itemWeaponBastardsword");
		GameRegistry.registerItem(itemWeaponLongsword, "itemWeaponLongsword");
		GameRegistry.registerItem(itemWeaponGreatsword, "itemWeaponGreatsword");
		GameRegistry.registerItem(itemAstralDiamondLarge, "itemAstralDiamondLarge");
		GameRegistry.registerItem(itemCoinPlatinumLarge, "itemCoinPlatinumLarge");
		GameRegistry.registerItem(itemCoinGoldLarge, "itemCoinGoldLarge");
		GameRegistry.registerItem(itemCoinSilverLarge, "itemCoinSilverLarge");
		GameRegistry.registerItem(itemCoinCopperLarge, "itemCoinCopperLarge");
		GameRegistry.registerItem(itemAstralDiamondSmall, "itemAstralDiamondSmall");
		GameRegistry.registerItem(itemCoinPlatinumSmall, "itemCoinPlatinumSmall");
		GameRegistry.registerItem(itemCoinGoldSmall, "itemCoinGoldSmall");
		GameRegistry.registerItem(itemCoinSilverSmall, "itemCoinSilverSmall");
		GameRegistry.registerItem(itemCoinCopperSmall, "itemCoinCopperSmall");
	
		blockLimboSand = new BlockLimboSand().setBlockName("blockLimboSand").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockLimboSand");
		blockLimboStone = new BlockLimboStone().setBlockName("blockLimboStone").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockLimboStone");
		//blockWorldTeleporter = new BlockWorldTeleporter().setBlockName("blockWorldTeleporter").setBlockTextureName(CoreReference.MOD_ID + ":" + "blockWorldTeleporter");
		blockWorldStone = new BlockWorldStone().setBlockName("blockWorldStone").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockWorldStone");
		blockBreakableBarrel = new BlockBreakableBarrel().setBlockName("blockBreakableBarrel").setCreativeTab(coreTab);
		blockBreakableCrate = new BlockBreakableCrate().setBlockName("blockBreakableCrate").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockBreakableCrate");
		blockBreakablePot = new BlockBreakablePot().setBlockName("blockBreakablePot").setCreativeTab(coreTab).setBlockTextureName(CoreReference.MOD_ID + ":" + "blockBreakablePot");
		blockCorpseSkeleton = new BlockCorpseSkeleton().setBlockName("blockCorpseSkeleton").setCreativeTab(coreTab);
		blockCorpseGrave = new BlockCorpseGrave().setBlockName("blockCorpseGrave").setCreativeTab(coreTab);
		blockCampfire = new BlockCampfire().setLightLevel(0.7F).setBlockName("blockCampfire").setCreativeTab(coreTab);
		blockBackpack = new BlockBackpack().setBlockName("blockBackpack").setCreativeTab(coreTab);
		
		GameRegistry.registerBlock(blockLimboSand, "blockLimboSand");
		GameRegistry.registerBlock(blockLimboStone, "blockLimboStone");
		GameRegistry.registerBlock(blockWorldStone, "blockWorldStone");
		//GameRegistry.registerBlock(blockWorldTeleporter, "blockWorldTeleporter");
		GameRegistry.registerBlock(blockBreakableBarrel, "blockBreakableBarrel");
		GameRegistry.registerBlock(blockBreakableCrate, "blockBreakableCrate");
		GameRegistry.registerBlock(blockBreakablePot, "blockBreakablePot");
		GameRegistry.registerBlock(blockCorpseSkeleton, "blockCorpseSkeleton");
		GameRegistry.registerBlock(blockCorpseGrave, "blockCorpseGrave");
		GameRegistry.registerBlock(blockCampfire, "blockCampfire");
		GameRegistry.registerBlock(blockBackpack, "blockBackpack");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		
		GameRegistry.registerTileEntity(TileEntityCampfire.class, "Campfire");
		GameRegistry.registerTileEntity(TileEntityCorpseGrave.class, "Grave");
		GameRegistry.registerTileEntity(TileEntityCorpseSkeleton.class, "Corpse");
		GameRegistry.registerTileEntity(TileEntityBackpack.class, "Backpack");
		
		
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
