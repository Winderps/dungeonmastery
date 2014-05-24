package com.fingersome.dungeonmastery.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelScimitar extends ModelBase
{
    ModelRenderer Handle;
    ModelRenderer Guard;
    ModelRenderer Suba;
    ModelRenderer Blade1;
    ModelRenderer Blade2;
    ModelRenderer Blade3;
    ModelRenderer Blade4;
    ModelRenderer Blade5;
    ModelRenderer Blade6;
  
  public ModelScimitar()
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
      Suba = new ModelRenderer(this, 20, 0);
      Suba.addBox(0F, 0F, 0F, 3, 1, 3);
      Suba.setRotationPoint(-2F, 16F, -1F);
      Suba.setTextureSize(64, 32);
      Suba.mirror = true;
      setRotation(Suba, 0F, 0F, 0F);
      Blade1 = new ModelRenderer(this, 0, 0);
      Blade1.addBox(0F, 0F, 0F, 1, 15, 1);
      Blade1.setRotationPoint(0F, 1F, 0F);
      Blade1.setTextureSize(64, 32);
      Blade1.mirror = true;
      setRotation(Blade1, 0F, 0F, 0F);
      Blade2 = new ModelRenderer(this, 0, 0);
      Blade2.addBox(0F, 0F, 0F, 1, 18, 1);
      Blade2.setRotationPoint(-1F, -2F, 0F);
      Blade2.setTextureSize(64, 32);
      Blade2.mirror = true;
      setRotation(Blade2, 0F, 0F, 0F);
      Blade3 = new ModelRenderer(this, 0, 0);
      Blade3.addBox(0F, 0F, 0F, 1, 16, 1);
      Blade3.setRotationPoint(-2F, -4F, 0F);
      Blade3.setTextureSize(64, 32);
      Blade3.mirror = true;
      setRotation(Blade3, 0F, 0F, 0F);
      Blade4 = new ModelRenderer(this, 0, 0);
      Blade4.addBox(0F, 0F, 0F, 1, 8, 1);
      Blade4.setRotationPoint(-3F, -5F, 0F);
      Blade4.setTextureSize(64, 32);
      Blade4.mirror = true;
      setRotation(Blade4, 0F, 0F, 0F);
      Blade5 = new ModelRenderer(this, 0, 0);
      Blade5.addBox(0F, 0F, 0F, 1, 4, 1);
      Blade5.setRotationPoint(-4F, -6F, 0F);
      Blade5.setTextureSize(64, 32);
      Blade5.mirror = true;
      setRotation(Blade5, 0F, 0F, 0F);
      Blade6 = new ModelRenderer(this, 0, 0);
      Blade6.addBox(0F, 0F, 0F, 1, 1, 1);
      Blade6.setRotationPoint(-5F, -6F, 0F);
      Blade6.setTextureSize(64, 32);
      Blade6.mirror = true;
      setRotation(Blade6, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Handle.render(f5);
    Guard.render(f5);
    Suba.render(f5);
    Blade1.render(f5);
    Blade2.render(f5);
    Blade3.render(f5);
    Blade4.render(f5);
    Blade5.render(f5);
    Blade6.render(f5);
  }
  
  public void renderModel(float f5)
  {
    Handle.render(f5);
    Guard.render(f5);
    Suba.render(f5);
    Blade1.render(f5);
    Blade2.render(f5);
    Blade3.render(f5);
    Blade4.render(f5);
    Blade5.render(f5);
    Blade6.render(f5);
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
