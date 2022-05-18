package com.waterlord7788.nature_expansion;

import com.mojang.logging.LogUtils;
import com.waterlord7788.nature_expansion.blocks.ModBlocks;
import com.waterlord7788.nature_expansion.items.ModItems;
import com.waterlord7788.nature_expansion.painting.ModPaintings;
import com.waterlord7788.nature_expansion.sound.ModSounds;
import com.waterlord7788.nature_expansion.util.*;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NatureExpansion.MOD_ID)
public class NatureExpansion {
    public static final String MOD_ID = "natureexpansion";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    //Comment
    public NatureExpansion() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(eventBus);
        ModPaintings.register(eventBus);
        ModItems.register(eventBus);
        ModSounds.register(eventBus);
        //ModEntityType.register(eventBus);

        eventBus.addListener(this::setup);        // This line is to call private void `clientSetup`.
        eventBus.addListener(this::clientSetup);  // Without this `eventBus` method, we wouldn't have the void initialized at all.

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_ROSE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_PINK_ROSE.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CUCUMBER_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_BERRY_BUSH.get(), RenderType.cutout());

        //ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDWOOD_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REDWOOD_SAPLING.get(), RenderType.cutout());

        //ModItemProperties.addCustomItemProperties(); // Registering bow animation, when pulling and loading an arrow
    }

    public void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_ROSE.getId(), ModBlocks.POTTED_PINK_ROSE);
        });
    }
}
