package net.tsuniko.pfosten.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.tsuniko.pfosten.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static void offerPostRecipe(RecipeExporter exporter, RecipeCategory category, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(category, output, 6)
                .input('#', input)
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_LOG_POST, Blocks.OAK_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_LOG_POST, Blocks.SPRUCE_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_LOG_POST, Blocks.BIRCH_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_LOG_POST, Blocks.JUNGLE_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_LOG_POST, Blocks.ACACIA_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_LOG_POST, Blocks.DARK_OAK_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_LOG_POST, Blocks.MANGROVE_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_LOG_POST, Blocks.CHERRY_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_STEM_POST, Blocks.CRIMSON_STEM);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_STEM_POST, Blocks.WARPED_STEM);

        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_OAK_LOG_POST, Blocks.STRIPPED_OAK_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_SPRUCE_LOG_POST, Blocks.STRIPPED_SPRUCE_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_BIRCH_LOG_POST, Blocks.STRIPPED_BIRCH_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_JUNGLE_LOG_POST, Blocks.STRIPPED_JUNGLE_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ACACIA_LOG_POST, Blocks.STRIPPED_ACACIA_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DARK_OAK_LOG_POST, Blocks.STRIPPED_DARK_OAK_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_MANGROVE_LOG_POST, Blocks.STRIPPED_MANGROVE_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CHERRY_LOG_POST, Blocks.STRIPPED_CHERRY_LOG);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CRIMSON_STEM_POST, Blocks.STRIPPED_CRIMSON_STEM);
        offerPostRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_WARPED_STEM_POST, Blocks.STRIPPED_WARPED_STEM);
    }
}
