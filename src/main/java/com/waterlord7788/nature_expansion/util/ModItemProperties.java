package com.waterlord7788.nature_expansion.util;

import com.waterlord7788.nature_expansion.items.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItemProperties {
    /*
    public static void addCustomItemProperties() {
        makeBow(ModItems.SAPPHIRE_BOW.get());    // Registering our first bow - Sapphire Bow
        // makeBow(ModItems.AMETHYST_BOW.get()); // Registering our future second bow - Amethyst Bow
    }

    private static void makeBow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (itemStack, clientLevel, livingEntity, i) -> {
            if (livingEntity == null) {
                return 0.0F;
            } else {
                return livingEntity.getUseItem() != itemStack ? 0.0F : (float)(itemStack.getUseDuration() -
                        livingEntity.getUseItemRemainingTicks()) / 20.0F;
            }
        });

        ItemProperties.register(item, new ResourceLocation("pulling"), (itemStack, clientLevel, livingEntity, i) -> {
            return livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack ? 1.0F : 0.0F;
        });
    }
    */
}