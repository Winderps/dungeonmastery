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

public class ItemWandNPC extends Item
{
	private IIcon itemIcon;
	
	public ItemWandNPC()
	{
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.ITEM_WANDNPC_UNLOCALIZED);
		setTextureName(ItemInfo.ITEM_WANDNPC_UNLOCALIZED);
	}

	@SideOnly(Side.CLIENT)
	public void registerItemIcons(IIconRegister register)
	{
		itemIcon = register.registerIcon(ModInfo.MOD_ID + ":" + ItemInfo.ITEM_WANDNPC_UNLOCALIZED);
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
			{info.add("Create Mode");}
		else if (itemstack.getItemDamage() == 1)
			{info.add("Delete Mode");}
		else if (itemstack.getItemDamage() == 2)
			{info.add("Edit Mode");}	
		else if (itemstack.getItemDamage() == 3)
			{info.add("Select Mode");}
	}

	
	
}
