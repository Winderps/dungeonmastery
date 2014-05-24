package com.fingersome.dungeonmastery.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBastardsword extends ModelBase
{
    ModelRenderer Handle;
    ModelRenderer Handle2;
    ModelRenderer Guard;
    ModelRenderer Guard2;
    ModelRenderer Blade;
    ModelRenderer Blade3;
    ModelRenderer LeftEdge;
    ModelRenderer RightEdge;
    ModelRenderer RTEdge;
    ModelRenderer LTEdge;
    ModelRenderer Point;
  
  public ModelBastardsword()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Handle = new ModelRenderer(this, 0, 19);
      Handle.addBox(0F, 0F, 0F, 1, 5, 1);
      Handle.setRotationPoint(-1F, 19F, 0F);
      Handle.setTextureSize(64, 32);
      Handle.mirror = true;
      setRotation(Handle, 0F, 0F, 0F);
      Handle2 = new ModelRenderer(this, 0, 18);
      Handle2.addBox(0F, 0F, 0F, 1, 3, 1);
      Handle2.setRotationPoint(-1F, 15F, 0F);
      Handle2.setTextureSize(64, 32);
      Handle2.mirror = true;
      setRotation(Handle2, 0F, 0F, 0F);
      Guard = new ModelRenderer(this, 16, 0);
      Guard.addBox(0F, 0F, 0F, 9, 1, 1);
      Guard.setRotationPoint(-5F, 14F, 0F);
      Guard.setTextureSize(64, 32);
      Guard.mirror = true;
      setRotation(Guard, 0F, 0F, 0F);
      Guard2 = new ModelRenderer(this, 16, 0);
      Guard2.addBox(0F, 0F, 0F, 7, 1, 1);
      Guard2.setRotationPoint(-4F, 18F, 0F);
      Guard2.setTextureSize(64, 32);
      Guard2.mirror = true;
      setRotation(Guard2, 0F, 0F, 0F);
      Blade = new ModelRenderer(this, 0, 0);
      Blade.addBox(0F, 0F, 0F, 3, 17, 1);
      Blade.setRotationPoint(-2F, -3F, 0F);
      Blade.setTextureSize(64, 32);
      Blade.mirror = true;
      setRotation(Blade, 0F, 0F, 0F);
      Blade3 = new ModelRenderer(this, 26, 14);
      Blade3.addBox(0F, 0F, 0F, 1, 1, 1);
      Blade3.setRotationPoint(-1F, -4F, 0F);
      Blade3.setTextureSize(64, 32);
      Blade3.mirror = true;
      setRotation(Blade3, 0F, 0F, 0F);
      LeftEdge = new ModelRenderer(this, 12, 0);
      LeftEdge.addBox(0F, 0F, 0F, 1, 17, 1);
      LeftEdge.setRotationPoint(1F, -3F, 0F);
      LeftEdge.setTextureSize(64, 32);
      LeftEdge.mirror = true;
      setRotation(LeftEdge, 0F, 0F, 0F);
      RightEdge = new ModelRenderer(this, 12, 0);
      RightEdge.addBox(0F, 0F, 0F, 1, 17, 1);
      RightEdge.setRotationPoint(-3F, -3F, 0F);
      RightEdge.setTextureSize(64, 32);
      RightEdge.mirror = true;
      setRotation(RightEdge, 0F, 0F, 0F);
      RTEdge = new ModelRenderer(this, 12, 2);
      RTEdge.addBox(0F, 0F, 0F, 1, 1, 1);
      RTEdge.setRotationPoint(-2F, -4F, 0F);
      RTEdge.setTextureSize(64, 32);
      RTEdge.mirror = true;
      setRotation(RTEdge, 0F, 0F, 0F);
      LTEdge = new ModelRenderer(this, 12, 2);
      LTEdge.addBox(0F, 0F, 0F, 1, 1, 1);
      LTEdge.setRotationPoint(0F, -4F, 0F);
      LTEdge.setTextureSize(64, 32);
      LTEdge.mirror = true;
      setRotation(LTEdge, 0F, 0F, 0F);
      Point = new ModelRenderer(this, 12, 2);
      Point.addBox(0F, 0F, 0F, 1, 1, 1);
      Point.setRotationPoint(-1F, -5F, 0F);
      Point.setTextureSize(64, 32);
      Point.mirror = true;
      setRotation(Point, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Handle.render(f5);
    Handle2.render(f5);
    Guard.render(f5);
    Guard2.render(f5);
    Blade.render(f5);
    Blade3.render(f5);
    LeftEdge.render(f5);
    RightEdge.render(f5);
    RTEdge.render(f5);
    LTEdge.render(f5);
    Point.render(f5);
  }
  
  public void renderModel(float f5)
  {
    Handle.render(f5);
    Handle2.render(f5);
    Guard.render(f5);
    Guard2.render(f5);
    Blade.render(f5);
    Blade3.render(f5);
    LeftEdge.render(f5);
    RightEdge.render(f5);
    RTEdge.render(f5);
    LTEdge.render(f5);
    Point.render(f5);
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
