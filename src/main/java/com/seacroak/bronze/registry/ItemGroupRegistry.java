package com.seacroak.bronze.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;


public class ItemGroupRegistry {
  public static ItemGroup createItemGroup() {
    return FabricItemGroup.builder()
        .icon(() -> new ItemStack(MainRegistry.BRONZE_INGOT))
        .displayName(Text.translatable("bronze.itemGroup"))
        .entries((displayContext, entries) -> {
          entries.add(new ItemStack(MainRegistry.TIN_BLOCK));
          entries.add(new ItemStack(MainRegistry.BRONZE_BLOCK));
          entries.add(new ItemStack(MainRegistry.TIN_ORE));
          entries.add(new ItemStack(MainRegistry.DEEPSLATE_TIN_ORE));
          entries.add(new ItemStack(MainRegistry.TIN_RAW_BLOCK));
          entries.add(new ItemStack(MainRegistry.BRONZE_BLEND_BLOCK));
          entries.add(new ItemStack(MainRegistry.TIN_RAW));
          entries.add(new ItemStack(MainRegistry.BRONZE_BLEND));
          entries.add(new ItemStack(MainRegistry.BRONZE_NUGGET));
          entries.add(new ItemStack(MainRegistry.TIN_INGOT));
          entries.add(new ItemStack(MainRegistry.BRONZE_INGOT));

          entries.add(new ItemStack(MainRegistry.BRONZE_HELMET));
          entries.add(new ItemStack(MainRegistry.BRONZE_CHESTPLATE));
          entries.add(new ItemStack(MainRegistry.BRONZE_LEGGINGS));
          entries.add(new ItemStack(MainRegistry.BRONZE_BOOTS));

          entries.add(new ItemStack(MainRegistry.BRONZE_SWORD));
          entries.add(new ItemStack(MainRegistry.BRONZE_AXE));
          entries.add(new ItemStack(MainRegistry.BRONZE_PICKAXE));
          entries.add(new ItemStack(MainRegistry.BRONZE_SHOVEL));
          entries.add(new ItemStack(MainRegistry.BRONZE_HOE));

          entries.add(new ItemStack(MainRegistry.BRONZE_HORSE_ARMOR));


        }).build();
  }

}
