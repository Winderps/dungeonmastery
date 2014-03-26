package com.fingersome.dungeonmasterycore.renderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import com.fingersome.dungeonmasterycore.model.ModelBackpack;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityBackpack;

public class ItemRendererBackpack implements IItemRenderer
{

	public ModelBackpack model;
	public TileEntitySpecialRenderer render;
	
	public ItemRendererBackpack()
	{
		model = new ModelBackpack();
	}
	
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		return true;
	}


	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		return true;
	}


	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		render.renderTileEntityAt(new TileEntityBackpack(), 0.0D, 0.0D, 0.0D, 0.0F);
	}


}
