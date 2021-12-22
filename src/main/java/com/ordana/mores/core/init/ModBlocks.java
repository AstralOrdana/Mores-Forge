package com.ordana.mores.core.init;

import com.ordana.mores.Mores;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks {

    private ModBlocks() {}

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Mores.MODID);

    public static final RegistryObject<Block> ANDESITE_COAL_ORE = BLOCKS.register("andesite_coal_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> DIORITE_COAL_ORE = BLOCKS.register("diorite_coal_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> GRANITE_COAL_ORE = BLOCKS.register("granite_coal_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> TUFF_COAL_ORE = BLOCKS.register("tuff_coal_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).sound(SoundType.TUFF)));

    public static final RegistryObject<Block> ANDESITE_IRON_ORE = BLOCKS.register("andesite_iron_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> DIORITE_IRON_ORE = BLOCKS.register("diorite_iron_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> GRANITE_IRON_ORE = BLOCKS.register("granite_iron_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> TUFF_IRON_ORE = BLOCKS.register("tuff_iron_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).sound(SoundType.TUFF)));

    public static final RegistryObject<Block> ANDESITE_COPPER_ORE = BLOCKS.register("andesite_copper_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> DIORITE_COPPER_ORE = BLOCKS.register("diorite_copper_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> GRANITE_COPPER_ORE = BLOCKS.register("granite_copper_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> TUFF_COPPER_ORE = BLOCKS.register("tuff_copper_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).sound(SoundType.TUFF)));

    public static final RegistryObject<Block> ANDESITE_GOLD_ORE = BLOCKS.register("andesite_gold_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<Block> DIORITE_GOLD_ORE = BLOCKS.register("diorite_gold_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<Block> GRANITE_GOLD_ORE = BLOCKS.register("granite_gold_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<Block> TUFF_GOLD_ORE = BLOCKS.register("tuff_gold_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).sound(SoundType.TUFF)));

    public static final RegistryObject<Block> ANDESITE_REDSTONE_ORE = BLOCKS.register("andesite_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));
    public static final RegistryObject<Block> DIORITE_REDSTONE_ORE = BLOCKS.register("diorite_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));
    public static final RegistryObject<Block> GRANITE_REDSTONE_ORE = BLOCKS.register("granite_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));
    public static final RegistryObject<Block> TUFF_REDSTONE_ORE = BLOCKS.register("tuff_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).sound(SoundType.TUFF)));

    public static final RegistryObject<Block> ANDESITE_LAPIS_ORE = BLOCKS.register("andesite_lapis_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> DIORITE_LAPIS_ORE = BLOCKS.register("diorite_lapis_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> GRANITE_LAPIS_ORE = BLOCKS.register("granite_lapis_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> TUFF_LAPIS_ORE = BLOCKS.register("tuff_lapis_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).sound(SoundType.TUFF)));

    public static final RegistryObject<Block> ANDESITE_EMERALD_ORE = BLOCKS.register("andesite_emerald_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)));
    public static final RegistryObject<Block> DIORITE_EMERALD_ORE = BLOCKS.register("diorite_emerald_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)));
    public static final RegistryObject<Block> GRANITE_EMERALD_ORE = BLOCKS.register("granite_emerald_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)));
    public static final RegistryObject<Block> TUFF_EMERALD_ORE = BLOCKS.register("tuff_emerald_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE).sound(SoundType.TUFF)));

    public static final RegistryObject<Block> ANDESITE_DIAMOND_ORE = BLOCKS.register("andesite_diamond_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> DIORITE_DIAMOND_ORE = BLOCKS.register("diorite_diamond_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> GRANITE_DIAMOND_ORE = BLOCKS.register("granite_diamond_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> TUFF_DIAMOND_ORE = BLOCKS.register("tuff_diamond_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).sound(SoundType.TUFF)));

    //Quart Compat
    public static final RegistryObject<Block> SHALE_COAL_ORE = BLOCKS.register("shale_coal_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));
    public static final RegistryObject<Block> JASPER_COAL_ORE = BLOCKS.register("jasper_coal_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));

    public static final RegistryObject<Block> SHALE_IRON_ORE = BLOCKS.register("shale_iron_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> JASPER_IRON_ORE = BLOCKS.register("jasper_iron_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));

    public static final RegistryObject<Block> SHALE_COPPER_ORE = BLOCKS.register("shale_copper_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> JASPER_COPPER_ORE = BLOCKS.register("jasper_copper_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));

    public static final RegistryObject<Block> SHALE_GOLD_ORE = BLOCKS.register("shale_gold_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<Block> JASPER_GOLD_ORE = BLOCKS.register("jasper_gold_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));

    public static final RegistryObject<Block> SHALE_LAPIS_ORE = BLOCKS.register("shale_lapis_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> JASPER_LAPIS_ORE = BLOCKS.register("jasper_lapis_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));

    public static final RegistryObject<Block> SHALE_REDSTONE_ORE = BLOCKS.register("shale_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));
    public static final RegistryObject<Block> JASPER_REDSTONE_ORE = BLOCKS.register("jasper_redstone_ore", () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));

    public static final RegistryObject<Block> SHALE_DIAMOND_ORE = BLOCKS.register("shale_diamond_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> JASPER_DIAMOND_ORE = BLOCKS.register("jasper_diamond_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));

    public static final RegistryObject<Block> SHALE_EMERALD_ORE = BLOCKS.register("shale_emerald_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)));
    public static final RegistryObject<Block> JASPER_EMERALD_ORE = BLOCKS.register("jasper_emerald_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE)));

}
