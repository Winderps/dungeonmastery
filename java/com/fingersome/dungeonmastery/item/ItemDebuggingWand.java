package com.fingersome.dungeonmastery.item;

import java.util.List;

import com.fingersome.dungeonmastery.DungeonMastery;
import com.fingersome.dungeonmastery.lib.ModInfo;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemDebuggingWand extends Item 
{

	public ItemDebuggingWand()
	{
		setCreativeTab(DungeonMastery.tabDM);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.ITEM_WANDDEBUGGING_UNLOCALIZED);
		setTextureName(ModInfo.MOD_ID + ":" + ItemInfo.ITEM_WANDDEBUGGING_UNLOCALIZED);
	}
	
   	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	    {
			
   			//FMLNetworkHandler.openGui(player, DungeonMastery.instance, 0, world, x, y, z);
		 	
			return itemstack;
	    }
	
}
