package com.waterlord7788.nature_expansion.world.gen;

import com.waterlord7788.nature_expansion.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;
import java.util.Set;

public class ModTreeGeneration {
    public static void generateTrees(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);

        if(types.contains(BiomeDictionary.Type.FOREST)) {
            List<Holder<PlacedFeature>> base_forest =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base_forest.add(ModPlacedFeatures.EXPERIMENT_PLACED);
        }

        if(types.contains(BiomeDictionary.Type.COLD)) {
            List<Holder<PlacedFeature>> base_cold =
                    event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

            base_cold.add(ModPlacedFeatures.REDWOOD_PLACED);
            base_cold.add(ModPlacedFeatures.MEGA_REDWOOD_PLACED);
            base_cold.add(ModPlacedFeatures.MEGA_DENSE_REDWOOD_PLACED);
        }
    }
}