package com.waterlord7788.nature_expansion.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab NATUREEXPANSION_TAB = new CreativeModeTab("natureexpansion") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLACK_BERRIES.get());
        }
    };
}
