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
	
	/*protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) 
		{
			int posX = (this.width - xSize) /2;
			int posY = (this.height - ySize) /2;
			
	        drawPlayerOnGui(this.mc, posX + 33, posY + 75, 30, (float) (posX + 51) - this.xSize, (float) (posY + 75 - 50) - this.ySize);
		}

	 public static void drawPlayerOnGui (Minecraft minecraft, int par1, int par2, int par3, float par4, float par5)
	    {
	        GL11.glEnable(GL11.GL_COLOR_MATERIAL);
	        GL11.glPushMatrix();
	        GL11.glTranslatef((float) par1, (float) par2, 50.0F);
	        GL11.glScalef((float) (-par3), (float) par3, (float) par3);
	        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
	        float f2 = minecraft.thePlayer.renderYawOffset;
	        float f3 = minecraft.thePlayer.rotationYaw;
	        float f4 = minecraft.thePlayer.rotationPitch;
	        par4 -= 19;
	        GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
	        RenderHelper.enableStandardItemLighting();
	        GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
	        GL11.glRotatef(-((float) Math.atan((double) (par5 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
	        minecraft.thePlayer.renderYawOffset = (float) Math.atan((double) (par4 / 40.0F)) * 20.0F;
	        minecraft.thePlayer.rotationYaw = (float) Math.atan((double) (par4 / 40.0F)) * 40.0F;
	        minecraft.thePlayer.rotationPitch = -((float) Math.atan((double) (par5 / 40.0F))) * 20.0F;
	        minecraft.thePlayer.rotationYawHead = minecraft.thePlayer.rotationYaw;
	        GL11.glTranslatef(0.0F, minecraft.thePlayer.yOffset, 0.0F);
	        RenderManager.instance.playerViewY = 180.0F;
	        RenderManager.instance.renderEntityWithPosYaw(minecraft.thePlayer, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
	        minecraft.thePlayer.renderYawOffset = f2;
	        minecraft.thePlayer.rotationYaw = f3;
	        minecraft.thePlayer.rotationPitch = f4;
	        GL11.glPopMatrix();
	        RenderHelper.disableStandardItemLighting();
	        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
	        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
	        GL11.glDisable(GL11.GL_TEXTURE_2D);
	        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
	    }
	    */

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
