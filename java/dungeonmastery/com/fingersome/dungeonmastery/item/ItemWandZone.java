package com.fingersome.dungeonmastery.item;

import java.util.List;

import com.fingersome.dungeonmastery.block.BlockInfo;
import com.fingersome.dungeonmastery.lib.ModInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemWandZone extends Item
{
	private IIcon itemIcon;
	
	public ItemWandZone()
	{
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.ITEM_WANDZONE_UNLOCALIZED);
		setTextureName(ModInfo.MOD_ID + ":" + ItemInfo.ITEM_WANDZONE_UNLOCALIZED);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	    {
	       if (player.isSneaking() && itemstack.getItemDamage() == 0)
	       		{itemstack.setItemDamage(itemstack.getItemDamage() + 1);}
	       
	       else if (player.isSneaking() && itemstack.getItemDamage() == 1)
	       		{itemstack.setItemDamage(itemstack.getItemDamage() + 1);}
	       
	       else if (player.isSneaking() && itemstack.getItemDamage() == 2)
      			{itemstack.setItemDamage(itemstack.getItemDamage() +1);}
	       
	       else if (player.isSneaking() && itemstack.getItemDamage() == 3)
	       		{itemstack.setItemDamage(itemstack.getItemDamage() + 1);}	
	       
	       else if (player.isSneaking() && itemstack.getItemDamage() == 4)
 				{itemstack.setItemDamage(itemstack.getItemDamage() + 1);}
	       
	       else if (player.isSneaking() && itemstack.getItemDamage() == 5)
 				{itemstack.setItemDamage(itemstack.getItemDamage() + 1);}
	       
	       else if (player.isSneaking() && itemstack.getItemDamage() == 6)
 				{itemstack.setItemDamage(itemstack.getItemDamage() - 6);}
	       
	        return itemstack;
	    }
	
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation)
	{
		if(itemstack.getItemDamage() == 0)
			{info.add("Town Mode");}
		else if (itemstack.getItemDamage() == 1)
			{info.add("Dungeon Mode");}
		else if (itemstack.getItemDamage() == 2)
			{info.add("Encounter Mode");}	
		else if (itemstack.getItemDamage() == 3)
			{info.add("Quest Mode");}
		else if (itemstack.getItemDamage() == 4)
			{info.add("Effect Mode");}
		else if (itemstack.getItemDamage() == 5)
			{info.add("Senses Mode");}
		else if (itemstack.getItemDamage() == 6)
			{info.add("Warp Mode");}
	}

	
	
}
