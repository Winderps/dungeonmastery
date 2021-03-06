package com.fingersome.dungeonmastery.item;

import java.util.List;

import com.fingersome.dungeonmastery.DungeonMastery;
import com.fingersome.dungeonmastery.lib.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemWispSoul extends Item 
{
	public static final int ITEM_SIZE 				= ItemInfo.ITEM_SIZE_SMALL;
	public static final int ITEM_WEIGHT				= ItemInfo.ITEM_WEIGHT_HEAVY;
	public static final	String ITEM_SIZE_KEY		= ItemInfo.ITEM_SIZE_SMALL_KEY;
	public static final String ITEM_WEIGHT_KEY		= ItemInfo.ITEM_WEIGHT_HEAVY_KEY;
	public static final int ITEM_STACK_LIMIT		= ITEM_SIZE / ITEM_WEIGHT *2;
	
	private IIcon wispIcon;
	private IIcon bladeIcon;
	
	@SuppressWarnings("unused")
	public ItemWispSoul()
	{
		setCreativeTab(DungeonMastery.tabCharacter);
			if(ITEM_STACK_LIMIT < 1) {setMaxStackSize(1);}
			else {setMaxStackSize(ITEM_STACK_LIMIT);}
		setUnlocalizedName(ItemInfo.ITEM_WISPSOUL_UNLOCALIZED);
		setTextureName(ModInfo.MOD_ID + ":" + ItemInfo.ITEM_WISPSOUL_UNLOCALIZED);
	}
	
    public String directionToNearestWorldstone(EntityPlayer player, World world, ItemStack itemstack)
	{
		/**	
		 * if(itemstack.getItemDamage() == 0)
		 * {
		 * logic outputs north, south, east or west
		 * 		return direction;
		 * }
		 * else 
		 * 		{return null;}
    	*/
		return null;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	    {
			//player.addChatComponentMessage(ChatComponentText(player.getDisplayName() + " is testing chat messages"));
	       	//+ directionToNearestWorldstone(player, world)
		 	if (player.isSneaking() && itemstack.getItemDamage() == 0)
		 		{itemstack.setItemDamage(itemstack.getItemDamage() + 1);}
		 	
		 	 else if (player.isSneaking() && itemstack.getItemDamage() == 1)
				{itemstack.setItemDamage(itemstack.getItemDamage() -1);}
		 	
			return itemstack;
	    }
	 
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister register)
	{
		wispIcon 		= register.registerIcon(ModInfo.MOD_ID + ":" 
							+ ItemInfo.ITEM_WISPSOUL_UNLOCALIZED); 
		bladeIcon 	= register.registerIcon(ModInfo.MOD_ID + ":" 
							+ ItemInfo.ITEM_WISPSOUL_UNLOCALIZED + "_1"); 
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconFromDamage(int dmg)
	{
		if (dmg == 1)
			{return bladeIcon;}
		else 
			{return wispIcon;}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation)
	{
		if (itemstack.getItemDamage() == 0)
			{info.add("A small wisp of your soul floats before your eyes...");}
		else if (itemstack.getItemDamage() == 1)
			{info.add("Even the dead can bleed.");}
		
		info.add(ITEM_SIZE_KEY + ", " + ITEM_WEIGHT_KEY);
	}
}
