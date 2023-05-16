package com.sidgames5.betterdeco.data;

import com.sidgames5.betterdeco.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;

public class ModLootTableGen extends FabricBlockLootTableProvider {
    public ModLootTableGen(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //addDrop(ModBlocks.PAPER_REAM, Items.PAPER);
    }
}
