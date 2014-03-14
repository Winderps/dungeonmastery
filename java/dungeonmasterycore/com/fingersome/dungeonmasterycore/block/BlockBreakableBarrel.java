package com.fingersome.dungeonmasterycore.block;

import com.fingersome.dungeonmasterycore.CoreReference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockBreakableBarrel extends Block
{
	
	@SideOnly(Side.CLIENT)
	private IIcon topTexture;
	private IIcon sideTexture;
	
	public BlockBreakableBarrel()
	{
		super(Material.rock);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconregister)
	{
		this.blockIcon = iconregister.registerIcon(CoreReference.MOD_ID + ":" + "blockBreakableBarrel");
		this.topTexture = iconregister.registerIcon(CoreReference.MOD_ID + ":" + "blockBreakableBarrel_top");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		if(side == 0 || side == 1)
		{
			return this.topTexture;
		}
			else
			{
				return this.blockIcon;
			}
		
	}
}
