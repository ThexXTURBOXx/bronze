package com.seacroak.bronze;

import com.seacroak.bronze.registry.ItemGroupRegistry;
import com.seacroak.bronze.registry.MainRegistry;
import com.seacroak.bronze.util.GenericUtils;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.seacroak.bronze.Constants.BRONZE_ID;
import static com.seacroak.bronze.Constants.BRONZE_LOGGER;

public class BronzeMod implements ModInitializer {
	public static final ItemGroup BRONZE_ITEMGROUP = ItemGroupRegistry.createItemGroup();

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM_GROUP, GenericUtils.ID(BRONZE_ID), BRONZE_ITEMGROUP);

		MainRegistry.init();
		BRONZE_LOGGER.info("[Bronze] Finished Loading!");
	}
}