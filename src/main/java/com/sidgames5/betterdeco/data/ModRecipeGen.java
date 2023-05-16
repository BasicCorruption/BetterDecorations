package com.sidgames5.betterdeco.data;

import com.sidgames5.betterdeco.block.ModBlocks;
import com.sidgames5.betterdeco.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGen extends FabricRecipeProvider {
    public ModRecipeGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.DECORATIONS, Items.PAPER, RecipeCategory.DECORATIONS, ModBlocks.PAPER_REAM);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.DECORATIONS, ModItems.PLASTIC_SHEET, RecipeCategory.DECORATIONS, ModBlocks.PLASTIC_BLOCK);

        offerSmelting(exporter, List.of(Items.GLASS), RecipeCategory.MISC, ModItems.PLASTIC_SHEET, 4F, 400, "plastic");
    }
}
