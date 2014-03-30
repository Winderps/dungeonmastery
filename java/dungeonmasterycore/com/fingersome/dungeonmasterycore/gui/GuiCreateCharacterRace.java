package com.fingersome.dungeonmasterycore.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiLabel;
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
	
	public final ResourceLocation texture = new ResourceLocation(com.fingersome.dungeonmasterycore.lib.References.MOD_ID, "textures/gui/creation/GuiCharacterCreationRace.png");
	
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
		this.buttonList.add(new GuiButton(6, posX + 10, posY + 180, 100, 20, "Half-Elf"));
		this.buttonList.add(new GuiButton(7, posX + 10, posY + 200, 100, 20, "Half-Orc"));
		this.buttonList.add(new GuiButton(8, posX + 10, posY + 220, 100, 20, "Warforged"));
		
		this.buttonList.add(new GuiButton(20, posX + 145, posY + 230, 100, 20, "Next"));
		}

	protected void actionPerformed(GuiButton button, EntityPlayer player, World world, int x, int y, int z)
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
				
			case 20: player.openGui(DungeonMasteryCore.instance, 1, world, x, y, z);
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
	
/*	
	public static void drawPlayerOnGui (Minecraft par0Minecraft, int par1, int par2, int par3, float par4, float par5)
    {
        GL11.glEnable(GL11.GL_COLOR_MATERIAL);
        GL11.glPushMatrix();
        GL11.glTranslatef((float) par1, (float) par2, 50.0F);
        GL11.glScalef((float) (-par3), (float) par3, (float) par3);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        float f2 = par0Minecraft.thePlayer.renderYawOffset;
        float f3 = par0Minecraft.thePlayer.rotationYaw;
        float f4 = par0Minecraft.thePlayer.rotationPitch;
        par4 -= 19;
        GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-((float) Math.atan((double) (par5 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
        par0Minecraft.thePlayer.renderYawOffset = (float) Math.atan((double) (par4 / 40.0F)) * 20.0F;
        par0Minecraft.thePlayer.rotationYaw = (float) Math.atan((double) (par4 / 40.0F)) * 40.0F;
        par0Minecraft.thePlayer.rotationPitch = -((float) Math.atan((double) (par5 / 40.0F))) * 20.0F;
        par0Minecraft.thePlayer.rotationYawHead = par0Minecraft.thePlayer.rotationYaw;
        GL11.glTranslatef(0.0F, par0Minecraft.thePlayer.yOffset, 0.0F);
        RenderManager.instance.playerViewY = 180.0F;
        RenderManager.instance.renderEntityWithPosYaw(par0Minecraft.thePlayer, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
        par0Minecraft.thePlayer.renderYawOffset = f2;
        par0Minecraft.thePlayer.rotationYaw = f3;
        par0Minecraft.thePlayer.rotationPitch = f4;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    */
}
