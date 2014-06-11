package com.fingersome.dungeonmastery.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBlockDebugging extends TileEntity {

	public boolean isUseableByPlayer(EntityPlayer player) {
		return false;
	}

}
