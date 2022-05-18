package com.waterlord7788.nature_expansion.items;

import com.waterlord7788.nature_expansion.NatureExpansion;
import com.waterlord7788.nature_expansion.blocks.ModBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems extends Items {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NatureExpansion.MOD_ID);


    // Foods
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NATUREEXPANSION_TAB).food(ModFoods.CUCUMBER)));

    // Berries ( are both seeds and foods )
    public static final RegistryObject<Item> BLACK_BERRIES = ITEMS.register("black_berries",
            () -> new ItemNameBlockItem(ModBlocks.BLACK_BERRY_BUSH.get(),
                    (new Item.Properties()).tab(ModCreativeModeTab.NATUREEXPANSION_TAB)
                            .food(ModFoods.BLACK_BERRIES)));

    // Seeds
    public static final RegistryObject<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CUCUMBER_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModeTab.NATUREEXPANSION_TAB)));


    // Item with animated texture
    public static final RegistryObject<Item> MAGIC_DUST = ITEMS.register("magic_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NATUREEXPANSION_TAB)));

    /*public static final RegistryObject<Item> BORGAR_ALEXANDER_NAKARADA_MUSIC_DISC = ITEMS.register("borgar_alexander_nakarada_music_disc",
            () -> new RecordItem(4, ModSounds.BORGAR_ALEXANDER_NAKARADA,
                    new Item.Properties().tab(ModCreativeModeTab.NATUREEXPANSION_TAB)
                            .stacksTo(1)));*/


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}













