package net.tsuniko.pfosten.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.tsuniko.pfosten.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SPRUCE_LOG_POST);
        addDrop(ModBlocks.BIRCH_LOG_POST);
        addDrop(ModBlocks.JUNGLE_LOG_POST);
        addDrop(ModBlocks.ACACIA_LOG_POST);
        addDrop(ModBlocks.DARK_OAK_LOG_POST);
        addDrop(ModBlocks.MANGROVE_LOG_POST);
        addDrop(ModBlocks.CHERRY_LOG_POST);
        addDrop(ModBlocks.CRIMSON_STEM_POST);
        addDrop(ModBlocks.WARPED_STEM_POST);

        addDrop(ModBlocks.STRIPPED_OAK_LOG_POST);
        addDrop(ModBlocks.STRIPPED_SPRUCE_LOG_POST);
        addDrop(ModBlocks.STRIPPED_BIRCH_LOG_POST);
        addDrop(ModBlocks.STRIPPED_JUNGLE_LOG_POST);
        addDrop(ModBlocks.STRIPPED_ACACIA_LOG_POST);
        addDrop(ModBlocks.STRIPPED_DARK_OAK_LOG_POST);
        addDrop(ModBlocks.STRIPPED_MANGROVE_LOG_POST);
        addDrop(ModBlocks.STRIPPED_CHERRY_LOG_POST);
        addDrop(ModBlocks.STRIPPED_CRIMSON_STEM_POST);
        addDrop(ModBlocks.STRIPPED_WARPED_STEM_POST);
    }
}
