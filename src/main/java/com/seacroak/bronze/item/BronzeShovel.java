package com.seacroak.bronze.item;

import com.seacroak.bronze.material.BronzeToolMaterial;
import net.minecraft.item.*;

public class BronzeShovel extends ShovelItem {
  public BronzeShovel(ToolMaterial toolMaterial) {
    super(toolMaterial, getItemSettings());
  }

  private static Settings getItemSettings() {
    return (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(BronzeToolMaterial.INSTANCE, 1.5F, -3.0F));
  }
}
