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

import com.fingersome.dungeonmasterycore.CoreReference;
import com.fingersome.dungeonmasterycore.DungeonMasteryCore;

public class GuiCreateCharacterAttributes extends GuiScreen 
{

	ResourceLocation texture = new ResourceLocation(CoreReference.MOD_ID.toLowerCase(), "textures/gui/GuiCharacterCreationAtrributes.png");

	final int xSize = 305;
	final int ySize = 286;
	
	 public GuiCreateCharacterAttributes(EntityPlayer player)
	    {
	        
	    }
		
	public void initGui()
		{
		int posX = (this.width - xSize) /2;
		int posY = (this.height - ySize) /2;
		
		this.buttonList.add(new GuiButton(0, posX + 10, posY + 5, 20, 20, "-"));
		this.buttonList.add(new GuiButton(1, posX + 10, posY + 25, 20, 20, "-"));
		this.buttonList.add(new GuiButton(2, posX + 10, posY + 45, 20, 20, "-"));
		this.buttonList.add(new GuiButton(3, posX + 10, posY + 65, 20, 20, "-"));
		this.buttonList.add(new GuiButton(4, posX + 10, posY + 85, 20, 20, "-"));
		this.buttonList.add(new GuiButton(5, posX + 10, posY + 105, 20, 20, "-"));
		this.buttonList.add(new GuiButton(0, posX + 40, posY + 5, 20, 20, "+"));
		this.buttonList.add(new GuiButton(1, posX + 40, posY + 25, 20, 20, "+"));
		this.buttonList.add(new GuiButton(2, posX + 40, posY + 45, 20, 20, "+"));
		this.buttonList.add(new GuiButton(3, posX + 40, posY + 65, 20, 20, "+"));
		this.buttonList.add(new GuiButton(4, posX + 40, posY + 85, 20, 20, "+"));
		this.buttonList.add(new GuiButton(5, posX + 40, posY + 105, 20, 20, "+"));

		this.buttonList.add(new GuiButton(8, posX + 10, posY + 145, 100, 20, "Random"));
		this.buttonList.add(new GuiButton(8, posX + 10, posY + 175, 100, 20, "Reset"));	
		
		this.buttonList.add(new GuiButton(17, posX + 10, posY + 245, 100, 20, "Next"));
		this.buttonList.add(new GuiButton(18, posX + 195, posY + 245, 100, 20, "Back"));
		
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
        //drawGradientRect(20, 20, width - 20, height - 20, 0x60500000, 0xa0803030);
        //drawRect(60, 60, width - 60, height - 60, 0xFF9E9E9E);
        
        int posX = (this.width - xSize) / 2;
        int posY = (this.height - ySize) / 2;
        
        //Minecraft.getMinecraft().getTextureManager().bindTexture(texture);     
        //drawTexturedModalRect(posX, posY, 0, 0, xSize, ySize);
        
        drawCenteredString(fontRendererObj, "Choose your Attributes", width / 2, 		height / 2 - 160, 0xffffff);
        drawString(fontRendererObj, "Strength", 				posX + 80, 		posY + 10, 0xffffff);
        drawString(fontRendererObj, "Dexterity", 				posX + 80, 		posY + 30, 0xffffff);
        drawString(fontRendererObj, "Constitution", 			posX + 80, 		posY + 50, 0xffffff);
        drawString(fontRendererObj, "Intellect", 				posX + 80, 		posY + 70, 0xffffff);
        drawString(fontRendererObj, "Wisdom", 					posX + 80, 		posY + 90, 0xffffff);
        drawString(fontRendererObj, "Charisma", 				posX + 80,		posY + 110, 0xffffff);
      
        super.drawScreen(i, j, f);
	}
	
}
