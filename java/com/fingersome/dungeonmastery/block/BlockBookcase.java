package com.fingersome.dungeonmastery.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.fingersome.dungeonmastery.DungeonMastery;
import com.fingersome.dungeonmastery.lib.ModInfo;
import com.fingersome.dungeonmastery.tileentity.TileEntityBlockBookcase;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBookcase extends BlockContainer
{
	private IIcon topIcon;
	private IIcon sideIcon;
	
	protected BlockBookcase(Material material)
	{
		super(material);
		
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeStone);
		setHardness(2.0F);
		setBlockName(BlockInfo.BLOCK_BOOKCASE_UNLOCALIZED);
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY)
	{
		if (!world.isRemote)
		{
			FMLNetworkHandler.openGui(player, DungeonMastery.instance, 0, world, x, y, z);
		}
		return true;
	}
		
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		topIcon = register.registerIcon(ModInfo.MOD_ID + ":" + BlockInfo.ICON_BOOKCASE_TOP);
		sideIcon = register.registerIcon(ModInfo.MOD_ID + ":" + BlockInfo.ICON_BOOKCASE_SIDE);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta)
	{
		if(side == 0)
			{return topIcon;}
		else if(side == 1)
			{return topIcon;}
		
		else
		{return sideIcon;}
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var2)
	{
		return new TileEntityBlockBookcase();
	}
	
}
