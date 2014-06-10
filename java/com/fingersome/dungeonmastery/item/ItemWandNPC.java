package com.fingersome.dungeonmastery.item;

import java.util.List;

import com.fingersome.dungeonmastery.DungeonMastery;
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
	private IIcon createIcon;
	private IIcon deleteIcon;
	private IIcon editIcon;
	private IIcon selectIcon;
	
	public ItemWandNPC()
	{
		setCreativeTab(DungeonMastery.tabDM);
		setMaxStackSize(1);
		setUnlocalizedName(ItemInfo.ITEM_WANDNPC_UNLOCALIZED);
		setHasSubtypes(true);

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

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister register)
	{
		createIcon 		= register.registerIcon(ModInfo.MOD_ID + ":" 
							+ ItemInfo.ITEM_WANDNPC_UNLOCALIZED); 
		deleteIcon 	= register.registerIcon(ModInfo.MOD_ID + ":" 
							+ ItemInfo.ITEM_WANDNPC_UNLOCALIZED + "_1"); 
		editIcon 	= register.registerIcon(ModInfo.MOD_ID + ":" 
							+ ItemInfo.ITEM_WANDNPC_UNLOCALIZED + "_2"); 
		selectIcon 		= register.registerIcon(ModInfo.MOD_ID + ":" 
							+ ItemInfo.ITEM_WANDNPC_UNLOCALIZED + "_3"); 
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIconFromDamage(int dmg)
	{
		if 		(dmg == 0)
			{return createIcon;}
		else if (dmg == 1)
			{return deleteIcon;}
		else if (dmg == 2)
			{return editIcon;}
		
		else return selectIcon;
	}
	
	
}
