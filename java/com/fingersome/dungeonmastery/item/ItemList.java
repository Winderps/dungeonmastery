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
	//DECLARE ITEMS
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
		//INITIALISE ITEMS
		//DM Tools
			ItemWandBuild 	= new ItemWandBuild();
			ItemWandZone 	= new ItemWandZone();
			ItemWandMonster = new ItemWandMonster();
			ItemWandNPC 	= new ItemWandNPC();
		
		//Consumables
			ItemWispLimbo 	= new ItemWispLimbo();
		
		//Death
			ItemWispSoul 	= new ItemWispSoul();
			ItemWandDead 	= new ItemWandDead();
		
		//Crafting and Materials
			ItemOreCopper 	= new ItemOreCopper();
			ItemOreTin 		= new ItemOreTin();
			ItemOreLead 	= new ItemOreLead();
			ItemOreNickel 	= new ItemOreNickel();
			ItemOreIron 	= new ItemOreIron();
			ItemOreSilver 	= new ItemOreSilver();
			ItemOreGold 	= new ItemOreGold();
			ItemOrePlatinum = new ItemOrePlatinum();
			
			
			
		//REGISTER ITEMS
		//DM Tools
			GameRegistry.registerItem(ItemWandBuild, ItemInfo.ITEM_WANDBUILD_UNLOCALIZED, ModInfo.MOD_ID);
			GameRegistry.registerItem(ItemWandZone, ItemInfo.ITEM_WANDZONE_UNLOCALIZED, ModInfo.MOD_ID);
			GameRegistry.registerItem(ItemWandMonster, ItemInfo.ITEM_WANDMONSTER_UNLOCALIZED, ModInfo.MOD_ID);
			GameRegistry.registerItem(ItemWandNPC, ItemInfo.ITEM_WANDNPC_UNLOCALIZED, ModInfo.MOD_ID);
		
		//Consumables
			GameRegistry.registerItem(ItemWispLimbo, ItemInfo.ITEM_WISPLIMBO_UNLOCALIZED, ModInfo.MOD_ID);
		
		//Death
			GameRegistry.registerItem(ItemWispSoul, ItemInfo.ITEM_WISPSOUL_UNLOCALIZED, ModInfo.MOD_ID);
			GameRegistry.registerItem(ItemWandDead, ItemInfo.ITEM_WANDDEAD_UNLOCALIZED, ModInfo.MOD_ID);
		
		//Crafting and Materials
			GameRegistry.registerItem(ItemOreCopper, ItemInfo.ITEM_ORECOPPER_UNLOCALIZED, ModInfo.MOD_ID);
			GameRegistry.registerItem(ItemOreTin, ItemInfo.ITEM_ORETIN_UNLOCALIZED, ModInfo.MOD_ID);
			GameRegistry.registerItem(ItemOreLead, ItemInfo.ITEM_ORELEAD_UNLOCALIZED, ModInfo.MOD_ID);
			GameRegistry.registerItem(ItemOreNickel, ItemInfo.ITEM_ORENICKEL_UNLOCALIZED, ModInfo.MOD_ID);
			GameRegistry.registerItem(ItemOreIron, ItemInfo.ITEM_OREIRON_UNLOCALIZED, ModInfo.MOD_ID);
			GameRegistry.registerItem(ItemOreSilver, ItemInfo.ITEM_ORESILVER_UNLOCALIZED, ModInfo.MOD_ID);
			GameRegistry.registerItem(ItemOreGold, ItemInfo.ITEM_OREGOLD_UNLOCALIZED, ModInfo.MOD_ID);
			GameRegistry.registerItem(ItemOrePlatinum, ItemInfo.ITEM_OREPLATINUM_UNLOCALIZED, ModInfo.MOD_ID);
	}
	
}
