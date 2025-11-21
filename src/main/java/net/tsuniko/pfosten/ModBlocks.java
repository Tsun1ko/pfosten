package net.tsuniko.pfosten;

import com.google.common.collect.ImmutableMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.sound.Sound;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block OAK_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)),
            "oak_log_post");
    public static final Block STRIPPED_OAK_LOG_POST = register(
            new PostBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)),
            "stripped_oak_log_post");

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
            entries.add(STRIPPED_OAK_LOG_POST);
        });

        StrippableBlockRegistry.register(OAK_LOG_POST, STRIPPED_OAK_LOG_POST);
    }
}
