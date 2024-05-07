package com.seacroak.bronze.item;

import com.seacroak.bronze.material.BronzeToolMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class BronzeAxe extends AxeItem {
  public BronzeAxe(ToolMaterial toolMaterial) {
    super(toolMaterial, getItemSettings());
  }

  private static Settings getItemSettings() {
    return (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(BronzeToolMaterial.INSTANCE, 5.5F, -3.1F));
  }
}
