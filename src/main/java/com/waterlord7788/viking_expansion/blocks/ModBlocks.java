package com.waterlord7788.viking_expansion.blocks;

import com.waterlord7788.viking_expansion.VikingExpansion;
import com.waterlord7788.viking_expansion.blocks.custom.SpeedyBlock;
import com.waterlord7788.viking_expansion.items.ModCreativeModeTab;
import com.waterlord7788.viking_expansion.items.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ColorResolver;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.CallbackI;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, VikingExpansion.MOD_ID);


    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);

    public static final RegistryObject<Block> RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);
    /*public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);*/
    /*public static final RegistryObject<Block> ENDSTONE_SAPPHIRE_ORE = registerBlock("endstone_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);*/
    /*public static final RegistryObject<Block> NETHERRACK_SAPPHIRE_ORE = registerBlock("netherrack_sapphire_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);*/

    // Block, which adds a special effect on the person standing on it
    public static final RegistryObject<Block> SPEEDY_BLOCK = registerBlock("speedy_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.STONE).strength(4f)
                    .requiresCorrectToolForDrops()),
            ModCreativeModeTab.VIKINGEXPANSION_TAB);

    // Changing walking -> no need to jump to get over a block
    public static final RegistryObject<Block> SAPPHIRE_STAIRS = registerBlock("sapphire_stairs",
            () -> new StairBlock(() -> ModBlocks.SAPPHIRE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);
    public static final RegistryObject<Block> SAPPHIRE_SLAB = registerBlock("sapphire_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);

    // Someway interactable
    public static final RegistryObject<Block> SAPPHIRE_FENCE = registerBlock("sapphire_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);
    public static final RegistryObject<Block> SAPPHIRE_FENCE_GATE = registerBlock("sapphire_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);
    public static final RegistryObject<Block> SAPPHIRE_WALL = registerBlock("sapphire_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);

    // Interactable
    public static final RegistryObject<Block> SAPPHIRE_BUTTON = registerBlock("sapphire_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.VIKINGEXPANSION_TAB);
    public static final RegistryObject<Block> SAPPHIRE_PRESSURE_PLATE = registerBlock("sapphire_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.METAL).strength(5f)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.VIKINGEXPANSION_TAB);
    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.VIKINGEXPANSION_TAB);
    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.VIKINGEXPANSION_TAB);

    // Flowers
    public static final RegistryObject<Block> PINK_ROSE = registerBlock("pink_rose",
            () -> new FlowerBlock(MobEffects.HEAL, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.VIKINGEXPANSION_TAB);

    public static final RegistryObject<Block> POTTED_PINK_ROSE = registerBlockWithoutBlockItem("potted_pink_rose",
            () -> new FlowerPotBlock(null, ModBlocks.PINK_ROSE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));



    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltipKey){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    // If you want to add tooltip for a block, pass a string for example `tooltip.vikingexpansion.block.speedy_block` and translate it in the en_us.json
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab, String tooltipKey){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
