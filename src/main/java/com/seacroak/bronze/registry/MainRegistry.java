package com.seacroak.bronze.registry;

import com.seacroak.bronze.armor.BronzeArmorMaterial;
import com.seacroak.bronze.block.*;
import com.seacroak.bronze.util.RegistryHelper;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Block;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

import static com.seacroak.bronze.Constants.BRONZE_LOGGER;
import static com.seacroak.bronze.util.GenericUtils.ID;

public class MainRegistry {
  static final Item.Settings defaultItemSettings = new Item.Settings().maxCount(64);

  /* Items */
  public static final Item TIN_RAW = Registry.register(Registries.ITEM, ID("raw_tin"), new Item(defaultItemSettings));
  public static final Item TIN_INGOT = Registry.register(Registries.ITEM, ID("tin_ingot"), new Item(defaultItemSettings));
  public static final Item BRONZE_BLEND = Registry.register(Registries.ITEM, ID("bronze_blend"), new Item(defaultItemSettings));
  public static final Item BRONZE_NUGGET = Registry.register(Registries.ITEM, ID("bronze_nugget"), new Item(defaultItemSettings));
  public static final Item BRONZE_INGOT = Registry.register(Registries.ITEM, ID("bronze_ingot"), new Item(defaultItemSettings));

  /* Blocks */
  public static final TinOre TIN_ORE = registerBlock("tin_ore_block", new TinOre(), defaultItemSettings);
  public static final DeepslateTinOre DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore_block", new DeepslateTinOre(), defaultItemSettings);
  public static final TinRawBlock TIN_RAW_BLOCK = registerBlock("raw_tin_block", new TinRawBlock(), defaultItemSettings);
  public static final BronzeBlendBlock BRONZE_BLEND_BLOCK = registerBlock("bronze_blend_block", new BronzeBlendBlock(), defaultItemSettings);
  public static final TinBlock TIN_BLOCK = registerBlock("tin_block", new TinBlock(), defaultItemSettings);
  public static final BronzeBlock BRONZE_BLOCK = registerBlock("bronze_block", new BronzeBlock(), defaultItemSettings);

  /* Armor */
  public static final Item BRONZE_HELMET = Registry.register(Registries.ITEM, ID("bronze_helmet"), new ArmorItem(BronzeArmorMaterial.BRONZE, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
  public static final Item BRONZE_CHESTPLATE = Registry.register(Registries.ITEM, ID("bronze_chestplate"), new ArmorItem(BronzeArmorMaterial.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
  public static final Item BRONZE_LEGGINGS = Registry.register(Registries.ITEM, ID("bronze_leggings"), new ArmorItem(BronzeArmorMaterial.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
  public static final Item BRONZE_BOOTS = Registry.register(Registries.ITEM, ID("bronze_boots"), new ArmorItem(BronzeArmorMaterial.BRONZE, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));


  /* WorldGen */
  public static final RegistryKey<PlacedFeature> TIN_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, ID("ore_tin"));


  public static void init() {
    BRONZE_LOGGER.info("Initializing Main Registry");
    /* Add Tin Ore to WorldGen */
    BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, TIN_ORE_PLACED_KEY);

  }

  /* Registration Functions */
  private static <B extends Block> B registerBlock(String name, B block, Item.Settings itemSettings) {
    return RegistryHelper.registerBlock(name, block, itemSettings);
  }

  private static <B extends Block> B registerBlockOnly(String name, B block) {
    return RegistryHelper.registerBlockOnly(name, block);
  }

  private static <I extends BlockItem> BlockItem registerBlockItem(String name, I blockItem) {
    return RegistryHelper.registerBlockItem(name, blockItem);
  }

  private static Item registerItem(String name) {
    return RegistryHelper.registerItem(name, new Item(defaultItemSettings));
  }
}
