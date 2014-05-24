package com.fingersome.dungeonmastery.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockLimboSand extends Block
{

	public BlockLimboSand() 
	{
		super(Material.ground);
		this.setStepSound(soundTypeSand);
	}

}
