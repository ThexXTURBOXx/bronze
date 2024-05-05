package com.seacroak.bronze.registry;

import com.seacroak.bronze.block.BronzeBlock;
import com.seacroak.bronze.block.TinBlock;
import com.seacroak.bronze.block.TinOre;
import com.seacroak.bronze.block.TinRawBlock;
import com.seacroak.bronze.util.RegistryHelper;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.seacroak.bronze.Constants.BRONZE_LOGGER;

public class MainRegistry {
  static final Item.Settings defaultItemSettings = new Item.Settings().maxCount(64);

  public static final Item TIN_RAW = Registry.register(Registries.ITEM, new Identifier("bronze", "raw_tin"), new Item(defaultItemSettings));
  public static final Item TIN_INGOT = Registry.register(Registries.ITEM, new Identifier("bronze", "tin_ingot"), new Item(defaultItemSettings));
  public static final Item BRONZE_BLEND = Registry.register(Registries.ITEM, new Identifier("bronze", "bronze_blend"), new Item(defaultItemSettings));
  public static final Item BRONZE_INGOT = Registry.register(Registries.ITEM, new Identifier("bronze", "bronze_ingot"), new Item(defaultItemSettings));

  public static final TinOre TIN_ORE = registerBlock("tin_ore_block", new TinOre(), defaultItemSettings);
  public static final TinRawBlock TIN_RAW_BLOCK = registerBlock("raw_tin_block", new TinRawBlock(), defaultItemSettings);
  public static final TinBlock TIN_BLOCK = registerBlock("tin_block", new TinBlock(), defaultItemSettings);
  public static final BronzeBlock BRONZE_BLOCK = registerBlock("bronze_block", new BronzeBlock(), defaultItemSettings);



















  /* Class Initializer */
  public static void init() {
    BRONZE_LOGGER.info("Initializing Main Registry");
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
