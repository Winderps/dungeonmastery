package com.fingersome.dungeonmastery.renderer;

import org.lwjgl.opengl.GL11;

import com.fingersome.dungeonmastery.lib.References;
import com.fingersome.dungeonmastery.model.ModelBastardsword;
import com.fingersome.dungeonmastery.model.ModelDagger;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class RendererItemBastardsword implements IItemRenderer
{
	
	private ModelBastardsword bastardsword;
	
	private static final ResourceLocation texture = new ResourceLocation(References.MOD_ID, "textures/model/TextureBastardsword.png");
	
	public RendererItemBastardsword() 
	{
		bastardsword = new ModelBastardsword();
	}


	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		switch(type)
		{
		case EQUIPPED: return true;
		case EQUIPPED_FIRST_PERSON: return true;

		default: return false;
		}

	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{

		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		switch(type)
		{
		case EQUIPPED: 
		{
			GL11.glPushMatrix();
			GL11.glScalef(2F, 2F, 2F);
			GL11.glRotatef(200, 1F, 0F, 1F);
			GL11.glTranslatef(0.001F, -1.2F, 0.2F);
			
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			
			bastardsword.renderModel(.0625F);
			GL11.glPopMatrix();
		}
		
		case EQUIPPED_FIRST_PERSON:
		{
			GL11.glPushMatrix();
			GL11.glScalef(2F, 2F, 2F);
			GL11.glRotatef(200, 1F, 0F, 1F);
			GL11.glTranslatef(0.001F, -1.2F, 0.2F);
			
			Minecraft.getMinecraft().renderEngine.bindTexture(texture);
			
			bastardsword.renderModel(.0625F);
			GL11.glPopMatrix();
		}

		default: break;
		}
		
	}

}
