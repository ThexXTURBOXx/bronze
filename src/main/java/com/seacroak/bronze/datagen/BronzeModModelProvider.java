package com.seacroak.bronze.datagen;

import com.seacroak.bronze.registry.MainRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.ArmorItem;

public class BronzeModModelProvider extends FabricModelProvider {

  public BronzeModModelProvider(FabricDataOutput output) {
    super(output);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.registerArmor(((ArmorItem) MainRegistry.BRONZE_HELMET));
    itemModelGenerator.registerArmor(((ArmorItem) MainRegistry.BRONZE_CHESTPLATE));
    itemModelGenerator.registerArmor(((ArmorItem) MainRegistry.BRONZE_LEGGINGS));
    itemModelGenerator.registerArmor(((ArmorItem) MainRegistry.BRONZE_BOOTS));

  }
}
