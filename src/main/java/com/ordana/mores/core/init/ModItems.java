package com.ordana.mores.core.init;

import com.ordana.mores.Mores;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    private ModItems() {}

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Mores.MODID);

    public static final RegistryObject<BlockItem> ANDESITE_COAL_ORE = ITEMS.register("andesite_coal_ore", () -> new BlockItem(ModBlocks.ANDESITE_COAL_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> DIORITE_COAL_ORE = ITEMS.register("diorite_coal_ore", () -> new BlockItem(ModBlocks.DIORITE_COAL_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRANITE_COAL_ORE = ITEMS.register("granite_coal_ore", () -> new BlockItem(ModBlocks.GRANITE_COAL_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> TUFF_COAL_ORE = ITEMS.register("tuff_coal_ore", () -> new BlockItem(ModBlocks.TUFF_COAL_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> ANDESITE_IRON_ORE = ITEMS.register("andesite_iron_ore", () -> new BlockItem(ModBlocks.ANDESITE_IRON_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> DIORITE_IRON_ORE = ITEMS.register("diorite_iron_ore", () -> new BlockItem(ModBlocks.DIORITE_IRON_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRANITE_IRON_ORE = ITEMS.register("granite_iron_ore", () -> new BlockItem(ModBlocks.GRANITE_IRON_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> TUFF_IRON_ORE = ITEMS.register("tuff_iron_ore", () -> new BlockItem(ModBlocks.TUFF_IRON_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> ANDESITE_COPPER_ORE = ITEMS.register("andesite_copper_ore", () -> new BlockItem(ModBlocks.ANDESITE_COPPER_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> DIORITE_COPPER_ORE = ITEMS.register("diorite_copper_ore", () -> new BlockItem(ModBlocks.DIORITE_COPPER_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRANITE_COPPER_ORE = ITEMS.register("granite_copper_ore", () -> new BlockItem(ModBlocks.GRANITE_COPPER_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> TUFF_COPPER_ORE = ITEMS.register("tuff_copper_ore", () -> new BlockItem(ModBlocks.TUFF_COPPER_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> ANDESITE_GOLD_ORE = ITEMS.register("andesite_gold_ore", () -> new BlockItem(ModBlocks.ANDESITE_GOLD_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> DIORITE_GOLD_ORE = ITEMS.register("diorite_gold_ore", () -> new BlockItem(ModBlocks.DIORITE_GOLD_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRANITE_GOLD_ORE = ITEMS.register("granite_gold_ore", () -> new BlockItem(ModBlocks.GRANITE_GOLD_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> TUFF_GOLD_ORE = ITEMS.register("tuff_gold_ore", () -> new BlockItem(ModBlocks.TUFF_GOLD_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> ANDESITE_REDSTONE_ORE = ITEMS.register("andesite_redstone_ore", () -> new BlockItem(ModBlocks.ANDESITE_REDSTONE_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> DIORITE_REDSTONE_ORE = ITEMS.register("diorite_redstone_ore", () -> new BlockItem(ModBlocks.DIORITE_REDSTONE_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRANITE_REDSTONE_ORE = ITEMS.register("granite_redstone_ore", () -> new BlockItem(ModBlocks.GRANITE_REDSTONE_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> TUFF_REDSTONE_ORE = ITEMS.register("tuff_redstone_ore", () -> new BlockItem(ModBlocks.TUFF_REDSTONE_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> ANDESITE_LAPIS_ORE = ITEMS.register("andesite_lapis_ore", () -> new BlockItem(ModBlocks.ANDESITE_LAPIS_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> DIORITE_LAPIS_ORE = ITEMS.register("diorite_lapis_ore", () -> new BlockItem(ModBlocks.DIORITE_LAPIS_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRANITE_LAPIS_ORE = ITEMS.register("granite_lapis_ore", () -> new BlockItem(ModBlocks.GRANITE_LAPIS_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> TUFF_LAPIS_ORE = ITEMS.register("tuff_lapis_ore", () -> new BlockItem(ModBlocks.TUFF_LAPIS_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> ANDESITE_EMERALD_ORE = ITEMS.register("andesite_emerald_ore", () -> new BlockItem(ModBlocks.ANDESITE_EMERALD_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> DIORITE_EMERALD_ORE = ITEMS.register("diorite_emerald_ore", () -> new BlockItem(ModBlocks.DIORITE_EMERALD_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRANITE_EMERALD_ORE = ITEMS.register("granite_emerald_ore", () -> new BlockItem(ModBlocks.GRANITE_EMERALD_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> TUFF_EMERALD_ORE = ITEMS.register("tuff_emerald_ore", () -> new BlockItem(ModBlocks.TUFF_EMERALD_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> ANDESITE_DIAMOND_ORE = ITEMS.register("andesite_diamond_ore", () -> new BlockItem(ModBlocks.ANDESITE_DIAMOND_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> DIORITE_DIAMOND_ORE = ITEMS.register("diorite_diamond_ore", () -> new BlockItem(ModBlocks.DIORITE_DIAMOND_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> GRANITE_DIAMOND_ORE = ITEMS.register("granite_diamond_ore", () -> new BlockItem(ModBlocks.GRANITE_DIAMOND_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> TUFF_DIAMOND_ORE = ITEMS.register("tuff_diamond_ore", () -> new BlockItem(ModBlocks.TUFF_DIAMOND_ORE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}