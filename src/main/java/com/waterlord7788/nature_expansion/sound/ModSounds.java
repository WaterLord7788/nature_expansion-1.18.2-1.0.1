package com.waterlord7788.nature_expansion.sound;

import com.waterlord7788.nature_expansion.NatureExpansion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NatureExpansion.MOD_ID);

    /*
    public static final RegistryObject<SoundEvent> DOWSING_ROD_FOUND_ORE = registerSoundEvent("dowsing_rod_found_ore");

    public static RegistryObject<SoundEvent> SAPPHIRE_LAMP_BREAK = registerSoundEvent("sapphire_lamp_break");
    public static RegistryObject<SoundEvent> SAPPHIRE_LAMP_STEP = registerSoundEvent("sapphire_lamp_step");
    public static RegistryObject<SoundEvent> SAPPHIRE_LAMP_PLACE = registerSoundEvent("sapphire_lamp_place");
    public static RegistryObject<SoundEvent> SAPPHIRE_LAMP_HIT = registerSoundEvent("sapphire_lamp_hit");
    public static RegistryObject<SoundEvent> SAPPHIRE_LAMP_FALL = registerSoundEvent("sapphire_lamp_fall");

    // Viking sound for a music disc
    public static RegistryObject<SoundEvent> BORGAR_ALEXANDER_NAKARADA = registerSoundEvent("borgar_alexander_nakarada");


    public static final ForgeSoundType SAPPHIRE_LAMP_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.SAPPHIRE_LAMP_BREAK, ModSounds.SAPPHIRE_LAMP_STEP, ModSounds.SAPPHIRE_LAMP_PLACE,
            ModSounds.SAPPHIRE_LAMP_HIT, ModSounds.SAPPHIRE_LAMP_FALL);
    */


    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(NatureExpansion.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
