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

public class ItemIngotCopper extends Item 
{
	public static final int ITEM_SIZE 			= ItemInfo.ITEM_SIZE_SMALL;
	public static final int ITEM_WEIGHT			= ItemInfo.ITEM_WEIGHT_MEDIUM;
	public static final	String ITEM_SIZE_KEY	= ItemInfo.ITEM_SIZE_SMALL_KEY;
	public static final String ITEM_WEIGHT_KEY	= ItemInfo.ITEM_WEIGHT_MEDIUM_KEY;
	public static final int ITEM_STACK_LIMIT	= ITEM_SIZE / ITEM_WEIGHT;
	
	
	public ItemIngotCopper()
	{
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(ItemInfo.ITEM_SIZE_MEDIUM);
		setUnlocalizedName(ItemInfo.ITEM_INGOTCOPPER_UNLOCALIZED);
		setTextureName(ModInfo.MOD_ID + ":" + ItemInfo.ITEM_INGOTCOPPER_UNLOCALIZED);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation)
	{
		
		
		info.add(ITEM_SIZE_KEY + ", " + ITEM_WEIGHT_KEY);
	}
	
}
