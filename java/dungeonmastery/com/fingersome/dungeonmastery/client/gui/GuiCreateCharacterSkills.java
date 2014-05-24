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

public class GuiCreateCharacterSkills extends GuiScreen 
{
	
	public final ResourceLocation texture = new ResourceLocation(com.fingersome.dungeonmastery.lib.References.MOD_ID, "textures/gui/creation/GuiCharacterCreationBackground.png");
	
	final int xSize = 256;
	final int ySize = 256;
	
	 public GuiCreateCharacterSkills(EntityPlayer player)
	    {
	        
	    }
	
	public void initGui()
		{
		int posX = (this.width - xSize) /2;
		int posY = (this.height - ySize) /2;

		this.buttonList.add(new GuiButton(0, posX + 10, posY + 25, 100, 20, "Acrobatics"));
		this.buttonList.add(new GuiButton(1, posX + 10, posY + 45, 100, 20, "Arcana"));
		this.buttonList.add(new GuiButton(2, posX + 10, posY + 65, 100, 20, "Athletics"));
		this.buttonList.add(new GuiButton(3, posX + 10, posY + 85, 100, 20, "Bluff"));
		this.buttonList.add(new GuiButton(4, posX + 10, posY + 105, 100, 20, "Diplomacy"));
		this.buttonList.add(new GuiButton(5, posX + 10, posY + 125, 100, 20, "Dungeoneering"));
		this.buttonList.add(new GuiButton(6, posX + 10, posY + 145, 100, 20, "Endurance"));		
		this.buttonList.add(new GuiButton(7, posX + 10, posY + 165, 100, 20, "Healing"));
		this.buttonList.add(new GuiButton(8, posX + 10, posY + 185, 100, 20, "History"));
		this.buttonList.add(new GuiButton(9, posX + 145, posY + 25, 100, 20, "Insight"));
		this.buttonList.add(new GuiButton(10, posX + 145, posY + 45, 100, 20, "Intimidate"));
		this.buttonList.add(new GuiButton(11, posX + 145, posY + 65, 100, 20, "Nature"));
		this.buttonList.add(new GuiButton(12, posX + 145, posY + 85, 100, 20, "Perception"));
		this.buttonList.add(new GuiButton(13, posX + 145, posY + 105, 100, 20, "Religion"));
		this.buttonList.add(new GuiButton(14, posX + 145, posY + 125, 100, 20, "Stealth"));
		this.buttonList.add(new GuiButton(15, posX + 145, posY + 145, 100, 20, "Streetwise"));
		this.buttonList.add(new GuiButton(16, posX + 145, posY + 165, 100, 20, "Thievery"));	

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
        
        drawCenteredString(fontRendererObj, "Choose your Skills", width / 2, height / 2 - 119, 0xFFFFFF);

      
        super.drawScreen(i, j, f);
	}
	
}