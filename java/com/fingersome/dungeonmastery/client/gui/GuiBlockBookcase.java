package com.fingersome.dungeonmastery.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.fingersome.dungeonmastery.container.ContainerBlockBookcase;
import com.fingersome.dungeonmastery.tileentity.TileEntityBlockBookcase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiBlockBookcase extends GuiContainer
{

	public GuiBlockBookcase(InventoryPlayer invplayer, TileEntityBlockBookcase bookcase) 
	{
		super(new ContainerBlockBookcase(invplayer, bookcase));
		
		xSize = 174;
		ySize = 79;

	}
	
	private static final ResourceLocation texture = new ResourceLocation
			("dungeonmastery", "textures/gui/container/guiContainerMedium.png");

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int x, int y) 
	{
		GL11.glColor4f(1, 1, 1, 1);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}

}
