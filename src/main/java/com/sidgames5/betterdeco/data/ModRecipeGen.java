package com.sidgames5.betterdeco.data;

import com.sidgames5.betterdeco.block.ModBlocks;
import com.sidgames5.betterdeco.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.StonecuttingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGen extends FabricRecipeProvider {
    public ModRecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.PAPER, RecipeCategory.MISC, ModBlocks.PAPER_REAM);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.DECORATIONS, ModItems.PLASTIC_SHEET, RecipeCategory.DECORATIONS, ModBlocks.PLASTIC_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SEALED_PAPER_REAM)
                .pattern("PPP")
                .pattern("PBP")
                .pattern("PPP")
                .input('P', ModItems.PLASTIC_SHEET)
                .input('B', ModBlocks.PAPER_REAM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.PLASTIC_SHEET), FabricRecipeProvider.conditionsFromItem(ModItems.PLASTIC_SHEET))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PAPER_REAM), FabricRecipeProvider.conditionsFromItem(ModBlocks.PAPER_REAM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.SEALED_PAPER_REAM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DROP_CEILING_TILE)
                .pattern("III")
                .pattern("ICI")
                .pattern("III")
                .input('I', Items.IRON_NUGGET)
                .input('C', Blocks.CALCITE)
                .criterion(FabricRecipeProvider.hasItem(Items.IRON_NUGGET), FabricRecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .criterion(FabricRecipeProvider.hasItem(Blocks.CALCITE), FabricRecipeProvider.conditionsFromItem(Blocks.CALCITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.DROP_CEILING_TILE)));

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANDESITE_TILE, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.GRANITE_TILE, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DIORITE_TILE, Blocks.POLISHED_DIORITE);


        offerSmelting(exporter, List.of(Items.GLASS), RecipeCategory.MISC, ModItems.PLASTIC_SHEET, 4F, 400, "plastic");
    }
}
