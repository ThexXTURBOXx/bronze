package com.seacroak.bronze.item;

import com.seacroak.bronze.material.BronzeToolMaterial;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class BronzePickaxe extends PickaxeItem {
  public BronzePickaxe(ToolMaterial toolMaterial) {
    super(toolMaterial, getItemSettings());
  }

   private static Settings getItemSettings() {
     return (new Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(BronzeToolMaterial.INSTANCE, 1.0F, -2.8F));
   }

}
