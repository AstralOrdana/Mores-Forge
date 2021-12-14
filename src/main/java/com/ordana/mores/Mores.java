package com.ordana.mores;

import com.ordana.mores.core.init.ModBlocks;
import com.ordana.mores.core.init.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Mores.MODID)
public class Mores {
    public static final String MODID = "mores";

    public Mores() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
    }
}
