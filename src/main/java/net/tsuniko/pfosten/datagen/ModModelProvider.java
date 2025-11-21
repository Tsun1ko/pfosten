package net.tsuniko.pfosten.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import net.tsuniko.pfosten.ModBlocks;
import net.tsuniko.pfosten.Pfosten;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public static final Model POST = new Model(Optional.of(Identifier.of(
            Pfosten.MOD_ID, "block/post")),
            Optional.empty(),
            TextureKey.TOP, TextureKey.SIDE);

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    public static TextureMap postTextureMap(String side, String top) {
        return new TextureMap().put(TextureKey.SIDE, Identifier.ofVanilla(side)).put(TextureKey.TOP, Identifier.ofVanilla(top));
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // block models
        final Identifier oakLogPostId = POST.upload(ModBlocks.OAK_LOG_POST, postTextureMap("block/oak_log", "block/oak_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier spruceLogPostId = POST.upload(ModBlocks.SPRUCE_LOG_POST, postTextureMap("block/spruce_log", "block/spruce_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier birchLogPostId = POST.upload(ModBlocks.BIRCH_LOG_POST, postTextureMap("block/birch_log", "block/birch_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier jungleLogPostId = POST.upload(ModBlocks.JUNGLE_LOG_POST, postTextureMap("block/jungle_log", "block/jungle_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier acaciaLogPostId = POST.upload(ModBlocks.ACACIA_LOG_POST, postTextureMap("block/acacia_log", "block/acacia_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier darkOakLogPostId = POST.upload(ModBlocks.DARK_OAK_LOG_POST, postTextureMap("block/dark_oak_log", "block/dark_oak_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier mangroveLogPostId = POST.upload(ModBlocks.MANGROVE_LOG_POST, postTextureMap("block/mangrove_log", "block/mangrove_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier cherryLogPostId = POST.upload(ModBlocks.CHERRY_LOG_POST, postTextureMap("block/cherry_log", "block/cherry_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier crimsonStemPostId = POST.upload(ModBlocks.CRIMSON_STEM_POST, postTextureMap("block/crimson_stem", "block/crimson_stem_top"), blockStateModelGenerator.modelCollector);
        final Identifier warpedStemPostId = POST.upload(ModBlocks.WARPED_STEM_POST, postTextureMap("block/warped_stem", "block/warped_stem_top"), blockStateModelGenerator.modelCollector);


        final Identifier strippedOakLogPostId = POST.upload(ModBlocks.STRIPPED_OAK_LOG_POST, postTextureMap("block/stripped_oak_log", "block/stripped_oak_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier strippedSpruceLogPostId = POST.upload(ModBlocks.STRIPPED_SPRUCE_LOG_POST, postTextureMap("block/stripped_spruce_log", "block/stripped_spruce_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier strippedBirchLogPostId = POST.upload(ModBlocks.STRIPPED_BIRCH_LOG_POST, postTextureMap("block/stripped_birch_log", "block/stripped_birch_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier strippedJungleLogPostId = POST.upload(ModBlocks.STRIPPED_JUNGLE_LOG_POST, postTextureMap("block/stripped_jungle_log", "block/stripped_jungle_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier strippedAcaciaLogPostId = POST.upload(ModBlocks.STRIPPED_ACACIA_LOG_POST, postTextureMap("block/stripped_acacia_log", "block/stripped_acacia_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier strippedDarkOakLogPostId = POST.upload(ModBlocks.STRIPPED_DARK_OAK_LOG_POST, postTextureMap("block/stripped_dark_oak_log", "block/stripped_dark_oak_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier strippedMangroveLogPostId = POST.upload(ModBlocks.STRIPPED_MANGROVE_LOG_POST, postTextureMap("block/stripped_mangrove_log", "block/stripped_mangrove_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier strippedCherryLogPostId = POST.upload(ModBlocks.STRIPPED_CHERRY_LOG_POST, postTextureMap("block/stripped_cherry_log", "block/stripped_cherry_log_top"), blockStateModelGenerator.modelCollector);
        final Identifier strippedCrimsonStemPostId = POST.upload(ModBlocks.STRIPPED_CRIMSON_STEM_POST, postTextureMap("block/stripped_crimson_stem", "block/stripped_crimson_stem_top"), blockStateModelGenerator.modelCollector);
        final Identifier strippedWarpedStemPostId = POST.upload(ModBlocks.STRIPPED_WARPED_STEM_POST, postTextureMap("block/stripped_warped_stem", "block/stripped_warped_stem_top"), blockStateModelGenerator.modelCollector);

        // item models
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.OAK_LOG_POST, oakLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.SPRUCE_LOG_POST, spruceLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.BIRCH_LOG_POST, birchLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.JUNGLE_LOG_POST, jungleLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.ACACIA_LOG_POST, acaciaLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.DARK_OAK_LOG_POST, darkOakLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.MANGROVE_LOG_POST, mangroveLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.CHERRY_LOG_POST, cherryLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.CRIMSON_STEM_POST, crimsonStemPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.WARPED_STEM_POST, warpedStemPostId);

        blockStateModelGenerator.registerParentedItemModel(ModBlocks.STRIPPED_OAK_LOG_POST, strippedOakLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.STRIPPED_SPRUCE_LOG_POST, strippedSpruceLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.STRIPPED_BIRCH_LOG_POST, strippedBirchLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.STRIPPED_JUNGLE_LOG_POST, strippedJungleLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.STRIPPED_ACACIA_LOG_POST, strippedAcaciaLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.STRIPPED_DARK_OAK_LOG_POST, strippedDarkOakLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.STRIPPED_MANGROVE_LOG_POST, strippedMangroveLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.STRIPPED_CHERRY_LOG_POST, strippedCherryLogPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.STRIPPED_CRIMSON_STEM_POST, strippedCrimsonStemPostId);
        blockStateModelGenerator.registerParentedItemModel(ModBlocks.STRIPPED_WARPED_STEM_POST, strippedWarpedStemPostId);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
