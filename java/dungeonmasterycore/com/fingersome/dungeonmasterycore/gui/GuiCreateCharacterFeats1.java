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

public class GuiCreateCharacterFeats1 extends GuiScreen 
{

	public final ResourceLocation texture = new ResourceLocation(com.fingersome.dungeonmasterycore.lib.References.MOD_ID, "textures/gui/GuiCharacterCreationClassFeats.png");
	
	final int xSize = 256;
	final int ySize = 256;
	
	
	 public GuiCreateCharacterFeats1(EntityPlayer player)
	    {
	    }
		
	public void initGui()
		{
		int posX = (this.width - xSize) /2;
		int posY = (this.height - ySize) /2;
		

		this.buttonList.add(new GuiButton(1, posX + 10, posY + 32, 120, 15, "Alertness"));
		this.buttonList.add(new GuiButton(2, posX + 10, posY + 48, 120, 15, "Armor Prof. (Light)"));
		this.buttonList.add(new GuiButton(3, posX + 10, posY + 64, 120, 15, "Armor Prof. (Med)"));
		this.buttonList.add(new GuiButton(4, posX + 10, posY + 80, 120, 15, "Armor Prof. (Heavy)"));
		this.buttonList.add(new GuiButton(5, posX + 10, posY + 96, 120, 15, "Backstabber"));
		this.buttonList.add(new GuiButton(6, posX + 10, posY + 112, 120, 15, "Blade Opportunist"));		
		this.buttonList.add(new GuiButton(7, posX + 10, posY + 128, 120, 15, "Combat Reflexes"));
		this.buttonList.add(new GuiButton(8, posX + 10, posY + 144, 120, 15, "Dark Boon"));
		this.buttonList.add(new GuiButton(6, posX + 10, posY + 160, 120, 15, "Dark Fury"));		
		this.buttonList.add(new GuiButton(7, posX + 10, posY + 176, 120, 15, "Defensive Mobility"));

		
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

        super.drawScreen(i, j, f);
	}

}
