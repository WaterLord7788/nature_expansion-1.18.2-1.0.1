package com.waterlord7788.nature_expansion.entity;

import com.waterlord7788.nature_expansion.NatureExpansion;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityType {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, NatureExpansion.MOD_ID);



    /*public static final RegistryObject<EntityType<SapphireArrow>> SAPPHIRE_ARROW = ENTITY_TYPES.register("sapphire_arrow",
            () -> EntityType.Builder.<SapphireArrow>of(SapphireArrow::new, MobCategory.MISC)
                    .sized(0.5F, 0.5F)
                    .clientTrackingRange(4)
                    .updateInterval(20)
                    .build(new ResourceLocation(natureexpansion.MOD_ID, "sapphire_arrow").toString()));
    */


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

    private static <T extends Entity> EntityType<T> register(String pKey, EntityType.Builder<T> pBuilder) {
        return Registry.register(Registry.ENTITY_TYPE, pKey, pBuilder.build(pKey));
    }
}
