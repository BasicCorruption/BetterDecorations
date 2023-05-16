package com.sidgames5.betterdeco;

import com.sidgames5.betterdeco.data.ModLootTableGen;
import com.sidgames5.betterdeco.data.ModModelProv;
import com.sidgames5.betterdeco.data.ModRecipeGen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BetterDecoDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModLootTableGen::new);
        pack.addProvider(ModRecipeGen::new);
        pack.addProvider(ModModelProv::new);
    }
}
