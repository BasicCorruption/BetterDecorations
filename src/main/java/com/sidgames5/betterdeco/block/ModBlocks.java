package com.sidgames5.betterdeco.block;

import com.sidgames5.betterdeco.BetterDeco;
import com.sidgames5.betterdeco.ModInfo;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Blocks
    public static final Block PAPER_REAM = registerBlock("paper_ream", new Block(FabricBlockSettings.of(Material.CARPET).strength(0.0F, 0.0F)), ItemGroups.COLORED_BLOCKS);
    public static final Block PLASTIC_BLOCK = registerBlock("plastic_block", new Block(FabricBlockSettings.of(Material.GLASS).strength(1.0F, 1.0F)), ItemGroups.BUILDING_BLOCKS);
    public static final Block SEALED_PAPER_REAM = registerBlock("sealed_paper_ream", new Block(FabricBlockSettings.of(Material.GLASS).strength(0.2F, 0.2F)), ItemGroups.COLORED_BLOCKS);
    public static final Block ANDESITE_TILE = registerBlock("andesite_tile", new Block(FabricBlockSettings.of(Material.GLASS).strength(1.5F, 6.0F)), ItemGroups.BUILDING_BLOCKS);
    public static final Block GRANITE_TILE = registerBlock("granite_tile", new Block(FabricBlockSettings.of(Material.GLASS).strength(1.5F, 6.0F)), ItemGroups.BUILDING_BLOCKS);
    public static final Block DIORITE_TILE = registerBlock("diorite_tile", new Block(FabricBlockSettings.of(Material.GLASS).strength(1.5F, 6.0F)), ItemGroups.BUILDING_BLOCKS);
    public static final Block DROP_CEILING_TILE = registerBlock("drop_ceiling_tile", new Block(FabricBlockSettings.of(Material.METAL).strength(1.5F, 6.0F)), ItemGroups.BUILDING_BLOCKS);





    // Main methods
    public static void registerModBlocks() {
        BetterDeco.LOGGER.info("Registering BetterDeco blocks");
    }

    // Helper methods
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(ModInfo.ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ModInfo.ID, name), new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
}
