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

public class GuiCreateCharacterFeats2 extends GuiScreen 
{
	final int xSize = 176;
	final int ySize = 222;
	
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
		this.buttonList.add(new GuiButton(17, posX + 160, posY + 215, 100, 20, "Next"));
		this.buttonList.add(new GuiButton(18, posX - 60, posY + 215, 100, 20, "Back"));
		
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
        drawCenteredString(fontRendererObj, "Choose your Feats", width / 2, 35, 0xffffff);
        drawString(fontRendererObj, "Nimble Blade", 220, 70, 0xffffff);
        drawString(fontRendererObj, "Potent Challenge", 220, 85, 0xffffff);
        drawString(fontRendererObj, "Power Attack", 220, 100, 0xffffff);
        drawString(fontRendererObj, "Powerful Charge", 220, 115, 0xffffff);
        drawString(fontRendererObj, "Precise Hunter", 220, 130, 0xffffff);
        drawString(fontRendererObj, "Press the Advantage", 220, 145, 0xffffff);
        drawString(fontRendererObj, "Quick-draw", 220, 160, 0xffffff);
        drawString(fontRendererObj, "Raging Storm", 220, 175, 0xffffff);
        drawString(fontRendererObj, "Ritual Caster", 220, 190, 0xffffff);
        drawString(fontRendererObj, "Shield Prof. (Light)", 220, 205, 0xffffff);
        drawString(fontRendererObj, "Shield Prof. (Heavy)", 220, 220, 0xffffff);
        drawString(fontRendererObj, "Shield Push", 220, 235, 0xffffff);
        
        drawString(fontRendererObj, "Skill Focus", 440, 70, 0xffffff);
        drawString(fontRendererObj, "Skill Training", 440, 85, 0xffffff);
        drawString(fontRendererObj, "Sure Climber", 440, 100, 0xffffff);
        drawString(fontRendererObj, "Surprise Knockdown", 440, 115, 0xffffff);
        drawString(fontRendererObj, "Toughness", 440, 130, 0xffffff);
        drawString(fontRendererObj, "Weapon Focus", 440, 145, 0xffffff);
        drawString(fontRendererObj, "Weapon Prof. (Light)", 440, 160, 0xffffff);
        drawString(fontRendererObj, "Weapon Prof. (Med)", 440, 175, 0xffffff);
        drawString(fontRendererObj, "Weapon Prof. (Martial)", 440, 190, 0xffffff);
        drawString(fontRendererObj, "Weapon Prof. (Exotic)", 440, 205, 0xffffff);
        drawString(fontRendererObj, "Weapon Prof. (Ranged)", 440, 220, 0xffffff);
        drawString(fontRendererObj, "Wintertouched", 440, 235, 0xffffff);
        super.drawScreen(i, j, f);
	}
	
}
