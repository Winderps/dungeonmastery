package com.fingersome.dungeonmasterycore.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCorpseSkeleton extends ModelBase
{
  //fields
    ModelRenderer Skull;
    ModelRenderer Bone1;
    ModelRenderer Bone2;
    ModelRenderer Bone3;
    ModelRenderer Bone4;
    ModelRenderer Bone5;
    ModelRenderer Bone6;
    ModelRenderer Bone7;
    ModelRenderer Bone8;
    ModelRenderer Bone9;
  
  public ModelCorpseSkeleton()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Skull = new ModelRenderer(this, 0, 0);
      Skull.addBox(0F, -1F, 0F, 6, 6, 6);
      Skull.setRotationPoint(0F, 16F, -2F);
      Skull.setTextureSize(64, 64);
      Skull.mirror = true;
      setRotation(Skull, 0F, 0F, 0.1745329F);
      Skull.mirror = false;
      Bone1 = new ModelRenderer(this, 7, 6);
      Bone1.addBox(0F, 0F, 0F, 4, 1, 1);
      Bone1.setRotationPoint(-2F, 23F, 2F);
      Bone1.setTextureSize(64, 64);
      Bone1.mirror = true;
      setRotation(Bone1, 0F, 0.8877977F, -0.2001311F);
      Bone2 = new ModelRenderer(this, 8, 6);
      Bone2.addBox(0F, 0F, 0F, 3, 1, 1);
      Bone2.setRotationPoint(-3F, 23F, -2F);
      Bone2.setTextureSize(64, 64);
      Bone2.mirror = true;
      setRotation(Bone2, 0F, -0.1896591F, 0.1605703F);
      Bone3 = new ModelRenderer(this, 6, 6);
      Bone3.addBox(0F, 0F, 0F, 5, 1, 1);
      Bone3.setRotationPoint(2F, 23F, -1F);
      Bone3.setTextureSize(64, 64);
      Bone3.mirror = true;
      setRotation(Bone3, -0.1115358F, -0.4089647F, 0F);
      Bone4 = new ModelRenderer(this, 6, 6);
      Bone4.addBox(-2F, 0F, 0F, 6, 1, 1);
      Bone4.setRotationPoint(0F, 22F, 3F);
      Bone4.setTextureSize(64, 64);
      Bone4.mirror = true;
      setRotation(Bone4, -0.2230717F, -0.4127308F, 0.326738F);
      Bone5 = new ModelRenderer(this, 9, 6);
      Bone5.addBox(0F, 0F, 0F, 3, 1, 1);
      Bone5.setRotationPoint(0F, 22F, -2F);
      Bone5.setTextureSize(64, 64);
      Bone5.mirror = true;
      setRotation(Bone5, 0.4833219F, 0.7063936F, 0.5948578F);
      Bone6 = new ModelRenderer(this, 6, 6);
      Bone6.addBox(-2F, 0F, 0F, 5, 1, 1);
      Bone6.setRotationPoint(5F, 23F, 0F);
      Bone6.setTextureSize(64, 64);
      Bone6.mirror = true;
      setRotation(Bone6, 0.4833219F, 2.714039F, 0.4635966F);
      Bone7 = new ModelRenderer(this, 6, 6);
      Bone7.addBox(0F, 0F, 0F, 6, 1, 1);
      Bone7.setRotationPoint(3F, 23F, 6.466667F);
      Bone7.setTextureSize(64, 64);
      Bone7.mirror = true;
      setRotation(Bone7, 0.1115358F, 1.096769F, -0.2309411F);
      Bone8 = new ModelRenderer(this, 8, 6);
      Bone8.addBox(0F, 0F, 0F, 3, 1, 1);
      Bone8.setRotationPoint(-6F, 23F, 5F);
      Bone8.setTextureSize(64, 64);
      Bone8.mirror = true;
      setRotation(Bone8, 0F, 1.223128F, 0.1605703F);
      Bone9 = new ModelRenderer(this, 8, 6);
      Bone9.addBox(0F, 0F, 0F, 3, 1, 1);
      Bone9.setRotationPoint(-5F, 23F, -5F);
      Bone9.setTextureSize(64, 64);
      Bone9.mirror = true;
      setRotation(Bone9, 0F, 0.1077698F, 0.1605703F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Skull.render(f5);
    Bone1.render(f5);
    Bone2.render(f5);
    Bone3.render(f5);
    Bone4.render(f5);
    Bone5.render(f5);
    Bone6.render(f5);
    Bone7.render(f5);
    Bone8.render(f5);
    Bone9.render(f5);
  }
  
  public void renderModel (float f)
  {
    Skull.render(f);
    Bone1.render(f);
    Bone2.render(f);
    Bone3.render(f);
    Bone4.render(f);
    Bone5.render(f);
    Bone6.render(f);
    Bone7.render(f);
    Bone8.render(f);
    Bone9.render(f);
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
