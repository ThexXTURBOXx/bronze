package com.seacroak.bronze;

import ckathode.weaponmod.BalkonsWeaponMod;
import com.seacroak.bronze.integration.client.BWMLegacyClient;
import com.seacroak.bronze.registry.MainRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.RenderLayer;

public class BronzeModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		BlockRenderLayerMap.INSTANCE.putBlock(MainRegistry.BRONZE_TRAPDOOR, RenderLayer.getCutoutMipped());
		if (FabricLoader.getInstance().isModLoaded(BalkonsWeaponMod.MOD_ID)) {
		    BWMLegacyClient.init();
		}

	}
}