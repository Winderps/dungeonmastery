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
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.fingersome.dungeonmasterycore.DungeonMasteryCore;
import com.fingersome.dungeonmasterycore.lib.References;

public class GuiCreateCharacterRace extends GuiScreen 
{
	final int xSize = 256;
	final int ySize = 256;
	
	public final ResourceLocation texture = new ResourceLocation(com.fingersome.dungeonmasterycore.lib.References.MOD_ID, "textures/gui/GuiCharacterCreationRace.png");
	
	 public GuiCreateCharacterRace(EntityPlayer player)
	    {
	    
	    }
	
	public void initGui()
		{
		int posX = (width - xSize) /2;
		int posY = (height - ySize) /2;
		
		this.buttonList.add(new GuiButton(0, posX + 10, posY + 60, 100, 20, "Human"));
		this.buttonList.add(new GuiButton(1, posX + 10, posY + 80, 100, 20, "Elf"));
		this.buttonList.add(new GuiButton(2, posX + 10, posY + 100, 100, 20, "Dwarf"));
		this.buttonList.add(new GuiButton(3, posX + 10, posY + 120, 100, 20, "Halfling"));
		this.buttonList.add(new GuiButton(4, posX + 10, posY + 140, 100, 20, "Gnome"));
		this.buttonList.add(new GuiButton(5, posX + 10, posY + 160, 100, 20, "Tiefling"));
		this.buttonList.add(new GuiButton(5, posX + 10, posY + 180, 100, 20, "Half-Elf"));
		this.buttonList.add(new GuiButton(5, posX + 10, posY + 200, 100, 20, "Half-Orc"));
		this.buttonList.add(new GuiButton(5, posX + 10, posY + 220, 100, 20, "Warforged"));
		
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
        
        drawCenteredString(fontRendererObj, "Choose your Race", width / 2, height / 2 - 119, 0xFFFFFF);
        drawString(fontRendererObj, "Choose Name", width / 2 - 105, height / 2 - 91, 0xFFFFFF);
        
        super.drawScreen(i, j, f);
	}

}
