package com.fingersome.dungeonmasterycore.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCampfire extends ModelBase
{
  //fields
    ModelRenderer Stone1;
    ModelRenderer Stone2;
    ModelRenderer Stone3;
    ModelRenderer Stone4;
    ModelRenderer Stone5;
    ModelRenderer Stone6;
    ModelRenderer Stone7;
    ModelRenderer Log1;
    ModelRenderer Log2;
    ModelRenderer Log3;
  
  public ModelCampfire()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Stone1 = new ModelRenderer(this, 0, 0);
      Stone1.addBox(0F, 0F, 0F, 4, 2, 2);
      Stone1.setRotationPoint(-5F, 22F, 4F);
      Stone1.setTextureSize(64, 32);
      Stone1.mirror = true;
      setRotation(Stone1, 0F, -0.5948578F, 0F);
      Stone2 = new ModelRenderer(this, 0, 0);
      Stone2.addBox(0F, 0F, 0F, 4, 2, 2);
      Stone2.setRotationPoint(-6F, 22F, -1F);
      Stone2.setTextureSize(64, 32);
      Stone2.mirror = true;
      setRotation(Stone2, 0F, -1.487144F, 0F);
      Stone3 = new ModelRenderer(this, 0, 0);
      Stone3.addBox(0F, 0F, 0F, 4, 2, 2);
      Stone3.setRotationPoint(-7F, 22F, -4F);
      Stone3.setTextureSize(64, 32);
      Stone3.mirror = true;
      setRotation(Stone3, 0F, 0.7435722F, 0F);
      Stone4 = new ModelRenderer(this, 0, 0);
      Stone4.addBox(0F, 0F, 0F, 4, 2, 2);
      Stone4.setRotationPoint(-1F, 22F, -7F);
      Stone4.setTextureSize(64, 32);
      Stone4.mirror = true;
      setRotation(Stone4, 0F, -0.2230717F, 0F);
      Stone5 = new ModelRenderer(this, 0, 0);
      Stone5.addBox(0F, 0F, 0F, 4, 2, 2);
      Stone5.setRotationPoint(5F, 22F, -5F);
      Stone5.setTextureSize(64, 32);
      Stone5.mirror = true;
      setRotation(Stone5, 0.0371786F, -1.115358F, 0F);
      Stone6 = new ModelRenderer(this, 0, 0);
      Stone6.addBox(0F, 0F, 0F, 4, 2, 2);
      Stone6.setRotationPoint(4F, 22F, 4F);
      Stone6.setTextureSize(64, 32);
      Stone6.mirror = true;
      setRotation(Stone6, 0F, 1.189716F, 0F);
      Stone7 = new ModelRenderer(this, 0, 0);
      Stone7.addBox(0F, 0F, 0F, 4, 2, 2);
      Stone7.setRotationPoint(0F, 22F, 6F);
      Stone7.setTextureSize(64, 32);
      Stone7.mirror = true;
      setRotation(Stone7, 0F, 0.2974289F, 0F);
      Log1 = new ModelRenderer(this, 0, 5);
      Log1.addBox(0F, 0F, 0F, 7, 2, 2);
      Log1.setRotationPoint(-4F, 22F, -2F);
      Log1.setTextureSize(64, 32);
      Log1.mirror = true;
      setRotation(Log1, 0F, 0F, 0F);
      Log2 = new ModelRenderer(this, 0, 9);
      Log2.addBox(0F, 0F, 0F, 6, 1, 2);
      Log2.setRotationPoint(-3F, 22F, 2F);
      Log2.setTextureSize(64, 32);
      Log2.mirror = true;
      setRotation(Log2, -1.003822F, 0.0371786F, 0F);
      Log3 = new ModelRenderer(this, 0, 5);
      Log3.addBox(0F, 0F, 0F, 7, 2, 2);
      Log3.setRotationPoint(-1F, 20F, -3F);
      Log3.setTextureSize(64, 32);
      Log3.mirror = true;
      setRotation(Log3, 0F, -1.408966F, 0.2230717F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Stone1.render(f5);
    Stone2.render(f5);
    Stone3.render(f5);
    Stone4.render(f5);
    Stone5.render(f5);
    Stone6.render(f5);
    Stone7.render(f5);
    Log1.render(f5);
    Log2.render(f5);
    Log3.render(f5);
  }
  
  public void renderModel(float f)
  {
    Stone1.render(f);
    Stone2.render(f);
    Stone3.render(f);
    Stone4.render(f);
    Stone5.render(f);
    Stone6.render(f);
    Stone7.render(f);
    Log1.render(f);
    Log2.render(f);
    Log3.render(f);
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
