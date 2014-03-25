package com.fingersome.dungeonmasterycore.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBackpack extends ModelBase
{
   static ModelRenderer Backpack;
   static  ModelRenderer PocketFront1;
   static  ModelRenderer PocketFront2;
   static  ModelRenderer PocketFront3;
   static  ModelRenderer PocketTop;
   static  ModelRenderer PocketLeft;
   static  ModelRenderer PocketRight;
   static  ModelRenderer StrapLeft;
   static  ModelRenderer StrapRight;
  
  public ModelBackpack()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Backpack = new ModelRenderer(this, 0, 0);
      Backpack.addBox(0F, 0F, 0F, 12, 12, 6);
      Backpack.setRotationPoint(-6F, 12F, -2F);
      Backpack.setTextureSize(64, 32);
      Backpack.mirror = true;
      setRotation(Backpack, 0F, 0F, 0F);
      PocketFront1 = new ModelRenderer(this, 0, 19);
      PocketFront1.addBox(0F, 0F, 0F, 4, 4, 2);
      PocketFront1.setRotationPoint(-5F, 19F, -4F);
      PocketFront1.setTextureSize(64, 32);
      PocketFront1.mirror = true;
      setRotation(PocketFront1, 0F, 0F, 0F);
      PocketFront2 = new ModelRenderer(this, 0, 19);
      PocketFront2.addBox(0F, 0F, 0F, 4, 4, 2);
      PocketFront2.setRotationPoint(1F, 19F, -4F);
      PocketFront2.setTextureSize(64, 32);
      PocketFront2.mirror = true;
      setRotation(PocketFront2, 0F, 0F, 0F);
      PocketFront3 = new ModelRenderer(this, 44, 12);
      PocketFront3.addBox(0F, 0F, 0F, 6, 2, 1);
      PocketFront3.setRotationPoint(-3F, 16F, -3F);
      PocketFront3.setTextureSize(64, 32);
      PocketFront3.mirror = true;
      setRotation(PocketFront3, 0F, 0F, 0F);
      PocketTop = new ModelRenderer(this, 29, 19);
      PocketTop.addBox(0F, 0F, 0F, 10, 4, 7);
      PocketTop.setRotationPoint(-5F, 11F, -4F);
      PocketTop.setTextureSize(64, 32);
      PocketTop.mirror = true;
      setRotation(PocketTop, 0F, 0F, 0F);
      PocketLeft = new ModelRenderer(this, 13, 19);
      PocketLeft.addBox(0F, 0F, 0F, 1, 4, 4);
      PocketLeft.setRotationPoint(-7F, 19F, -1F);
      PocketLeft.setTextureSize(64, 32);
      PocketLeft.mirror = true;
      setRotation(PocketLeft, 0F, 0F, 0F);
      PocketRight = new ModelRenderer(this, 13, 19);
      PocketRight.addBox(0F, 0F, 0F, 1, 4, 4);
      PocketRight.setRotationPoint(6F, 19F, -1F);
      PocketRight.setTextureSize(64, 32);
      PocketRight.mirror = true;
      setRotation(PocketRight, 0F, 0F, 0F);
      StrapLeft = new ModelRenderer(this, 37, 4);
      StrapLeft.addBox(0F, 0F, 0F, 2, 12, 1);
      StrapLeft.setRotationPoint(-5F, 12F, 4F);
      StrapLeft.setTextureSize(64, 32);
      StrapLeft.mirror = true;
      setRotation(StrapLeft, 0F, 0F, 0F);
      StrapRight = new ModelRenderer(this, 37, 4);
      StrapRight.addBox(0F, 0F, 0F, 2, 12, 1);
      StrapRight.setRotationPoint(3F, 12F, 4F);
      StrapRight.setTextureSize(64, 32);
      StrapRight.mirror = true;
      setRotation(StrapRight, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Backpack.render(f5);
    PocketFront1.render(f5);
    PocketFront2.render(f5);
    PocketFront3.render(f5);
    PocketTop.render(f5);
    PocketLeft.render(f5);
    PocketRight.render(f5);
    StrapLeft.render(f5);
    StrapRight.render(f5);
  }
  
  public static void renderModel(float f5)
  {
    Backpack.render(f5);
    PocketFront1.render(f5);
    PocketFront2.render(f5);
    PocketFront3.render(f5);
    PocketTop.render(f5);
    PocketLeft.render(f5);
    PocketRight.render(f5);
    StrapLeft.render(f5);
    StrapRight.render(f5);
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
