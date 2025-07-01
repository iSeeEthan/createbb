package com.ethan;

import com.ethan.register.*;
import net.minecraft.world.level.block.ComposterBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(CreateBrokenBad.MOD_ID)
public class CreateBrokenBad {
    public static final String MOD_ID = "createbb";

    public CreateBrokenBad(IEventBus eventBus) {
        // Register in proper order
        AllSoundEvents.SOUND_EVENTS.register(eventBus);
        CBBItems.ITEMS.register(eventBus);
        CBBBlocks.BLOCKS.register(eventBus);
        CBBBlocks.ITEMS.register(eventBus);
        CBBFluids.FLUID_TYPES.register(eventBus);
        CBBFluids.FLUIDS.register(eventBus);
        CBBFluids.ITEMS.register(eventBus);

        CBBBlockEntityTypes.BLOCK_ENTITY_TYPES.register(eventBus);
        Tab.TAB.register(eventBus);

        eventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(AllEvents.class);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(CBBItems.EPHEDRA.get(), 0.3f);
            ComposterBlock.COMPOSTABLES.put(CBBItems.EPHEDRA_SEEDS.get(), 0.65f);
        });
    }
}