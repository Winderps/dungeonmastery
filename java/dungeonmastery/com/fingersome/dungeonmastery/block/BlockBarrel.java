package com.fingersome.dungeonmastery.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.fingersome.dungeonmastery.lib.BlockInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBarrel extends Block
{

	protected BlockBarrel(Material material)
	{
		super(material);
		
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeStone);
		setHardness(2.0F);
		setBlockName(BlockInfo.BLOCK_BARREL_UNLOCALIZED);
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon topIcon;
	@SideOnly(Side.CLIENT)
	private IIcon sideIcon;
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		topIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.ICON_BARREL_TOP);
		sideIcon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.ICON_BARREL_SIDE);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta)
	{
		if(side == 0 || side == 1)
		{return topIcon;}
		else
		{return sideIcon;}
		
	}
	
	public TileEntity createNewTileentity(World world, EntityPlayer player)
	{
		return null;
	}
	
}
