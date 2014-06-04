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
	}
	
}
