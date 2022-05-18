package com.waterlord7788.nature_expansion.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> REDWOOD_PLACED = PlacementUtils.register("redwood_placed",
            ModConfiguredFeatures.REDWOOD_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)
            ));

    public static final Holder<PlacedFeature> MEGA_REDWOOD_PLACED = PlacementUtils.register("mega_redwood_placed",
            ModConfiguredFeatures.MEGA_REDWOOD_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)
            ));

    public static final Holder<PlacedFeature> MEGA_DENSE_REDWOOD_PLACED = PlacementUtils.register("mega_dense_redwood_placed",
            ModConfiguredFeatures.MEGA_DENSE_REDWOOD_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)
            ));

    public static final Holder<PlacedFeature> EXPERIMENT_PLACED = PlacementUtils.register("experiment_placed",
            ModConfiguredFeatures.EXPERIMENT_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(3, 0.1f, 2)
            ));

    public static final Holder<PlacedFeature> PINK_ROSE_PLACED = PlacementUtils.register("pink_rose_placed",
            ModConfiguredFeatures.PINK_ROSE, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    /*
    public static final Holder<PlacedFeature> SAPPHIRE_ORE_PLACED = PlacementUtils.register("sapphire_ore_placed",
            ModConfiguredFeatures.SAPPHIRE_ORE, ModOrePlacement.commonOrePlacement(4, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));
    */

    /*
    public static final Holder<PlacedFeature> PATCH_PUMPKIN = PlacementUtils.register("patch_pumpkin",
            VegetationFeatures.PATCH_PUMPKIN, RarityFilter.onAverageOnceEvery(300),
            InSquarePlacement.spread(),
            PlacementUtils.HEIGHTMAP,
            BiomeFilter.biome());
    */
}