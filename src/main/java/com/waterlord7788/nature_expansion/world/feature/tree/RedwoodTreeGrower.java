package com.waterlord7788.nature_expansion.world.feature.tree;

import com.waterlord7788.nature_expansion.world.feature.ModConfiguredFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class RedwoodTreeGrower extends AbstractTreeGrower {
    /**
     * @param pRandom
     * @param pLargeHive
     * @return a {@link ConfiguredFeature} of this tree
     */
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
        return ModConfiguredFeatures.REDWOOD_TREE;
    }
}
