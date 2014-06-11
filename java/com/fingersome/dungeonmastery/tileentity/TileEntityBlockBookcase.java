package com.fingersome.dungeonmastery.tileentity;

import com.fingersome.dungeonmastery.item.ItemInfo;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBook;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBlockBookcase extends TileEntity implements IInventory
{

	private ItemStack[] items;
	
	public TileEntityBlockBookcase()
	{
		items = new ItemStack[9];
	}
	
	
	@Override
	public int getSizeInventory() 
	{
		return items.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) 
	{
		return items[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int count) 
	{
		ItemStack itemstack = getStackInSlot(i);
		
		if (itemstack != null)
		{
			if (itemstack.stackSize <= count)
			{
			setInventorySlotContents(i, null);
			}
				else
				{
					itemstack = itemstack.splitStack(count);
					//onInventoryChanged();
				}
		}
		return itemstack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) 
	{
		ItemStack item = getStackInSlot(i);
		setInventorySlotContents(i, null);
		return item;
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemstack) 
	{
		items[i] = itemstack;
		
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit())
		{
			itemstack.stackSize = getInventoryStackLimit();
		}

		//onInventoryChanged();
	}

	@Override
	public String getInventoryName() 
	{
		return "Bookcase";
	}

	@Override
	public boolean hasCustomInventoryName() 
	{
		return true;
	}

	@Override
	public int getInventoryStackLimit() 
	{
		return 1;
	}

	@Override
	public void markDirty() 
	{
		
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) 
	{
		return player.getDistanceSq(xCoord + 0.5F, yCoord +0.5F, zCoord + 0.5F) <= 64;
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) 
	{
		return true; //itemstack.getItem().getUnlocalizedName() == ItemInfo.ITEM_LOREBOOK_UNLOCALIZED;
	}
	
}
