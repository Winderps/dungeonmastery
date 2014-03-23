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
	final int xSize = 305;
	final int ySize = 286;
	

	
	 public GuiCreateCharacterFeats2(EntityPlayer player)
	    {
	        
	    }
		
	public void initGui()
		{
		int posX = (this.width - xSize) /2;
		int posY = (this.height - ySize) /2;
		
		this.buttonList.add(new GuiButton(0, posX - 60, posY + 5, 10, 10, ""));
		this.buttonList.add(new GuiButton(1, posX - 60, posY + 20, 10, 10, ""));
		this.buttonList.add(new GuiButton(2, posX - 60, posY + 35, 10, 10, ""));
		this.buttonList.add(new GuiButton(3, posX - 60, posY + 50, 10, 10, ""));
		this.buttonList.add(new GuiButton(4, posX - 60, posY + 65, 10, 10, ""));
		this.buttonList.add(new GuiButton(5, posX - 60, posY + 80, 10, 10, ""));
		this.buttonList.add(new GuiButton(6, posX - 60, posY + 95, 10, 10, ""));		
		this.buttonList.add(new GuiButton(7, posX - 60, posY + 110, 10, 10, ""));
		this.buttonList.add(new GuiButton(8, posX - 60, posY + 125, 10, 10, ""));
		this.buttonList.add(new GuiButton(6, posX - 60, posY + 140, 10, 10, ""));		
		this.buttonList.add(new GuiButton(7, posX - 60, posY + 155, 10, 10, ""));
		this.buttonList.add(new GuiButton(8, posX - 60, posY + 170, 10, 10, ""));
		
		this.buttonList.add(new GuiButton(0, posX + 160, posY + 5, 10, 10, ""));
		this.buttonList.add(new GuiButton(1, posX + 160, posY + 20, 10, 10, ""));
		this.buttonList.add(new GuiButton(2, posX + 160, posY + 35, 10, 10, ""));
		this.buttonList.add(new GuiButton(3, posX + 160, posY + 50, 10, 10, ""));
		this.buttonList.add(new GuiButton(4, posX + 160, posY + 65, 10, 10, ""));
		this.buttonList.add(new GuiButton(5, posX + 160, posY + 80, 10, 10, ""));
		this.buttonList.add(new GuiButton(6, posX + 160, posY + 95, 10, 10, ""));		
		this.buttonList.add(new GuiButton(7, posX + 160, posY + 110, 10, 10, ""));
		this.buttonList.add(new GuiButton(8, posX + 160, posY + 125, 10, 10, ""));
		this.buttonList.add(new GuiButton(6, posX + 160, posY + 140, 10, 10, ""));		
		this.buttonList.add(new GuiButton(7, posX + 160, posY + 155, 10, 10, ""));
		this.buttonList.add(new GuiButton(8, posX + 160, posY + 170, 10, 10, ""));
		
		this.buttonList.add(new GuiButton(17, posX + 160, posY + 190, 20, 20, ">"));
		this.buttonList.add(new GuiButton(18, posX + 20, posY + 190, 20, 20, "<"));
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
        //drawTexturedModalRect();
        drawCenteredString(fontRendererObj, "Choose your Feats", width / 2, 		height / 2 - 150, 0xffffff);
        drawString(fontRendererObj, "Nimble Blade", 			width / 2 - 120, 	height / 2 - 105, 0xffffff);
        drawString(fontRendererObj, "Potent Challenge", 		width / 2 - 120, 	height / 2 - 90, 0xffffff);
        drawString(fontRendererObj, "Power Attack", 			width / 2 - 120, 	height / 2 - 75, 0xffffff);
        drawString(fontRendererObj, "Powerful Charge", 			width / 2 - 120, 	height / 2 - 60, 0xffffff);
        drawString(fontRendererObj, "Precise Hunter", 			width / 2 - 120, 	height / 2 - 45, 0xffffff);
        drawString(fontRendererObj, "Press the Advantage", 		width / 2 - 120,	height / 2 - 30, 0xffffff);
        drawString(fontRendererObj, "Quick-draw", 				width / 2 - 120, 	height / 2 - 15, 0xffffff);
        drawString(fontRendererObj, "Raging Storm", 			width / 2 - 120, 	height / 2 - 0, 0xffffff);
        drawString(fontRendererObj, "Ritual Caster", 			width / 2 - 120, 	height / 2 + 15, 0xffffff);
        drawString(fontRendererObj, "Shield Prof. (Light)", 	width / 2 - 120, 	height / 2 + 30, 0xffffff);
        drawString(fontRendererObj, "Shield Prof. (Heavy)", 	width / 2 - 120, 	height / 2 + 45, 0xffffff);
        drawString(fontRendererObj, "Shield Push", 				width / 2 - 120, 	height / 2 + 60, 0xffffff);
        
        drawString(fontRendererObj, "Skill Focus", 				width / 2 + 100, 	height / 2 - 105, 0xffffff);
        drawString(fontRendererObj, "Skill Training", 			width / 2 + 100, 	height / 2 - 90, 0xffffff);
        drawString(fontRendererObj, "Sure Climber", 			width / 2 + 100, 	height / 2 - 75, 0xffffff);
        drawString(fontRendererObj, "Surprise Knockdown", 		width / 2 + 100, 	height / 2 - 60, 0xffffff);
        drawString(fontRendererObj, "Toughness", 				width / 2 + 100, 	height / 2 - 45, 0xffffff);
        drawString(fontRendererObj, "Weapon Focus", 			width / 2 + 100, 	height / 2 - 30, 0xffffff);
        drawString(fontRendererObj, "Weapon Prof. (Light)", 	width / 2 + 100, 	height / 2 - 15, 0xffffff);
        drawString(fontRendererObj, "Weapon Prof. (Med)", 		width / 2 + 100, 	height / 2 - 0, 0xffffff);
        drawString(fontRendererObj, "Weapon Prof. (Martial)", 	width / 2 + 100, 	height / 2 + 15, 0xffffff);
        drawString(fontRendererObj, "Weapon Prof. (Exotic)", 	width / 2 + 100, 	height / 2 + 30, 0xffffff);
        drawString(fontRendererObj, "Weapon Prof. (Ranged)", 	width / 2 + 100, 	height / 2 + 45, 0xffffff);
        drawString(fontRendererObj, "Wintertouched", 			width / 2 + 100, 	height / 2 + 60, 0xffffff);
        super.drawScreen(i, j, f);
	}
	
}
