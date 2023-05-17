package com.sidgames5.betterdeco.data;

import com.sidgames5.betterdeco.block.ModBlocks;
import com.sidgames5.betterdeco.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProv extends FabricModelProvider {
    public ModModelProv(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PAPER_REAM);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PLASTIC_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SEALED_PAPER_REAM);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANDESITE_TILE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRANITE_TILE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DIORITE_TILE);
        //blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DROP_CEILING_TILE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PLASTIC_SHEET, Models.GENERATED);
    }
}
