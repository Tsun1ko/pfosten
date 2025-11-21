package net.tsuniko.pfosten;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.tsuniko.pfosten.datagen.ModBlockTagProvider;
import net.tsuniko.pfosten.datagen.ModLootTableProvider;
import net.tsuniko.pfosten.datagen.ModModelProvider;
import net.tsuniko.pfosten.datagen.ModRecipeProvider;

public class PfostenDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeProvider::new);
    }
}
