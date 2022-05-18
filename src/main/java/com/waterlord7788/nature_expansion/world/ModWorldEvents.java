package com.waterlord7788.nature_expansion.world;

import com.waterlord7788.nature_expansion.NatureExpansion;
import com.waterlord7788.nature_expansion.world.gen.ModFlowerGeneration;
import com.waterlord7788.nature_expansion.world.gen.ModOreGeneration;
import com.waterlord7788.nature_expansion.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = NatureExpansion.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);
    }
}