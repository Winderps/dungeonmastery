package com.fingersome.dungeonmastery.item;

import java.util.List;

import com.fingersome.dungeonmastery.DungeonMastery;
import com.fingersome.dungeonmastery.lib.ModInfo;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSpellAcidSplash extends Item 
{
	public ItemSpellAcidSplash()
	{
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.ITEM_ACIDSPLASH_UNLOCALIZED);
		setTextureName(ModInfo.MOD_ID + ":" + ItemInfo.ITEM_ACIDSPLASH_UNLOCALIZED);
	}

	/**
	 * 	@Override
		public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	    {
	       if (player.isCorrectClass())
	    	   {castSpellAcidSplash();}
	       
		return itemstack;
	    }
	 **/
	
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation)
	{
		info.add("Level 0 Spell");
		info.add("Int vs AC");
		info.add("D4 Damage");
	}
	
}