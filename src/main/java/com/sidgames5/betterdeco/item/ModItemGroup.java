package com.sidgames5.betterdeco.item;

import com.sidgames5.betterdeco.BetterDeco;
import com.sidgames5.betterdeco.ModInfo;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup BETTERDECO;

    public static void registerItemGroups() {
        BetterDeco.LOGGER.info("Registering BetterDeco item groups");

        BETTERDECO = FabricItemGroup.builder(new Identifier(ModInfo.ID, "betterdeco"))
                .displayName(Text.translatable("itemgroup.betterdeco"))
                .icon(() -> new ItemStack(ModItems.PLASTIC_SHEET)).build();
    }
}
