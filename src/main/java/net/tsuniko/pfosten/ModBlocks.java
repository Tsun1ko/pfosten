package net.tsuniko.pfosten;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Logs
    public static final Block OAK_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)),
            "oak_log_post");
    public static final Block SPRUCE_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_LOG)),
            "spruce_log_post");
    public static final Block BIRCH_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LOG)),
            "birch_log_post");
    public static final Block JUNGLE_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG)),
            "jungle_log_post");
    public static final Block ACACIA_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LOG)),
            "acacia_log_post");
    public static final Block DARK_OAK_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LOG)),
            "dark_oak_log_post");
    public static final Block MANGROVE_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG)),
            "mangrove_log_post");
    public static final Block CHERRY_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LOG)),
            "cherry_log_post");
    public static final Block CRIMSON_STEM_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM)),
            "crimson_stem_post");
    public static final Block WARPED_STEM_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.WARPED_STEM)),
            "warped_stem_post");

    // Stripped Logs
    public static final Block STRIPPED_OAK_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)),
            "stripped_oak_log_post");
    public static final Block STRIPPED_SPRUCE_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_LOG)),
            "stripped_spruce_log_post");
    public static final Block STRIPPED_BIRCH_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG)),
            "stripped_birch_log_post");
    public static final Block STRIPPED_JUNGLE_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_LOG)),
            "stripped_jungle_log_post");
    public static final Block STRIPPED_ACACIA_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_LOG)),
            "stripped_acacia_log_post");
    public static final Block STRIPPED_DARK_OAK_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_LOG)),
            "stripped_dark_oak_log_post");
    public static final Block STRIPPED_MANGROVE_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG)),
            "stripped_mangrove_log_post");
    public static final Block STRIPPED_CHERRY_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG)),
            "stripped_cherry_log_post");
    public static final Block STRIPPED_CRIMSON_STEM_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_STEM)),
            "stripped_crimson_stem_post");
    public static final Block STRIPPED_WARPED_STEM_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM)),
            "stripped_warped_stem_post");

    public static Block register(Block block, String name) {
        Identifier id = Identifier.of(Pfosten.MOD_ID, name);

        BlockItem blockItem = new BlockItem(block, new Item.Settings());
        Registry.register(Registries.ITEM, id, blockItem);


        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void registerModBlocks() {
        Pfosten.LOGGER.info("Registering Blocks for " + Pfosten.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(OAK_LOG_POST);
            entries.add(SPRUCE_LOG_POST);
            entries.add(BIRCH_LOG_POST);
            entries.add(JUNGLE_LOG_POST);
            entries.add(ACACIA_LOG_POST);
            entries.add(DARK_OAK_LOG_POST);
            entries.add(MANGROVE_LOG_POST);
            entries.add(CHERRY_LOG_POST);
            entries.add(CRIMSON_STEM_POST);
            entries.add(WARPED_STEM_POST);

            entries.add(STRIPPED_OAK_LOG_POST);
            entries.add(STRIPPED_SPRUCE_LOG_POST);
            entries.add(STRIPPED_BIRCH_LOG_POST);
            entries.add(STRIPPED_JUNGLE_LOG_POST);
            entries.add(STRIPPED_ACACIA_LOG_POST);
            entries.add(STRIPPED_DARK_OAK_LOG_POST);
            entries.add(STRIPPED_MANGROVE_LOG_POST);
            entries.add(STRIPPED_CHERRY_LOG_POST);
            entries.add(STRIPPED_CRIMSON_STEM_POST);
            entries.add(STRIPPED_WARPED_STEM_POST);
        });

        StrippableBlockRegistry.register(OAK_LOG_POST, STRIPPED_OAK_LOG_POST);
        StrippableBlockRegistry.register(SPRUCE_LOG_POST, STRIPPED_SPRUCE_LOG_POST);
        StrippableBlockRegistry.register(BIRCH_LOG_POST, STRIPPED_BIRCH_LOG_POST);
        StrippableBlockRegistry.register(JUNGLE_LOG_POST, STRIPPED_JUNGLE_LOG_POST);
        StrippableBlockRegistry.register(ACACIA_LOG_POST, STRIPPED_ACACIA_LOG_POST);
        StrippableBlockRegistry.register(DARK_OAK_LOG_POST, STRIPPED_DARK_OAK_LOG_POST);
        StrippableBlockRegistry.register(MANGROVE_LOG_POST, STRIPPED_MANGROVE_LOG_POST);
        StrippableBlockRegistry.register(CHERRY_LOG_POST, STRIPPED_CHERRY_LOG_POST);
        StrippableBlockRegistry.register(CRIMSON_STEM_POST, STRIPPED_CRIMSON_STEM_POST);
        StrippableBlockRegistry.register(WARPED_STEM_POST, STRIPPED_WARPED_STEM_POST);
    }
}
