package com.fingersome.dungeonmasterycore.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRapier extends ModelBase
{
    ModelRenderer Handle;
    ModelRenderer Guard;
    ModelRenderer Blade;
    ModelRenderer Suba;
  
  public ModelRapier()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Handle = new ModelRenderer(this, 0, 22);
      Handle.addBox(0F, 0F, 0F, 1, 6, 1);
      Handle.setRotationPoint(-1F, 18F, 0F);
      Handle.setTextureSize(64, 32);
      Handle.mirror = true;
      setRotation(Handle, 0F, 0F, 0F);
      Guard = new ModelRenderer(this, 16, 0);
      Guard.addBox(0F, 0F, 0F, 5, 1, 5);
      Guard.setRotationPoint(-3F, 17F, -2F);
      Guard.setTextureSize(64, 32);
      Guard.mirror = true;
      setRotation(Guard, 0F, 0F, 0F);
      Blade = new ModelRenderer(this, 0, 0);
      Blade.addBox(0F, 0F, 0F, 1, 20, 1);
      Blade.setRotationPoint(-1F, -4F, 0F);
      Blade.setTextureSize(64, 32);
      Blade.mirror = true;
      setRotation(Blade, 0F, 0F, 0F);
      Suba = new ModelRenderer(this, 20, 0);
      Suba.addBox(0F, 0F, 0F, 3, 1, 3);
      Suba.setRotationPoint(-2F, 16F, -1F);
      Suba.setTextureSize(64, 32);
      Suba.mirror = true;
      setRotation(Suba, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Handle.render(f5);
    Guard.render(f5);
    Blade.render(f5);
    Suba.render(f5);
  }
  
  public void renderModel(float f5)
  {
    Handle.render(f5);
    Guard.render(f5);
    Blade.render(f5);
    Suba.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
