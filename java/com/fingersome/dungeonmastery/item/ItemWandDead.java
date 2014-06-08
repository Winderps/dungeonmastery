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

public class ItemWandDead extends Item 
{
	public static final int ITEM_SIZE 				= ItemInfo.ITEM_SIZE_MEDIUM;
	public static final int ITEM_WEIGHT				= ItemInfo.ITEM_WEIGHT_MEDIUM;
	public static final	String ITEM_SIZE_KEY		= ItemInfo.ITEM_SIZE_MEDIUM_KEY;
	public static final String ITEM_WEIGHT_KEY		= ItemInfo.ITEM_WEIGHT_MEDIUM_KEY;
	public static final int ITEM_STACK_LIMIT_BASE	= ITEM_SIZE / ITEM_WEIGHT;

	
	public ItemWandDead()
	{
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(ITEM_STACK_LIMIT_BASE);
		setUnlocalizedName(ItemInfo.ITEM_WANDDEAD_UNLOCALIZED);
		setTextureName(ModInfo.MOD_ID + ":" + ItemInfo.ITEM_WANDDEAD_UNLOCALIZED);
	}

	public String directionToNearestWorldstone(EntityPlayer player, World world)
	{
	
		//logic outputs north, south, east or west
		//return direction;
		
		return null;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	    {
	       	//player.addChatMessage("The rod pulls you towards the " + directionToNearestDeathstone(player, world));
	        return itemstack;
	    }
	
	
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation)
	{
		info.add("The rod whispers quietly...");
		
		info.add(ITEM_SIZE_KEY + ", " + ITEM_WEIGHT_KEY);
	}
	
}
