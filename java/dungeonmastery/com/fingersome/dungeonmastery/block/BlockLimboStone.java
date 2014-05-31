package com.fingersome.dungeonmastery.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

import com.fingersome.dungeonmastery.lib.BlockInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLimboStone extends Block
{

	protected BlockLimboStone(Material material)
	{
		super(material);
		
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeStone);
		setHardness(2.0F);
		setBlockName(BlockInfo.BLOCK_LIMBOSTONE_UNLOCALIZED);
		setBlockTextureName(BlockInfo.BLOCK_LIMBOSTONE_UNLOCALIZED);
	}
	
	@SideOnly(Side.CLIENT)
	private IIcon icon;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
		icon = register.registerIcon(BlockInfo.TEXTURE_LOCATION + ":" + BlockInfo.BLOCK_LIMBOSTONE_UNLOCALIZED);
		
	}
	
}