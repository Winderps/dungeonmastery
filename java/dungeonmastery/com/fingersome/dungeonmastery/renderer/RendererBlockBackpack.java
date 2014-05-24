package com.fingersome.dungeonmastery.renderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.fingersome.dungeonmastery.lib.References;
import com.fingersome.dungeonmastery.model.ModelBackpack;
import com.fingersome.dungeonmastery.tileentity.TileEntityBackpack;

public class RendererBlockBackpack extends TileEntitySpecialRenderer 
{

	private ModelBackpack model;

	private static final ResourceLocation texture = new ResourceLocation(References.MOD_ID, "textures/model/TextureBackpack.png");
	
	public RendererBlockBackpack(){
		this.model = new ModelBackpack();
	}
	
		public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f) 
		{
			int meta = tileentity.blockMetadata;
			this.bindTexture(texture);
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);

			if(meta == 0) {GL11.glRotatef(180, 0.0F, 1.0F, 0.0F);}
			if(meta == 1) {GL11.glRotatef(90, 0.0F, 1.0F, 0.0F);}
			if(meta == 2) {GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);}
			if(meta == 3) {GL11.glRotatef(270, 0.0F, 1.0F, 0.0F);}
			
			GL11.glScalef(1.0F, -1F, -1F);

			ModelBackpack.renderModel(0.0625F);
			GL11.glPopMatrix();
			
		}

}
