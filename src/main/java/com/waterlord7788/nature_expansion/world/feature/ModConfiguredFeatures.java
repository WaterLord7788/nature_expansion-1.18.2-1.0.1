package com.waterlord7788.nature_expansion.world.feature;

import com.google.common.collect.ImmutableList;
import com.waterlord7788.nature_expansion.blocks.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.TreePlacements;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

// CF -> PF -> CF -> PF and TG
// Where `CF` means configured feature and `PF` means placed feature
// `TG` means tree generation
public class ModConfiguredFeatures {
    // Next chunk of code is needed to spawn a tree from a sapling
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>>          REDWOOD_TREE = FeatureUtils.register("redwood", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.REDWOOD_LOG.get()), new StraightTrunkPlacer(5, 6, 3), BlockStateProvider.simple(Blocks.SPRUCE_LEAVES),/* MEGA_DENSE_REDWOODing with different foliage placers --> */new PineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(3, 4)), new TwoLayersFeatureSize(1, 0, 2)).build()); // Add `dirt()` method, if you want your sapling to be placed on different block
    public static final Holder<PlacedFeature>                                    REDWOOD_CHECKED = PlacementUtils.register("redwood_checked", REDWOOD_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.REDWOOD_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> REDWOOD_SPAWN = FeatureUtils.register("redwood_spawn", Feature.RANDOM_SELECTOR, new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(REDWOOD_CHECKED, 0.1F)), REDWOOD_CHECKED));



    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MEGA_REDWOOD_TREE =
            FeatureUtils.register("mega_redwood", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.REDWOOD_LOG.get()),
                    //new GiantTrunkPlacer(30, 10, 20)
                    new DarkOakTrunkPlacer(15, 10, 10),
                    BlockStateProvider.simple(Blocks.SPRUCE_LEAVES),
                    new MegaPineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(10, 18)),
                    new TwoLayersFeatureSize(10, 1, 10))).decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());

    public static final Holder<PlacedFeature> MEGA_REDWOOD_CHECKED =
            PlacementUtils.register("mega_redwood_checked", MEGA_REDWOOD_TREE,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.REDWOOD_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MEGA_REDWOOD_SPAWN =
            FeatureUtils.register("mega_redwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MEGA_REDWOOD_CHECKED, 0.025641026F),
                            new WeightedPlacedFeature(MEGA_REDWOOD_CHECKED, 0.10769232F)), TreePlacements.SPRUCE_CHECKED));



    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MEGA_DENSE_REDWOOD =
            FeatureUtils.register("mega_dense_redwood", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.REDWOOD_LOG.get()),
                    //new GiantTrunkPlacer(30, 10, 20)
                    new FancyTrunkPlacer(15, 10, 10),
                    BlockStateProvider.simple(Blocks.SPRUCE_LEAVES),
                    new MegaPineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(10, 18)),
                    new TwoLayersFeatureSize(10, 1, 10))).decorators(ImmutableList.of(new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());

    public static final Holder<PlacedFeature> MEGA_DENSE_REDWOOD_CHECKED =
            PlacementUtils.register("mega_dense_redwood_checked", MEGA_DENSE_REDWOOD,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.REDWOOD_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MEGA_DENSE_REDWOOD_SPAWN =
            FeatureUtils.register("mega_dense_redwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MEGA_DENSE_REDWOOD_CHECKED, 0.025641026F),
                            new WeightedPlacedFeature(MEGA_DENSE_REDWOOD_CHECKED, 0.10769232F)), TreePlacements.SPRUCE_CHECKED));



    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> EXPERIMENT =
            FeatureUtils.register("experiment", Feature.TREE, (new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(Blocks.OAK_LOG),
                    //new GiantTrunkPlacer(30, 10, 20)
                    new FancyTrunkPlacer(15, 10, 10),
                    BlockStateProvider.simple(Blocks.OAK_LEAVES),
                    new MegaPineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), UniformInt.of(10, 18)),
                    new TwoLayersFeatureSize(1, 1, 1))).build());

    public static final Holder<PlacedFeature> EXPERIMENT_CHECKED =
            PlacementUtils.register("experiment_checked", EXPERIMENT,
                    PlacementUtils.filteredByBlockSurvival(ModBlocks.REDWOOD_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> EXPERIMENT_SPAWN =
            FeatureUtils.register("experiment_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(EXPERIMENT_CHECKED, 0.025641026F),
                            new WeightedPlacedFeature(EXPERIMENT_CHECKED, 0.05769232F)), TreePlacements.OAK_CHECKED));



    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PINK_ROSE =
            FeatureUtils.register("flower_pink_rose", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_ROSE.get())))));



    /*
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_SAPPHIRE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SAPPHIRE_ORE = FeatureUtils.register("sapphire_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_SAPPHIRE_ORES, 9));
    */



    /*
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PATCH_PUMPKIN = FeatureUtils.register("patch_pumpkin",
            Feature.RANDOM_PATCH,
            FeatureUtils.simplePatchConfiguration(
                    Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.PUMPKIN)),
                    List.of(Blocks.GRASS_BLOCK)
            )
    );
     */
}