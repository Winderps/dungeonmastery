package com.fingersome.dungeonmastery.block;

import com.fingersome.dungeonmastery.lib.ModInfo;
import com.fingersome.dungeonmastery.tileentity.TileEntityBlockBarrel;
import com.fingersome.dungeonmastery.tileentity.TileEntityBlockCrate;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCrate extends BlockContainer
{

	protected BlockCrate(Material material)
	{
		super(material);
		
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeWood);
		setHardness(2.0F);
		setBlockName(BlockInfo.BLOCK_CRATE_UNLOCALIZED);
		setBlockTextureName(ModInfo.MOD_ID + ":" + BlockInfo.BLOCK_CRATE_UNLOCALIZED);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int var2)
	{
		return new TileEntityBlockCrate();
	}
	
}