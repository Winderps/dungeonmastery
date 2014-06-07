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

public class ItemOrePlatinum extends Item 
{

	public ItemOrePlatinum()
	{
		setCreativeTab(CreativeTabs.tabMaterials);
		setMaxStackSize(16);
		setUnlocalizedName(ItemInfo.ITEM_OREPLATINUM_UNLOCALIZED);
		setTextureName(ModInfo.MOD_ID + ":" + ItemInfo.ITEM_OREPLATINUM_UNLOCALIZED);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation)
	{
		info.add("A hunk of platinum ore");
	}
	
}