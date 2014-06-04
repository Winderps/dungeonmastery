package com.fingersome.dungeonmastery.block;

import com.fingersome.dungeonmastery.lib.ModInfo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLimbostone extends Block
{

	protected BlockLimbostone(Material material)
	{
		super(material);
		
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeStone);
		setHardness(2.0F);
		setBlockName(BlockInfo.BLOCK_LIMBOSTONE_UNLOCALIZED);
		setBlockTextureName(ModInfo.MOD_ID + ":" + BlockInfo.BLOCK_LIMBOSTONE_UNLOCALIZED);
	}
	
}