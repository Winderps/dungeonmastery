package com.fingersome.dungeonmastery.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.fingersome.dungeonmastery.lib.ModInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemList
{
	public static Item ItemWandBuild; 
	public static Item ItemWandZone;
	public static Item ItemWandMonster; 
	public static Item ItemWandNPC;  

	public static Item ItemWispSoul;
	public static Item ItemWispLimbo; 
	public static Item ItemWandDead; 
	
	public static Item ItemOreCopper;
	public static Item ItemOreTin;
	public static Item ItemOreLead;
	public static Item ItemOreNickel;
	public static Item ItemOreIron;
	public static Item ItemOreSilver;
	public static Item ItemOreGold;
	public static Item ItemOrePlatinum;  
	
	
	public static void Init()
	{
		ItemWandBuild = new ItemWandBuild();
		GameRegistry.registerItem(ItemWandBuild, ItemInfo.ITEM_WANDBUILD_UNLOCALIZED, ModInfo.MOD_ID);
		
		ItemWandZone = new ItemWandZone();
		GameRegistry.registerItem(ItemWandZone, ItemInfo.ITEM_WANDZONE_UNLOCALIZED, ModInfo.MOD_ID);
		
		ItemWandMonster = new ItemWandMonster();
		GameRegistry.registerItem(ItemWandMonster, ItemInfo.ITEM_WANDMONSTER_UNLOCALIZED, ModInfo.MOD_ID);
		
		ItemWandNPC = new ItemWandNPC();
		GameRegistry.registerItem(ItemWandNPC, ItemInfo.ITEM_WANDNPC_UNLOCALIZED, ModInfo.MOD_ID);

		ItemWispSoul = new ItemWispSoul();
		GameRegistry.registerItem(ItemWispSoul, ItemInfo.ITEM_WISPSOUL_UNLOCALIZED, ModInfo.MOD_ID);

		ItemWispLimbo = new ItemWispLimbo();
		GameRegistry.registerItem(ItemWispLimbo, ItemInfo.ITEM_WISPLIMBO_UNLOCALIZED, ModInfo.MOD_ID);
		
		ItemWandDead = new ItemWandDead();
		GameRegistry.registerItem(ItemWandDead, ItemInfo.ITEM_WANDDEAD_UNLOCALIZED, ModInfo.MOD_ID);

		ItemOreCopper = new ItemOreCopper();
		GameRegistry.registerItem(ItemOreCopper, ItemInfo.ITEM_ORECOPPER_UNLOCALIZED, ModInfo.MOD_ID);
		
		ItemOreTin = new ItemOreTin();
		GameRegistry.registerItem(ItemOreTin, ItemInfo.ITEM_ORETIN_UNLOCALIZED, ModInfo.MOD_ID);
		
		ItemOreLead = new ItemOreLead();
		GameRegistry.registerItem(ItemOreLead, ItemInfo.ITEM_ORELEAD_UNLOCALIZED, ModInfo.MOD_ID);
		
		ItemOreNickel = new ItemOreNickel();
		GameRegistry.registerItem(ItemOreNickel, ItemInfo.ITEM_ORENICKEL_UNLOCALIZED, ModInfo.MOD_ID);
		
		ItemOreIron = new ItemOreIron();
		GameRegistry.registerItem(ItemOreIron, ItemInfo.ITEM_OREIRON_UNLOCALIZED, ModInfo.MOD_ID);
		
		ItemOreSilver = new ItemOreSilver();
		GameRegistry.registerItem(ItemOreSilver, ItemInfo.ITEM_ORESILVER_UNLOCALIZED, ModInfo.MOD_ID);
		
		ItemOreGold = new ItemOreGold();
		GameRegistry.registerItem(ItemOreGold, ItemInfo.ITEM_OREGOLD_UNLOCALIZED, ModInfo.MOD_ID);
		
		ItemOrePlatinum = new ItemOrePlatinum();
		GameRegistry.registerItem(ItemOrePlatinum, ItemInfo.ITEM_OREPLATINUM_UNLOCALIZED, ModInfo.MOD_ID);
	}
	
}
