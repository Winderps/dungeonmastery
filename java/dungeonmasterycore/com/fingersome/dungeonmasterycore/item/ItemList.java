package com.fingersome.dungeonmasterycore.item;

import com.fingersome.dungeonmasterycore.lib.References;
import com.fingersome.dungeonmasterycore.DungeonMasteryCore;

import net.minecraft.item.Item;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


public class ItemList
{
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
    
    private static boolean isInitialized = false;
    
    public static void preInit(FMLPreInitializationEvent e)
    {
        if (!isInitialized)
        {
        	itemWandDM = new ItemWandDM().setUnlocalizedName("itemWandDM").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemWandWhite");
    		itemWandDebugging = new ItemWandDebugging().setUnlocalizedName("itemWandDebugging").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemWandYellow");
    		itemWandLimbo = new Item().setUnlocalizedName("itemWandLimbo").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemWandBlack");
    		itemWeaponDagger = new Item().setUnlocalizedName("itemWeaponDagger").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemWeaponDagger");
    		itemWeaponRapier = new Item().setUnlocalizedName("itemWeaponRapier").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemWeaponRapier");
    		itemWeaponScimitar = new Item().setUnlocalizedName("itemWeaponScimitar").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemWeaponScimitar");
    		itemWeaponShortsword = new Item().setUnlocalizedName("itemWeaponShortsword").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemWeaponShortsword");
    		itemWeaponBastardsword = new Item().setUnlocalizedName("itemWeaponBastardsword").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemWeaponBastardsword");
    		itemWeaponLongsword = new Item().setUnlocalizedName("itemWeaponLongsword").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemWeaponLongsword");
    		itemWeaponGreatsword = new Item().setUnlocalizedName("itemWeaponGreatsword").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemWeaponGreatsword");
    		itemAstralDiamondLarge = new Item().setUnlocalizedName("itemAstralDiamondLarge").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemAstralDiamondLarge");
    		itemCoinPlatinumLarge = new Item().setUnlocalizedName("itemCoinPlatinumLarge").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemCoinPlatinumLarge");
    		itemCoinGoldLarge = new Item().setUnlocalizedName("itemCoinGoldLarge").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemCoinGoldLarge");
    		itemCoinSilverLarge = new Item().setUnlocalizedName("itemCoinSilverLarge").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemCoinSilverLarge");
    		itemCoinCopperLarge = new Item().setUnlocalizedName("itemCoinCopperLarge").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemCoinCopperLarge");
    		itemAstralDiamondSmall = new Item().setUnlocalizedName("itemAstralDiamondSmall").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemAstralDiamondSmall");
    		itemCoinPlatinumSmall = new Item().setUnlocalizedName("itemCoinPlatinumSmall").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemCoinPlatinumSmall");
    		itemCoinGoldSmall = new Item().setUnlocalizedName("itemCoinGoldSmall").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemCoinGoldSmall");
    		itemCoinSilverSmall = new Item().setUnlocalizedName("itemCoinSilverSmall").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemCoinSilverSmall");
    		itemCoinCopperSmall = new Item().setUnlocalizedName("itemCoinCopperSmall").setCreativeTab(DungeonMasteryCore.coreTab).setTextureName(References.MOD_ID + ":" + "itemCoinCopperSmall");
    		
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
            
            isInitialized = true;
        }
    }
}