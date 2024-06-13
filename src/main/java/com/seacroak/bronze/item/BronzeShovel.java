package com.seacroak.bronze.item;

import com.seacroak.bronze.material.BronzeToolMaterial;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class BronzeShovel extends ShovelItem {
  public BronzeShovel(ToolMaterial toolMaterial) {
    super(toolMaterial, getItemSettings());
  }

  private static Settings getItemSettings() {
    return (new Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(BronzeToolMaterial.INSTANCE, 1.5F, -3.0F));
  }
}
