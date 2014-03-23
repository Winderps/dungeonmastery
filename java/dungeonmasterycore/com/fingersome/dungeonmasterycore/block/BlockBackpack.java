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
import net.minecraft.client.Minecraft;
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
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemstack)
    {
        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
        
        //south
        if (l == 0)	{world.setBlockMetadataWithNotify(x, y, z, 0, 2);}
        //
        if (l == 1) {world.setBlockMetadataWithNotify(x, y, z, 1, 2);}
        //
        if (l == 2) {world.setBlockMetadataWithNotify(x, y, z, 2, 2);}
        //
        if (l == 3) {world.setBlockMetadataWithNotify(x, y, z, 3, 2);}
    }

	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) 
	{
		return new TileEntityBackpack();
	}

}