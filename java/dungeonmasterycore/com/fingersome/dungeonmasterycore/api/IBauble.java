package com.fingersome.dungeonmasterycore.api;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

/**
 * 
 * @author Azanor
 * 
 * This interface should be extended by items that can be worn in bauble slots
 *
 */

public interface IBauble {
	
	/**
	 * This method return the type of bauble this is. 
	 * Type is used to determine the slots it can go into.
	 */
	public BaubleType getBaubleType(ItemStack itemstack);
	
	/**
	 * This method is called once per tick if the bauble is being worn by a player
	 */
	public void onWornTick(ItemStack itemstack, EntityLivingBase player);
	
	/**
	 * This method is called when the bauble is equipped by a player
	 */
	public void onEquipped(ItemStack itemstack, EntityLivingBase player);
	
	/**
	 * This method is called when the bauble is unequipped by a player
	 */
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player);

}