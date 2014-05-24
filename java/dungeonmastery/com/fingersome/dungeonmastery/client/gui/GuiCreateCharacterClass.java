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

public class GuiCreateCharacterClass extends GuiScreen 
{
	
	public final ResourceLocation texture = new ResourceLocation(com.fingersome.dungeonmastery.lib.References.MOD_ID, "textures/gui/creation/GuiCharacterCreationClassFeats.png");
	
	final int xSize = 256;
	final int ySize = 256;
	
	 public GuiCreateCharacterClass(EntityPlayer player)
	    {
	        
	    }
	
	public void initGui()
		{
		int posX = (this.width - xSize) /2;
		int posY = (this.height - ySize) /2;

		this.buttonList.add(new GuiButton(0, posX + 10, posY + 25, 100, 20, "Fighter"));
		this.buttonList.add(new GuiButton(1, posX + 10, posY + 45, 100, 20, "Ranger"));
		this.buttonList.add(new GuiButton(2, posX + 10, posY + 65, 100, 20, "Barbarian"));
		this.buttonList.add(new GuiButton(3, posX + 10, posY + 85, 100, 20, "Monk"));
		this.buttonList.add(new GuiButton(4, posX + 10, posY + 105, 100, 20, "Rogue"));
		this.buttonList.add(new GuiButton(5, posX + 10, posY + 125, 100, 20, "Bard"));
		this.buttonList.add(new GuiButton(6, posX + 10, posY + 145, 100, 20, "Wizard"));		
		this.buttonList.add(new GuiButton(7, posX + 10, posY + 165, 100, 20, "Warlock"));
		this.buttonList.add(new GuiButton(8, posX + 10, posY + 185, 100, 20, "Paladin"));
		this.buttonList.add(new GuiButton(9, posX + 10, posY + 205, 100, 20, "Cleric"));

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
        
        drawCenteredString(fontRendererObj, "Choose your Class", width / 2, height / 2 - 119, 0xFFFFFF);

      
        super.drawScreen(i, j, f);
	}
	
}
