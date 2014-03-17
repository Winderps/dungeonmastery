package com.fingersome.dungeonmasterycore.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockWorldStone extends Block
{

	public BlockWorldStone() 
	{
		super(Material.rock);
		super.setBlockUnbreakable();
	}

}
