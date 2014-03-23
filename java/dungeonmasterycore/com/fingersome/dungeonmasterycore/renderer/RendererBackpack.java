package com.fingersome.dungeonmasterycore.renderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.fingersome.dungeonmasterycore.lib.References;
import com.fingersome.dungeonmasterycore.model.ModelBackpack;
import com.fingersome.dungeonmasterycore.tileentity.TileEntityBackpack;

public class RendererBackpack extends TileEntitySpecialRenderer {

	private ModelBackpack model;

	private static final ResourceLocation texture = new ResourceLocation(References.MOD_ID, "textures/model/TextureBackpack.png");
	
	public RendererBackpack(){
		this.model = new ModelBackpack();
	}
	
		@Override
		public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2, float f) 
		{
			int meta = tileentity.blockMetadata;
			this.bindTexture(texture);
			GL11.glPushMatrix();
			GL11.glTranslatef((float)d + 0.5F, (float)d1 + 1.5F, (float)d2 + 0.5F);

			//Sets Orientation

			if(meta == 0) {GL11.glRotatef(180, 0.0F, 1.0F, 0.0F);}
			if(meta == 1) {GL11.glRotatef(90, 0.0F, 1.0F, 0.0F);}
			if(meta == 2) {GL11.glRotatef(0, 0.0F, 1.0F, 0.0F);}
			if(meta == 3) {GL11.glRotatef(270, 0.0F, 1.0F, 0.0F);}
			
			GL11.glScalef(1.0F, -1F, -1F);

			ModelBackpack.renderModel(0.0625F);
			GL11.glPopMatrix();
			
		}

}
