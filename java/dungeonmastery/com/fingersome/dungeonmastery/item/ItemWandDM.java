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

public class ItemWandDM extends Item
{
	private IIcon itemIcon;
	
	public ItemWandDM()
	{
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.ITEM_WANDDM_UNLOCALIZED);
		setTextureName(ItemInfo.ITEM_WANDDM_ICON);
	}

	@SideOnly(Side.CLIENT)
	public void registerItemIcons(IIconRegister register)
	{
		itemIcon = register.registerIcon(ModInfo.MOD_ID + ":" + ItemInfo.ITEM_WANDDM_ICON);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	    {
	        world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	        if (!world.isRemote)
	        {
	            world.(new EntityEgg(world, player));
	        }

	        return itemstack;
	    }
	
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List info, boolean useExtraInformation)
	{
		info.add("Movement Mode");
	}

	
	
}
