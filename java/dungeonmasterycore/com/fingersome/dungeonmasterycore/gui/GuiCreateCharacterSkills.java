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

public class GuiCreateCharacterSkills extends GuiScreen 
{
	final int xSize = 176;
	final int ySize = 222;
	
	 public GuiCreateCharacterSkills(EntityPlayer player)
	    {
	        
	    }
	
	public void initGui()
		{
		int posX = (this.width - xSize) /2;
		int posY = (this.height - ySize) /2;

		this.buttonList.add(new GuiButton(0, posX - 60, posY + 5, 100, 20, "Acrobatics"));
		this.buttonList.add(new GuiButton(1, posX - 60, posY + 25, 100, 20, "Arcana"));
		this.buttonList.add(new GuiButton(2, posX - 60, posY + 45, 100, 20, "Athletics"));
		this.buttonList.add(new GuiButton(3, posX - 60, posY + 65, 100, 20, "Bluff"));
		this.buttonList.add(new GuiButton(4, posX - 60, posY + 85, 100, 20, "Diplomacy"));
		this.buttonList.add(new GuiButton(5, posX - 60, posY + 105, 100, 20, "Dungeoneering"));
		this.buttonList.add(new GuiButton(6, posX - 60, posY + 125, 100, 20, "Endurance"));		
		this.buttonList.add(new GuiButton(7, posX - 60, posY + 145, 100, 20, "Healing"));
		this.buttonList.add(new GuiButton(8, posX - 60, posY + 165, 100, 20, "History"));
		this.buttonList.add(new GuiButton(9, posX + 160, posY + 5, 100, 20, "Insight"));
		this.buttonList.add(new GuiButton(10, posX + 160, posY + 25, 100, 20, "Intimidate"));
		this.buttonList.add(new GuiButton(11, posX + 160, posY + 45, 100, 20, "Nature"));
		this.buttonList.add(new GuiButton(12, posX + 160, posY + 65, 100, 20, "Perception"));
		this.buttonList.add(new GuiButton(13, posX + 160, posY + 85, 100, 20, "Religion"));
		this.buttonList.add(new GuiButton(14, posX + 160, posY + 105, 100, 20, "Stealth"));
		this.buttonList.add(new GuiButton(15, posX + 160, posY + 125, 100, 20, "Streetwise"));
		this.buttonList.add(new GuiButton(16, posX + 160, posY + 145, 100, 20, "Thievery"));		
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
        drawCenteredString(fontRendererObj, "Choose your skills", width / 2, 35, 0xffffff);
        super.drawScreen(i, j, f);
	}
	
}
