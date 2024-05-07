package com.seacroak.bronze.item;

import com.seacroak.bronze.material.BronzeToolMaterial;
import net.minecraft.item.*;

public class BronzePickaxe extends PickaxeItem {
  public BronzePickaxe(ToolMaterial toolMaterial) {
    super(toolMaterial, getItemSettings());
  }

   private static Settings getItemSettings() {
     return (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(BronzeToolMaterial.INSTANCE, 1.0F, -2.8F));
   }

}
