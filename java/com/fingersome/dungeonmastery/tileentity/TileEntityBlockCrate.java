package com.fingersome.dungeonmastery.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBlockCrate extends TileEntity implements IInventory
{

	@Override
	public int getSizeInventory() 
	{
		return 0;
	}

	@Override
	public ItemStack getStackInSlot(int var1) 
	{
		return null;
	}

	@Override
	public ItemStack decrStackSize(int var1, int var2) 
	{
		return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int var1) 
	{
		return null;
	}

	@Override
	public void setInventorySlotContents(int var1, ItemStack itemstack) 
	{
		
	}

	@Override
	public String getInventoryName() 
	{
		return "Clay Urn";
	}

	@Override
	public boolean hasCustomInventoryName() 
	{
		return true;
	}

	@Override
	public int getInventoryStackLimit() 
	{
		return 64;
	}

	@Override
	public void markDirty() 
	{
		
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer var1) 
	{
		return false;
	}

	@Override
	public void openInventory() 
	{
		
	}

	@Override
	public void closeInventory() 
	{
		
	}

	@Override
	public boolean isItemValidForSlot(int var1, ItemStack var2) 
	{
		return false;
	}
	
}
