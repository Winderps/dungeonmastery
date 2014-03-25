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

public class GuiCreateCharacterFeats3 extends GuiScreen 
{

	public final ResourceLocation texture = new ResourceLocation(com.fingersome.dungeonmasterycore.lib.References.MOD_ID, "textures/gui/GuiCharacterCreationFeats.png");
	
	final int xSize = 256;
	final int ySize = 256;

	
	 public GuiCreateCharacterFeats3(EntityPlayer player)
	    {
	        
	    }
		
	public void initGui()
		{
		int posX = (this.width - xSize) /2;
		int posY = (this.height - ySize) /2;
		

		this.buttonList.add(new GuiButton(1, posX + 50, posY + 32, 10, 10, ""));
		this.buttonList.add(new GuiButton(2, posX + 50, posY + 47, 10, 10, ""));
		this.buttonList.add(new GuiButton(3, posX + 50, posY + 62, 10, 10, ""));

		this.buttonList.add(new GuiButton(17, posX + 90, posY + 200, 20, 20, "<"));
		
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

        drawString(fontRendererObj, "Linguist", 				width / 2 - 50, 	height / 2 - 95, 0xffffff);
        drawString(fontRendererObj, "Long-jumper", 				width / 2 - 50, 	height / 2 - 80, 0xffffff);
        drawString(fontRendererObj, "Mounted Combat", 			width / 2 - 50, 	height / 2 - 65, 0xffffff);

        super.drawScreen(i, j, f);
	}

}
