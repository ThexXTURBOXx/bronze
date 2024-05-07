package com.seacroak.bronze.item;

import com.seacroak.bronze.material.BronzeToolMaterial;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class BronzeSword extends SwordItem {
  public BronzeSword(ToolMaterial toolMaterial) {
    super(toolMaterial, getItemSettings());
  }

  private static Settings getItemSettings() {
    return (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(BronzeToolMaterial.INSTANCE, 3.0F, -2.4F));
  }


}
