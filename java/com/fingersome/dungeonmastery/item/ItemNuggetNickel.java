package com.fingersome.dungeonmastery.item;

import java.util.List;

import com.fingersome.dungeonmastery.lib.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemNuggetNickel extends Item 
{

	public ItemNuggetNickel()
	{
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(ItemInfo.ITEM_SIZE_SMALL);
		setUnlocalizedName(ItemInfo.ITEM_NUGGETNICKEL_UNLOCALIZED);
		setTextureName(ModInfo.MOD_ID + ":" + ItemInfo.ITEM_NUGGETNICKEL_UNLOCALIZED);
	}
	
}
