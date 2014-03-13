package com.fingersome.dungeonmasterycore.block;

import java.util.Random;

import com.fingersome.dungeonmasterycore.tileentity.TileEntityAltar;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityAltarBoccob;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityAltarCorellon;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityAltarNerull;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;



public class blockAltarNerull extends BlockContainer
{

	public blockAltarNerull() 
	{
		super(Material.rock);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}
	
	public int getRenderType()
	{
		return -1;
	}
	
	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}
	 
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) 
	{
		return new TileEntityAltarNerull();
	}

}
