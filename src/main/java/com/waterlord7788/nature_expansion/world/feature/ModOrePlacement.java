package com.waterlord7788.nature_expansion.world.feature;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacement {
    public static List<PlacementModifier> orePlacement(PlacementModifier placementModifiers, PlacementModifier placementModifier) {
        return List.of(placementModifiers, InSquarePlacement.spread(), placementModifier, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int placementModifiers, PlacementModifier placementModifiers1) {
        return orePlacement(CountPlacement.of(placementModifiers), placementModifiers1);
    }

    public static List<PlacementModifier> rareOrePlacement(int i, PlacementModifier placementModifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(i), placementModifier);
    }
}