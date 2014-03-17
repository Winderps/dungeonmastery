package com.fingersome.dungeonmasterycore.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

import net.minecraft.entity.*;;

public class ModelAltarPelor extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer Foot1;
    ModelRenderer Foot2;
    ModelRenderer Foot3;
    ModelRenderer Foot4;
    ModelRenderer Pillar1;
    ModelRenderer Pillar2;
    ModelRenderer Crossbar;
    ModelRenderer Platform;
    ModelRenderer Support1;
    ModelRenderer Support2;
    ModelRenderer Support3;
    ModelRenderer Support4;
    ModelRenderer Surface;
    ModelRenderer Spacer1;
    ModelRenderer Spacer2;
    ModelRenderer Top;
    ModelRenderer Ornament1;
    ModelRenderer Ornament2;
    ModelRenderer Ornament3;
    ModelRenderer Ornament4;
    ModelRenderer Ornament5;
    ModelRenderer Ornament6;
    ModelRenderer Ornament7;
    ModelRenderer Ornament8;
    ModelRenderer Cloth1;
    ModelRenderer Cloth2;
  
  public ModelAltarPelor()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Base = new ModelRenderer(this, 32, 25);
      Base.addBox(0F, 0F, 0F, 10, 1, 6);
      Base.setRotationPoint(-5F, 22F, -3F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Foot1 = new ModelRenderer(this, 26, 0);
      Foot1.addBox(0F, 0F, 0F, 2, 1, 1);
      Foot1.setRotationPoint(-6F, 23F, 2F);
      Foot1.setTextureSize(64, 32);
      Foot1.mirror = true;
      setRotation(Foot1, 0F, 0F, 0F);
      Foot2 = new ModelRenderer(this, 26, 0);
      Foot2.addBox(0F, 0F, 0F, 2, 1, 1);
      Foot2.setRotationPoint(4F, 23F, 2F);
      Foot2.setTextureSize(64, 32);
      Foot2.mirror = true;
      setRotation(Foot2, 0F, 0F, 0F);
      Foot3 = new ModelRenderer(this, 26, 0);
      Foot3.addBox(0F, 0F, 0F, 2, 1, 1);
      Foot3.setRotationPoint(-6F, 23F, -3F);
      Foot3.setTextureSize(64, 32);
      Foot3.mirror = true;
      setRotation(Foot3, 0F, 0F, 0F);
      Foot4 = new ModelRenderer(this, 26, 0);
      Foot4.addBox(0F, 0F, 0F, 2, 1, 1);
      Foot4.setRotationPoint(4F, 23F, -3F);
      Foot4.setTextureSize(64, 32);
      Foot4.mirror = true;
      setRotation(Foot4, 0F, 0F, 0F);
      Pillar1 = new ModelRenderer(this, 38, 0);
      Pillar1.addBox(0F, 0F, 0F, 2, 6, 2);
      Pillar1.setRotationPoint(-4F, 16F, -1F);
      Pillar1.setTextureSize(64, 32);
      Pillar1.mirror = true;
      setRotation(Pillar1, 0F, 0F, 0F);
      Pillar2 = new ModelRenderer(this, 56, 0);
      Pillar2.addBox(0F, 0F, 0F, 2, 6, 2);
      Pillar2.setRotationPoint(2F, 16F, -1F);
      Pillar2.setTextureSize(64, 32);
      Pillar2.mirror = true;
      setRotation(Pillar2, 0F, 0F, 0F);
      Crossbar = new ModelRenderer(this, 46, 6);
      Crossbar.addBox(0F, 0F, 0F, 4, 1, 1);
      Crossbar.setRotationPoint(-2F, 19F, 0F);
      Crossbar.setTextureSize(64, 32);
      Crossbar.mirror = true;
      setRotation(Crossbar, 0F, 0F, 0F);
      Platform = new ModelRenderer(this, 4, 12);
      Platform.addBox(0F, 0F, 0F, 10, 1, 6);
      Platform.setRotationPoint(-5F, 15F, -3F);
      Platform.setTextureSize(64, 32);
      Platform.mirror = true;
      setRotation(Platform, 0F, 0F, 0F);
      Support1 = new ModelRenderer(this, 41, 14);
      Support1.addBox(0F, 0F, 0F, 1, 1, 1);
      Support1.setRotationPoint(-4F, 14F, 1F);
      Support1.setTextureSize(64, 32);
      Support1.mirror = true;
      setRotation(Support1, 0F, 0F, 0F);
      Support2 = new ModelRenderer(this, 41, 14);
      Support2.addBox(0F, 0F, 0F, 1, 1, 1);
      Support2.setRotationPoint(3F, 14F, 1F);
      Support2.setTextureSize(64, 32);
      Support2.mirror = true;
      setRotation(Support2, 0F, 0F, 0F);
      Support3 = new ModelRenderer(this, 41, 14);
      Support3.addBox(0F, 0F, 0F, 1, 1, 1);
      Support3.setRotationPoint(-4F, 14F, -2F);
      Support3.setTextureSize(64, 32);
      Support3.mirror = true;
      setRotation(Support3, 0F, 0F, 0F);
      Support4 = new ModelRenderer(this, 41, 14);
      Support4.addBox(0F, 0F, 0F, 1, 1, 1);
      Support4.setRotationPoint(3F, 14F, -2F);
      Support4.setTextureSize(64, 32);
      Support4.mirror = true;
      setRotation(Support4, 0F, 0F, 0F);
      Surface = new ModelRenderer(this, 0, 10);
      Surface.addBox(0F, 0F, 0F, 12, 1, 8);
      Surface.setRotationPoint(-6F, 13F, -4F);
      Surface.setTextureSize(64, 32);
      Surface.mirror = true;
      setRotation(Surface, 0F, 0F, 0F);
      Spacer1 = new ModelRenderer(this, 15, 4);
      Spacer1.addBox(0F, 0F, 0F, 1, 1, 4);
      Spacer1.setRotationPoint(-2F, 12F, -2F);
      Spacer1.setTextureSize(64, 32);
      Spacer1.mirror = true;
      setRotation(Spacer1, 0F, 0F, 0F);
      Spacer2 = new ModelRenderer(this, 15, 4);
      Spacer2.addBox(0F, 0F, 0F, 1, 1, 4);
      Spacer2.setRotationPoint(1F, 12F, -2F);
      Spacer2.setTextureSize(64, 32);
      Spacer2.mirror = true;
      setRotation(Spacer2, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 8, 1);
      Top.addBox(0F, 0F, 0F, 6, 1, 6);
      Top.setRotationPoint(-3F, 11F, -3F);
      Top.setTextureSize(64, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      Ornament1 = new ModelRenderer(this, 0, 0);
      Ornament1.addBox(0F, 0F, 0F, 1, 1, 1);
      Ornament1.setRotationPoint(-5F, 12F, 2F);
      Ornament1.setTextureSize(64, 32);
      Ornament1.mirror = true;
      setRotation(Ornament1, 0F, 0F, 0F);
      Ornament2 = new ModelRenderer(this, 0, 0);
      Ornament2.addBox(0F, 0F, 0F, 1, 1, 1);
      Ornament2.setRotationPoint(4F, 12F, 2F);
      Ornament2.setTextureSize(64, 32);
      Ornament2.mirror = true;
      setRotation(Ornament2, 0F, 0F, 0F);
      Ornament3 = new ModelRenderer(this, 0, 0);
      Ornament3.addBox(0F, 0F, 0F, 1, 1, 1);
      Ornament3.setRotationPoint(-5F, 12F, -3F);
      Ornament3.setTextureSize(64, 32);
      Ornament3.mirror = true;
      setRotation(Ornament3, 0F, 0F, 0F);
      Ornament4 = new ModelRenderer(this, 0, 0);
      Ornament4.addBox(0F, 0F, 0F, 1, 1, 1);
      Ornament4.setRotationPoint(4F, 12F, -3F);
      Ornament4.setTextureSize(64, 32);
      Ornament4.mirror = true;
      setRotation(Ornament4, 0F, 0F, 0F);
      Ornament5 = new ModelRenderer(this, 0, 0);
      Ornament5.addBox(0F, 0F, 0F, 1, 1, 3);
      Ornament5.setRotationPoint(-5F, 11F, 0F);
      Ornament5.setTextureSize(64, 32);
      Ornament5.mirror = true;
      setRotation(Ornament5, 0F, 0F, 0F);
      Ornament6 = new ModelRenderer(this, 0, 0);
      Ornament6.addBox(0F, 0F, 0F, 1, 1, 3);
      Ornament6.setRotationPoint(4F, 11F, 0F);
      Ornament6.setTextureSize(64, 32);
      Ornament6.mirror = true;
      setRotation(Ornament6, 0F, 0F, 0F);
      Ornament7 = new ModelRenderer(this, 0, 0);
      Ornament7.addBox(0F, 0F, 0F, 1, 1, 2);
      Ornament7.setRotationPoint(-5F, 11F, -3F);
      Ornament7.setTextureSize(64, 32);
      Ornament7.mirror = true;
      setRotation(Ornament7, 0F, 0F, 0F);
      Ornament8 = new ModelRenderer(this, 0, 0);
      Ornament8.addBox(0F, 0F, 0F, 1, 1, 2);
      Ornament8.setRotationPoint(4F, 11F, -3F);
      Ornament8.setTextureSize(64, 32);
      Ornament8.mirror = true;
      setRotation(Ornament8, 0F, 0F, 0F);
      Cloth1 = new ModelRenderer(this, 0, 20);
      Cloth1.addBox(0F, 0F, 0F, 1, 6, 6);
      Cloth1.setRotationPoint(-6F, 14F, -3F);
      Cloth1.setTextureSize(64, 32);
      Cloth1.mirror = true;
      setRotation(Cloth1, 0F, 0F, 0F);
      Cloth2 = new ModelRenderer(this, 0, 20);
      Cloth2.addBox(0F, 0F, 0F, 1, 6, 6);
      Cloth2.setRotationPoint(5F, 14F, -3F);
      Cloth2.setTextureSize(64, 32);
      Cloth2.mirror = true;
      setRotation(Cloth2, 0F, 0F, 0F);
  }
  
  public void renderModel(float f5)
  {
    Base.render(f5);
    Foot1.render(f5);
    Foot2.render(f5);
    Foot3.render(f5);
    Foot4.render(f5);
    Pillar1.render(f5);
    Pillar2.render(f5);
    Crossbar.render(f5);
    Platform.render(f5);
    Support1.render(f5);
    Support2.render(f5);
    Support3.render(f5);
    Support4.render(f5);
    Surface.render(f5);
    Spacer1.render(f5);
    Spacer2.render(f5);
    Top.render(f5);
    Ornament1.render(f5);
    Ornament2.render(f5);
    Ornament3.render(f5);
    Ornament4.render(f5);
    Ornament5.render(f5);
    Ornament6.render(f5);
    Ornament7.render(f5);
    Ornament8.render(f5);
    Cloth1.render(f5);
    Cloth2.render(f5);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Foot1.render(f5);
    Foot2.render(f5);
    Foot3.render(f5);
    Foot4.render(f5);
    Pillar1.render(f5);
    Pillar2.render(f5);
    Crossbar.render(f5);
    Platform.render(f5);
    Support1.render(f5);
    Support2.render(f5);
    Support3.render(f5);
    Support4.render(f5);
    Surface.render(f5);
    Spacer1.render(f5);
    Spacer2.render(f5);
    Top.render(f5);
    Ornament1.render(f5);
    Ornament2.render(f5);
    Ornament3.render(f5);
    Ornament4.render(f5);
    Ornament5.render(f5);
    Ornament6.render(f5);
    Ornament7.render(f5);
    Ornament8.render(f5);
    Cloth1.render(f5);
    Cloth2.render(f5);
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