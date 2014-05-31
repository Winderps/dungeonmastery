package com.fingersome.dungeonmastery.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.fingersome.dungeonmastery.lib.ItemInfo;
import com.fingersome.dungeonmastery.lib.ModInfo;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Items
{
	public static Item ItemWandDM; 
	
	public static void Init()
	{
		ItemWandDM = new ItemWandDM();
		GameRegistry.registerItem(ItemWandDM, ItemInfo.ITEM_WANDDM_UNLOCALIZED, ModInfo.MOD_ID);
	}
	
}
