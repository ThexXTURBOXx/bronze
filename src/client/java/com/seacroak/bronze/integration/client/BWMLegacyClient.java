package com.seacroak.bronze.integration.client;

import ckathode.weaponmod.item.WMItemProperties;
import com.seacroak.bronze.integration.BWMLegacy;
import net.minecraft.client.item.ModelPredicateProviderRegistry;

public class BWMLegacyClient {

    public static void init() {
        ModelPredicateProviderRegistry.register(BWMLegacy.BRONZE_BOOMERANG.asItem(),
                WMItemProperties.BOOMERANG_READY_GETTER_ID, WMItemProperties.BOOMERANG_READY_GETTER);
    }

}
