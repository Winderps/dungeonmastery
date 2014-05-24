package com.fingersome.dungeonmastery.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelRapier extends ModelBase
{
    ModelRenderer Handle;
    ModelRenderer Guard;
    ModelRenderer Blade;
    ModelRenderer Suba;
    ModelRenderer Guard1;
    ModelRenderer Guard2;
    ModelRenderer Guard3;
    ModelRenderer Guard4;
  
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
      Guard1 = new ModelRenderer(this, 16, 0);
      Guard1.addBox(0F, 0F, 0F, 1, 1, 5);
      Guard1.setRotationPoint(2F, 18F, -2F);
      Guard1.setTextureSize(64, 32);
      Guard1.mirror = true;
      setRotation(Guard1, 0F, 0F, 0F);
      Guard2 = new ModelRenderer(this, 16, 0);
      Guard2.addBox(0F, 0F, 0F, 1, 3, 5);
      Guard2.setRotationPoint(3F, 19F, -2F);
      Guard2.setTextureSize(64, 32);
      Guard2.mirror = true;
      setRotation(Guard2, 0F, 0F, 0F);
      Guard3 = new ModelRenderer(this, 16, 0);
      Guard3.addBox(0F, 0F, 0F, 1, 1, 3);
      Guard3.setRotationPoint(2F, 22F, -1F);
      Guard3.setTextureSize(64, 32);
      Guard3.mirror = true;
      setRotation(Guard3, 0F, 0F, 0F);
      Guard4 = new ModelRenderer(this, 16, 0);
      Guard4.addBox(0F, 0F, 0F, 2, 1, 3);
      Guard4.setRotationPoint(0F, 23F, -1F);
      Guard4.setTextureSize(64, 32);
      Guard4.mirror = true;
      setRotation(Guard4, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Handle.render(f5);
    Guard.render(f5);
    Blade.render(f5);
    Suba.render(f5);
    Blade.render(f5);
    Guard1.render(f5);
    Guard2.render(f5);
    Guard3.render(f5);
    Guard4.render(f5);
  }
  
  public void renderModel(float f5)
  {
    Handle.render(f5);
    Guard.render(f5);
    Blade.render(f5);
    Suba.render(f5);
    Blade.render(f5);
    Guard1.render(f5);
    Guard2.render(f5);
    Guard3.render(f5);
    Guard4.render(f5);
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
