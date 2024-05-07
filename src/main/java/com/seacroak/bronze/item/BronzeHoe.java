package com.seacroak.bronze.item;

import com.seacroak.bronze.material.BronzeToolMaterial;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class BronzeHoe extends HoeItem {
  public BronzeHoe(ToolMaterial toolMaterial) {
    super(toolMaterial, getItemSettings());
  }

  private static Settings getItemSettings() {
    return (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(BronzeToolMaterial.INSTANCE, -2.5F, -1.0F));
  }
}
