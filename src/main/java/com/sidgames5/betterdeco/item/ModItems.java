package com.sidgames5.betterdeco.item;

import com.sidgames5.betterdeco.BetterDeco;
import com.sidgames5.betterdeco.ModInfo;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Items
    public static final Item TEST_ITEM = registerItem("test_item", new Item(new FabricItemSettings()));

    // Block Items



    // Main methods
    public static void registerModItems() {
        BetterDeco.LOGGER.info("Registering BetterDeco items");
        addItemsToGroups();
    }

    public static void addItemsToGroups() {
        addToGroup(ItemGroups.INGREDIENTS, TEST_ITEM);
    }


    // Helper methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ModInfo.ID, name), item);
    }



    private static void addToGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


}
