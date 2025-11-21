package net.tsuniko.pfosten.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.tsuniko.pfosten.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.OAK_LOG_POST)
                .add(ModBlocks.SPRUCE_LOG_POST)
                .add(ModBlocks.BIRCH_LOG_POST)
                .add(ModBlocks.JUNGLE_LOG_POST)
                .add(ModBlocks.ACACIA_LOG_POST)
                .add(ModBlocks.DARK_OAK_LOG_POST)
                .add(ModBlocks.MANGROVE_LOG_POST)
                .add(ModBlocks.CHERRY_LOG_POST)
                .add(ModBlocks.CRIMSON_STEM_POST)
                .add(ModBlocks.WARPED_STEM_POST)

                .add(ModBlocks.STRIPPED_OAK_LOG_POST)
                .add(ModBlocks.STRIPPED_SPRUCE_LOG_POST)
                .add(ModBlocks.STRIPPED_BIRCH_LOG_POST)
                .add(ModBlocks.STRIPPED_JUNGLE_LOG_POST)
                .add(ModBlocks.STRIPPED_ACACIA_LOG_POST)
                .add(ModBlocks.STRIPPED_DARK_OAK_LOG_POST)
                .add(ModBlocks.STRIPPED_MANGROVE_LOG_POST)
                .add(ModBlocks.STRIPPED_CHERRY_LOG_POST)
                .add(ModBlocks.STRIPPED_CRIMSON_STEM_POST)
                .add(ModBlocks.STRIPPED_WARPED_STEM_POST);
    }
}
