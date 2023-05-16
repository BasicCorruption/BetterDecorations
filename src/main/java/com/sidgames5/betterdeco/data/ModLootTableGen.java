package com.sidgames5.betterdeco.data;

import com.sidgames5.betterdeco.block.ModBlocks;
import com.sidgames5.betterdeco.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class ModLootTableGen extends FabricBlockLootTableProvider {
    public ModLootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PAPER_REAM, LootTable.builder().pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(9.0F)).with(ItemEntry.builder(Items.PAPER))));
        addDrop(ModBlocks.PLASTIC_BLOCK);
        addDrop(ModBlocks.SEALED_PAPER_REAM);
    }
}
