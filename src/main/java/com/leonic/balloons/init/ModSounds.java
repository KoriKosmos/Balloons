package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;

import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(Registries.SOUND_EVENT, Balloons.MOD_ID);

    // TODO: Register sound events here
    // Example:
    // public static final DeferredHolder<SoundEvent, SoundEvent> BALLOON_POP =
    //     SOUND_EVENTS.register("balloon.pop", () -> SoundEvent.createVariableRangeEvent(
    //         ResourceLocation.fromNamespaceAndPath(Balloons.MOD_ID, "balloon.pop")));
}
