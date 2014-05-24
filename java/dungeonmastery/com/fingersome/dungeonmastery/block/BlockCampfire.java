package com.fingersome.dungeonmastery.block;

import java.util.Random;

import com.fingersome.dungeonmastery.tileentity.TileEntityCampfire;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;



public class BlockCampfire extends BlockContainer
{

	public BlockCampfire() 
	{
		super(Material.wood);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
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
		return new TileEntityCampfire();
	}
	
	 @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World world, int x, int y, int z, Random p_149734_5_)
	    {
	        int l = world.getBlockMetadata(x, y, z);
	        double d0 = (double)((float)x + 0.5F);
	        double d1 = (double)((float)y + 0.3F);
	        double d2 = (double)((float)z + 0.5F);
	        double d3 = 0.2199999988079071D;
	        double d4 = 0.27000001072883606D;

	        if (l == 1)
	        {
	            world.spawnParticle("smoke", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	            world.spawnParticle("flame", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 2)
	        {
	            world.spawnParticle("smoke", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	            world.spawnParticle("flame", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 3)
	        {
	            world.spawnParticle("smoke", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
	            world.spawnParticle("flame", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 4)
	        {
	            world.spawnParticle("smoke", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
	            world.spawnParticle("flame", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
	        }
	        else
	        {
	            world.spawnParticle("smoke", d0, d1, d2, 0.0D, 0.0D, 0.0D);
	            world.spawnParticle("flame", d0, d1, d2, 0.0D, 0.0D, 0.0D);
	        }
	    }
}
