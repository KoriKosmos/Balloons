package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Registers custom sound events for balloon pop and step sounds.
 *
 * @author ZanyLeonic
 */
public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(Registries.SOUND_EVENT, Balloons.MOD_ID);

    public static final DeferredHolder<SoundEvent, SoundEvent> BALLOON_POP =
            SOUND_EVENTS.register("balloon.pop", () -> SoundEvent.createVariableRangeEvent(
                    ResourceLocation.fromNamespaceAndPath(Balloons.MOD_ID, "balloon.pop")));

    public static final DeferredHolder<SoundEvent, SoundEvent> BALLOON_STEP =
            SOUND_EVENTS.register("balloon.step", () -> SoundEvent.createVariableRangeEvent(
                    ResourceLocation.fromNamespaceAndPath(Balloons.MOD_ID, "balloon.step")));
}
