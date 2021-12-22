package com.ordana.mores;

import com.ordana.mores.core.init.ModBlocks;
import com.ordana.mores.core.init.ModItems;
import com.ordana.mores.core.util.ShippedResourcePacks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Mores.MODID)
public class Mores {
    public static final String MODID = "mores";

    public static final Logger LOGGER = LogManager.getLogger();

    public static void onCtor() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get()
                .getModEventBus();

        modEventBus.addListener(Mores::init);
    }

    public static void init(final FMLCommonSetupEvent event) {
        ShippedResourcePacks.extractFiles("Emissive Mores");
        ShippedResourcePacks.extractFiles("Mores Unlit Redstone Ore");
    }

    public Mores() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        onCtor();
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
    }
}
