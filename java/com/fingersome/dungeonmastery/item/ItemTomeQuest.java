package com.fingersome.dungeonmastery.item;

import com.fingersome.dungeonmastery.DungeonMastery;
import com.fingersome.dungeonmastery.lib.ModInfo;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTomeQuest extends Item 
{
	public ItemTomeQuest()
	{
		setCreativeTab(DungeonMastery.tabDM);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.ITEM_TOMEQUEST_UNLOCALIZED);
		setTextureName(ModInfo.MOD_ID + ":" + ItemInfo.ITEM_TOMEQUEST_UNLOCALIZED);
	}

	/**
	 * 	@Override
		public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	    {
	       if (player.isSneaking())
	    	   {FMLNetworkHandler.openGui(player, DungeonMastery.instance, 3, world, x, y, z);}
	       
		return itemstack;
	    }
	 **/
	
}