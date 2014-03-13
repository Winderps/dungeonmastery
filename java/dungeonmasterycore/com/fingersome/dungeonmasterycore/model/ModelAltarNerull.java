package com.fingersome.dungeonmasterycore.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAltarNerull extends ModelBase
{
  //fields
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
    ModelRenderer Cloth1;
    ModelRenderer Cloth2;
    ModelRenderer SymbolJaw;
    ModelRenderer SymbolToothLeft;
    ModelRenderer SymbolToothMiddle;
    ModelRenderer SymbolToothRight;
    ModelRenderer SymbolHead1;
    ModelRenderer SymbolHead2;
    ModelRenderer SymbolHead3;
    ModelRenderer SymbolHead4;
    ModelRenderer SymbolHead5;
    ModelRenderer SymbolHead6;
  
  public ModelAltarNerull()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 10, 1, 6);
      Base.setRotationPoint(-5F, 22F, -3F);
      Base.setTextureSize(128, 64);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Foot1 = new ModelRenderer(this, 0, 0);
      Foot1.addBox(0F, 0F, 0F, 2, 1, 1);
      Foot1.setRotationPoint(-6F, 23F, 2F);
      Foot1.setTextureSize(128, 64);
      Foot1.mirror = true;
      setRotation(Foot1, 0F, 0F, 0F);
      Foot2 = new ModelRenderer(this, 0, 0);
      Foot2.addBox(0F, 0F, 0F, 2, 1, 1);
      Foot2.setRotationPoint(4F, 23F, 2F);
      Foot2.setTextureSize(128, 64);
      Foot2.mirror = true;
      setRotation(Foot2, 0F, 0F, 0F);
      Foot3 = new ModelRenderer(this, 0, 0);
      Foot3.addBox(0F, 0F, 0F, 2, 1, 1);
      Foot3.setRotationPoint(-6F, 23F, -3F);
      Foot3.setTextureSize(128, 64);
      Foot3.mirror = true;
      setRotation(Foot3, 0F, 0F, 0F);
      Foot4 = new ModelRenderer(this, 0, 0);
      Foot4.addBox(0F, 0F, 0F, 2, 1, 1);
      Foot4.setRotationPoint(4F, 23F, -3F);
      Foot4.setTextureSize(128, 64);
      Foot4.mirror = true;
      setRotation(Foot4, 0F, 0F, 0F);
      Pillar1 = new ModelRenderer(this, 0, 0);
      Pillar1.addBox(0F, 0F, 0F, 2, 6, 2);
      Pillar1.setRotationPoint(-4F, 16F, -1F);
      Pillar1.setTextureSize(128, 64);
      Pillar1.mirror = true;
      setRotation(Pillar1, 0F, 0F, 0F);
      Pillar2 = new ModelRenderer(this, 0, 0);
      Pillar2.addBox(0F, 0F, 0F, 2, 6, 2);
      Pillar2.setRotationPoint(2F, 16F, -1F);
      Pillar2.setTextureSize(128, 64);
      Pillar2.mirror = true;
      setRotation(Pillar2, 0F, 0F, 0F);
      Crossbar = new ModelRenderer(this, 0, 0);
      Crossbar.addBox(0F, 0F, 0F, 4, 1, 1);
      Crossbar.setRotationPoint(-2F, 19F, 0F);
      Crossbar.setTextureSize(128, 64);
      Crossbar.mirror = true;
      setRotation(Crossbar, 0F, 0F, 0F);
      Platform = new ModelRenderer(this, 0, 0);
      Platform.addBox(0F, 0F, 0F, 10, 1, 6);
      Platform.setRotationPoint(-5F, 15F, -3F);
      Platform.setTextureSize(128, 64);
      Platform.mirror = true;
      setRotation(Platform, 0F, 0F, 0F);
      Support1 = new ModelRenderer(this, 0, 0);
      Support1.addBox(0F, 0F, 0F, 1, 1, 1);
      Support1.setRotationPoint(-4F, 14F, 1F);
      Support1.setTextureSize(128, 64);
      Support1.mirror = true;
      setRotation(Support1, 0F, 0F, 0F);
      Support2 = new ModelRenderer(this, 0, 0);
      Support2.addBox(0F, 0F, 0F, 1, 1, 1);
      Support2.setRotationPoint(3F, 14F, 1F);
      Support2.setTextureSize(128, 64);
      Support2.mirror = true;
      setRotation(Support2, 0F, 0F, 0F);
      Support3 = new ModelRenderer(this, 0, 0);
      Support3.addBox(0F, 0F, 0F, 1, 1, 1);
      Support3.setRotationPoint(-4F, 14F, -2F);
      Support3.setTextureSize(128, 64);
      Support3.mirror = true;
      setRotation(Support3, 0F, 0F, 0F);
      Support4 = new ModelRenderer(this, 0, 0);
      Support4.addBox(0F, 0F, 0F, 1, 1, 1);
      Support4.setRotationPoint(3F, 14F, -2F);
      Support4.setTextureSize(128, 64);
      Support4.mirror = true;
      setRotation(Support4, 0F, 0F, 0F);
      Surface = new ModelRenderer(this, 0, 0);
      Surface.addBox(0F, 0F, 0F, 12, 1, 8);
      Surface.setRotationPoint(-6F, 13F, -4F);
      Surface.setTextureSize(128, 64);
      Surface.mirror = true;
      setRotation(Surface, 0F, 0F, 0F);
      Spacer1 = new ModelRenderer(this, 0, 0);
      Spacer1.addBox(0F, 0F, 0F, 1, 1, 4);
      Spacer1.setRotationPoint(-2F, 12F, -2F);
      Spacer1.setTextureSize(128, 64);
      Spacer1.mirror = true;
      setRotation(Spacer1, 0F, 0F, 0F);
      Spacer2 = new ModelRenderer(this, 15, 4);
      Spacer2.addBox(0F, 0F, 0F, 1, 1, 4);
      Spacer2.setRotationPoint(1F, 12F, -2F);
      Spacer2.setTextureSize(128, 64);
      Spacer2.mirror = true;
      setRotation(Spacer2, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 0);
      Top.addBox(0F, 0F, 0F, 6, 1, 6);
      Top.setRotationPoint(-3F, 11F, -3F);
      Top.setTextureSize(128, 64);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      Ornament1 = new ModelRenderer(this, 0, 0);
      Ornament1.addBox(0F, 0F, 0F, 1, 1, 1);
      Ornament1.setRotationPoint(-5F, 12F, 2F);
      Ornament1.setTextureSize(128, 64);
      Ornament1.mirror = true;
      setRotation(Ornament1, 0F, 0F, 0F);
      Ornament2 = new ModelRenderer(this, 0, 0);
      Ornament2.addBox(0F, 0F, 0F, 1, 1, 1);
      Ornament2.setRotationPoint(4F, 12F, 2F);
      Ornament2.setTextureSize(128, 64);
      Ornament2.mirror = true;
      setRotation(Ornament2, 0F, 0F, 0F);
      Ornament3 = new ModelRenderer(this, 0, 0);
      Ornament3.addBox(0F, 0F, 0F, 1, 1, 1);
      Ornament3.setRotationPoint(-5F, 12F, -3F);
      Ornament3.setTextureSize(128, 64);
      Ornament3.mirror = true;
      setRotation(Ornament3, 0F, 0F, 0F);
      Ornament4 = new ModelRenderer(this, 0, 0);
      Ornament4.addBox(0F, 0F, 0F, 1, 1, 1);
      Ornament4.setRotationPoint(4F, 12F, -3F);
      Ornament4.setTextureSize(128, 64);
      Ornament4.mirror = true;
      setRotation(Ornament4, 0F, 0F, 0F);
      Cloth1 = new ModelRenderer(this, 0, 12);
      Cloth1.addBox(0F, 0F, 0F, 1, 6, 6);
      Cloth1.setRotationPoint(-6F, 14F, -3F);
      Cloth1.setTextureSize(128, 64);
      Cloth1.mirror = true;
      setRotation(Cloth1, 0F, 0F, 0F);
      Cloth2 = new ModelRenderer(this, 0, 12);
      Cloth2.addBox(0F, 0F, 0F, 1, 6, 6);
      Cloth2.setRotationPoint(5F, 14F, -3F);
      Cloth2.setTextureSize(128, 64);
      Cloth2.mirror = true;
      setRotation(Cloth2, 0F, 0F, 0F);
      SymbolJaw = new ModelRenderer(this, 64, 0);
      SymbolJaw.addBox(0F, 0F, 0F, 6, 2, 2);
      SymbolJaw.setRotationPoint(-3F, 7F, -1F);
      SymbolJaw.setTextureSize(128, 64);
      SymbolJaw.mirror = true;
      setRotation(SymbolJaw, 0F, 0F, 0F);
      SymbolToothLeft = new ModelRenderer(this, 64, 0);
      SymbolToothLeft.addBox(0F, 0F, 0F, 1, 2, 2);
      SymbolToothLeft.setRotationPoint(-3F, 9F, -1F);
      SymbolToothLeft.setTextureSize(128, 64);
      SymbolToothLeft.mirror = true;
      setRotation(SymbolToothLeft, 0F, 0F, 0F);
      SymbolToothMiddle = new ModelRenderer(this, 64, 0);
      SymbolToothMiddle.addBox(0F, 0F, 0F, 2, 2, 2);
      SymbolToothMiddle.setRotationPoint(-1F, 9F, -1F);
      SymbolToothMiddle.setTextureSize(128, 64);
      SymbolToothMiddle.mirror = true;
      setRotation(SymbolToothMiddle, 0F, 0F, 0F);
      SymbolToothRight = new ModelRenderer(this, 64, 0);
      SymbolToothRight.addBox(0F, 0F, 0F, 1, 2, 2);
      SymbolToothRight.setRotationPoint(2F, 9F, -1F);
      SymbolToothRight.setTextureSize(128, 64);
      SymbolToothRight.mirror = true;
      setRotation(SymbolToothRight, 0F, 0F, 0F);
      SymbolHead1 = new ModelRenderer(this, 64, 0);
      SymbolHead1.addBox(0F, 0F, 0F, 2, 8, 2);
      SymbolHead1.setRotationPoint(-4F, 3F, -1F);
      SymbolHead1.setTextureSize(128, 64);
      SymbolHead1.mirror = true;
      setRotation(SymbolHead1, 0F, 0F, -1.570796F);
      SymbolHead2 = new ModelRenderer(this, 64, 0);
      SymbolHead2.addBox(0F, 0F, 0F, 2, 8, 2);
      SymbolHead2.setRotationPoint(-4F, 7F, -1F);
      SymbolHead2.setTextureSize(128, 64);
      SymbolHead2.mirror = true;
      setRotation(SymbolHead2, 0F, 0F, -1.570796F);
      SymbolHead3 = new ModelRenderer(this, 64, 0);
      SymbolHead3.addBox(0F, 0F, 0F, 1, 2, 2);
      SymbolHead3.setRotationPoint(-4F, 3F, -1F);
      SymbolHead3.setTextureSize(128, 64);
      SymbolHead3.mirror = true;
      setRotation(SymbolHead3, 0F, 0F, 0F);
      SymbolHead4 = new ModelRenderer(this, 64, 0);
      SymbolHead4.addBox(0F, 0F, 0F, 2, 2, 2);
      SymbolHead4.setRotationPoint(-1F, 3F, -1F);
      SymbolHead4.setTextureSize(128, 64);
      SymbolHead4.mirror = true;
      setRotation(SymbolHead4, 0F, 0F, 0F);
      SymbolHead5 = new ModelRenderer(this, 64, 0);
      SymbolHead5.addBox(0F, 0F, 0F, 1, 2, 2);
      SymbolHead5.setRotationPoint(3F, 3F, -1F);
      SymbolHead5.setTextureSize(128, 64);
      SymbolHead5.mirror = true;
      setRotation(SymbolHead5, 0F, 0F, 0F);
      SymbolHead6 = new ModelRenderer(this, 64, 0);
      SymbolHead6.addBox(0F, 0F, 0F, 1, 6, 2);
      SymbolHead6.setRotationPoint(-3F, 1F, -1F);
      SymbolHead6.setTextureSize(128, 64);
      SymbolHead6.mirror = true;
      setRotation(SymbolHead6, 0F, 0F, -1.570796F);
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
    Cloth1.render(f5);
    Cloth2.render(f5);
    SymbolJaw.render(f5);
    SymbolToothLeft.render(f5);
    SymbolToothMiddle.render(f5);
    SymbolToothRight.render(f5);
    SymbolHead1.render(f5);
    SymbolHead2.render(f5);
    SymbolHead3.render(f5);
    SymbolHead4.render(f5);
    SymbolHead5.render(f5);
    SymbolHead6.render(f5);
  }
  
  public void renderModel(float f)
  {
    Base.render(f);
    Foot1.render(f);
    Foot2.render(f);
    Foot3.render(f);
    Foot4.render(f);
    Pillar1.render(f);
    Pillar2.render(f);
    Crossbar.render(f);
    Platform.render(f);
    Support1.render(f);
    Support2.render(f);
    Support3.render(f);
    Support4.render(f);
    Surface.render(f);
    Spacer1.render(f);
    Spacer2.render(f);
    Top.render(f);
    Ornament1.render(f);
    Ornament2.render(f);
    Ornament3.render(f);
    Ornament4.render(f);
    Cloth1.render(f);
    Cloth2.render(f);
    SymbolJaw.render(f);
    SymbolToothLeft.render(f);
    SymbolToothMiddle.render(f);
    SymbolToothRight.render(f);
    SymbolHead1.render(f);
    SymbolHead2.render(f);
    SymbolHead3.render(f);
    SymbolHead4.render(f);
    SymbolHead5.render(f);
    SymbolHead6.render(f);
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