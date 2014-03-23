package com.fingersome.dungeonmasterycore.block;

import java.util.Random;

import com.fingersome.dungeonmasterycore.tileentity.TileEntityBackpack;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCampfire;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityCorpseSkeleton;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;



public class BlockBackpack extends BlockContainer
{

	public BlockBackpack() 
	{
		super(Material.cloth);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.9F, 1.0F);
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
		return new TileEntityBackpack();
	}
	
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
	{

	int p = MathHelper.floor_double((double)((par5EntityLiving.rotationYaw * 4F) / 360F) + 0.5D) & 3;

	byte byte0 = 0;

	if (p == 0){byte0 = 4;}

	if (p == 1){byte0 = 3;}

	if (p == 2){byte0 = 2;}

	if (p == 3){byte0 = 1;}
	par1World.setBlockMetadataWithNotify(par2, par3, par4, byte0, 2);



	if(!this.canBlockStay(par1World, par2, par3, par4))
	  {

	par1World.setBlock(par2, par3, par4, null, 0, 2);
	}
	}
}