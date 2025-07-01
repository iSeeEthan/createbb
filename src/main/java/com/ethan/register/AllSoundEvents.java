package com.ethan.register;

import com.ethan.CreateBrokenBad;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class AllSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT, CreateBrokenBad.MOD_ID);

    public static final DeferredHolder<SoundEvent, SoundEvent> BRASS_CALL_BELL_DING = SOUND_EVENTS.register(
            "brass_call_bell_ding",
            () -> SoundEvent.createFixedRangeEvent(ResourceLocation.fromNamespaceAndPath(CreateBrokenBad.MOD_ID, "brass_call_bell_ding"), 16f)
    );
}