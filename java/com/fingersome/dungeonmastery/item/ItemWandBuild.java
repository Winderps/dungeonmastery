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

public class ItemWandBuild extends Item
{
	private IIcon groupIcon;
	private IIcon roomIcon;
	private IIcon objectIcon;
	private IIcon restoreIcon;
	
	public ItemWandBuild()
	{
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.ITEM_WANDBUILD_UNLOCALIZED);
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
 				{itemstack.setItemDamage(itemstack.getItemDamage() -3);}
	       
	        return itemstack;
	    }
	
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation)
	{
		if(itemstack.getItemDamage() == 0)
			{info.add("Group Mode");}
		else if (itemstack.getItemDamage() == 1)
			{info.add("Room Mode");}
		else if (itemstack.getItemDamage() == 2)
			{info.add("Object Mode");}	
		else if (itemstack.getItemDamage() == 3)
			{info.add("Restore Mode");}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister register)
	{
		groupIcon 		= register.registerIcon(ModInfo.MOD_ID + ":" 
							+ ItemInfo.ITEM_WANDBUILD_UNLOCALIZED); 
		roomIcon 	= register.registerIcon(ModInfo.MOD_ID + ":" 
							+ ItemInfo.ITEM_WANDBUILD_UNLOCALIZED + "_1"); 
		objectIcon 	= register.registerIcon(ModInfo.MOD_ID + ":" 
							+ ItemInfo.ITEM_WANDBUILD_UNLOCALIZED + "_2"); 
		restoreIcon 		= register.registerIcon(ModInfo.MOD_ID + ":" 
							+ ItemInfo.ITEM_WANDBUILD_UNLOCALIZED + "_3"); 
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconFromDamage(int dmg)
	{
		if 		(dmg == 0)
			{return groupIcon;}
		else if (dmg == 1)
			{return roomIcon;}
		else if (dmg == 2)
			{return objectIcon;}
		
		else return restoreIcon;
	}
	
	
}
