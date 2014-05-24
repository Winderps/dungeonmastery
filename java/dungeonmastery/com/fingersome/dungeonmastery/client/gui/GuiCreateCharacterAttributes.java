package com.fingersome.dungeonmastery.client.gui;

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

import com.fingersome.dungeonmastery.DungeonMastery;
import com.fingersome.dungeonmastery.lib.References;

public class GuiCreateCharacterAttributes extends GuiScreen 
{

	public final ResourceLocation texture = new ResourceLocation(com.fingersome.dungeonmastery.lib.References.MOD_ID, "textures/gui/creation/GuiCharacterCreationAttributes.png");

	final int xSize = 256;
	final int ySize = 256;
	
	 public GuiCreateCharacterAttributes(EntityPlayer player)
	    {
	        
	    }
		
	public void initGui()
		{
		int posX = (width - xSize) /2;
		int posY = (height - ySize) /2;
		
		this.buttonList.add(new GuiButton(0, posX + 10, posY + 35, 20, 20, "-"));
		this.buttonList.add(new GuiButton(1, posX + 10, posY + 65, 20, 20, "-"));
		this.buttonList.add(new GuiButton(2, posX + 10, posY + 95, 20, 20, "-"));
		this.buttonList.add(new GuiButton(3, posX + 10, posY + 125, 20, 20, "-"));
		this.buttonList.add(new GuiButton(4, posX + 10, posY + 155, 20, 20, "-"));
		this.buttonList.add(new GuiButton(5, posX + 10, posY + 185, 20, 20, "-"));
		this.buttonList.add(new GuiButton(0, posX + 40, posY + 35, 20, 20, "+"));
		this.buttonList.add(new GuiButton(1, posX + 40, posY + 65, 20, 20, "+"));
		this.buttonList.add(new GuiButton(2, posX + 40, posY + 95, 20, 20, "+"));
		this.buttonList.add(new GuiButton(3, posX + 40, posY + 125, 20, 20, "+"));
		this.buttonList.add(new GuiButton(4, posX + 40, posY + 155, 20, 20, "+"));
		this.buttonList.add(new GuiButton(5, posX + 40, posY + 185, 20, 20, "+"));
		
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
        
        drawDefaultBackground();
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);   
		int posX = (width - xSize) /2;
		int posY = (height - ySize) /2;
		
        drawTexturedModalRect(posX, posY, 0, 0, xSize, ySize);
        
        drawCenteredString(fontRendererObj, "Choose your Attributes", width / 2, height / 2 - 119, 0xFFFFFF);
        
        drawString(fontRendererObj, "Strength", 				posX + 100, 		posY + 40, 0xFFFFFF);
        drawString(fontRendererObj, "Dexterity", 				posX + 98, 			posY + 70, 0xffffff);
        drawString(fontRendererObj, "Constitution", 			posX + 92, 			posY + 100, 0xffffff);
        drawString(fontRendererObj, "Intellect", 				posX + 100, 		posY + 131, 0xffffff);
        drawString(fontRendererObj, "Wisdom", 					posX + 105, 		posY + 161, 0xffffff);
        drawString(fontRendererObj, "Charisma", 				posX + 98,			posY + 192, 0xffffff);
      
        super.drawScreen(i, j, f);
	}
	
}
