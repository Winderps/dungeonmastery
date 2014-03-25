package com.fingersome.dungeonmasterycore.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.fingersome.dungeonmasterycore.DungeonMasteryCore;
import com.fingersome.dungeonmasterycore.lib.References;

public class GuiCreateCharacterFeats2 extends GuiScreen 
{

	public final ResourceLocation texture = new ResourceLocation(com.fingersome.dungeonmasterycore.lib.References.MOD_ID, "textures/gui/GuiCharacterCreationFeats.png");
	
	final int xSize = 256;
	final int ySize = 256;

	
	 public GuiCreateCharacterFeats2(EntityPlayer player)
	    {
	        
	    }
		
	public void initGui()
		{
		int posX = (this.width - xSize) /2;
		int posY = (this.height - ySize) /2;
		

		this.buttonList.add(new GuiButton(1, posX + 50, posY + 32, 10, 10, ""));
		this.buttonList.add(new GuiButton(2, posX + 50, posY + 47, 10, 10, ""));
		this.buttonList.add(new GuiButton(3, posX + 50, posY + 62, 10, 10, ""));
		this.buttonList.add(new GuiButton(4, posX + 50, posY + 77, 10, 10, ""));
		this.buttonList.add(new GuiButton(5, posX + 50, posY + 92, 10, 10, ""));
		this.buttonList.add(new GuiButton(6, posX + 50, posY + 107, 10, 10, ""));		
		this.buttonList.add(new GuiButton(7, posX + 50, posY + 122, 10, 10, ""));
		this.buttonList.add(new GuiButton(8, posX + 50, posY + 137, 10, 10, ""));
		this.buttonList.add(new GuiButton(6, posX + 50, posY + 152, 10, 10, ""));		
		this.buttonList.add(new GuiButton(7, posX + 50, posY + 167, 10, 10, ""));
		this.buttonList.add(new GuiButton(0, posX + 50, posY + 182, 10, 10, ""));
		
		this.buttonList.add(new GuiButton(17, posX + 90, posY + 200, 20, 20, "<"));
		this.buttonList.add(new GuiButton(18, posX + 145, posY + 200, 20, 20, ">"));
		
		this.buttonList.add(new GuiButton(17, posX + 10, posY + 230, 100, 20, "Back"));
		this.buttonList.add(new GuiButton(18, posX + 145, posY + 230, 100, 20, "Next"));
		
		}

	protected void actionPerformed(GuiButton button)
	{
		switch(button.id)
		{
		case 0:
		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: 
		case 7: 
		case 8: 
		case 9: 
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		}

	}
	
	public boolean doesGuiPauseGame()
		{
		return false;
		}

	public void drawScreen(int i, int j, float f)
	{
        drawDefaultBackground();
        
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);   
		int posX = (width - xSize) /2;
		int posY = (height - ySize) /2;
		
        drawTexturedModalRect(posX, posY, 0, 0, xSize, ySize);
        
        drawCenteredString(fontRendererObj, "Choose your Feats", width / 2, height / 2 - 119, 0xFFFFFF);

        drawString(fontRendererObj, "Escape Artist", 			width / 2 - 50, 	height / 2 - 95, 0xffffff);
        drawString(fontRendererObj, "Expanded Spellbook", 		width / 2 - 50, 	height / 2 - 80, 0xffffff);
        drawString(fontRendererObj, "Far Shot", 				width / 2 - 50, 	height / 2 - 65, 0xffffff);
        drawString(fontRendererObj, "Far Throw", 				width / 2 - 50, 	height / 2 - 50, 0xffffff);
        drawString(fontRendererObj, "Fast Runner", 				width / 2 - 50, 	height / 2 - 35, 0xffffff);
        drawString(fontRendererObj, "Dark Boon", 				width / 2 - 50,		height / 2 - 20, 0xffffff);
        drawString(fontRendererObj, "Destiny of the Void", 		width / 2 - 50, 	height / 2 - 5, 0xffffff);
        drawString(fontRendererObj, "Dark Fury", 	 			width / 2 - 50, 	height / 2 + 10, 0xffffff);
        drawString(fontRendererObj, "Improved Initiative", 		width / 2 - 50, 	height / 2 + 25, 0xffffff);
        drawString(fontRendererObj, "Miasmic Step", 			width / 2 - 50, 	height / 2 + 40, 0xffffff);
        drawString(fontRendererObj, "Jack-of-all-trades",	 	width / 2 - 50, 	height / 2 + 55, 0xffffff);
/*
        drawString(fontRendererObj, "Linguist", 				width / 2 + 100, 	height / 2 + 30, 0xffffff);
        drawString(fontRendererObj, "Long-jumper", 				width / 2 + 100, 	height / 2 + 45, 0xffffff);
        drawString(fontRendererObj, "Mounted Combat", 			width / 2 + 100, 	height / 2 + 60, 0xffffff);
*/     
        super.drawScreen(i, j, f);
	}

}
