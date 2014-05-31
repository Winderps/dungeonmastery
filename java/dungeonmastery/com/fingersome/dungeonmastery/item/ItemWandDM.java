package com.fingersome.dungeonmastery.item;

import com.fingersome.dungeonmastery.lib.ItemInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWandDM extends Item
{

	public ItemWandDM()
	{
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.ITEM_WANDDM_UNLOCALIZED);
	}
	
	@SideOnly(Side.CLIENT)
	public void RegisterIcons(IIconRegister registericons)
	{
		itemIcon = registericons.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.ITEM_WANDDM_ICON);
	}
	
}
