package com.seacroak.bronze.datagen.advancements;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class BronzeModAdvancementsProvider extends FabricAdvancementProvider {
  public BronzeModAdvancementsProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
    super(dataGenerator, registryLookup);
  }

  @Override
  public void generateAdvancement(RegistryWrapper.WrapperLookup registryLookup, Consumer<AdvancementEntry> consumer) {
    new BronzeAdvancements().accept(consumer);
  }
}
