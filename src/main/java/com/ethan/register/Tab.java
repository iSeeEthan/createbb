package com.ethan.register;

import com.ethan.CreateBrokenBad;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class Tab {
    public static final DeferredRegister<CreativeModeTab> TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateBrokenBad.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATEBB = TAB.register("createbb",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.CreateBB"))
                    .icon(() -> CBBItems.BLUE_METH.get().getDefaultInstance())
                    .build()
    );

    public static void register(IEventBus eventBus) {
        TAB.register(eventBus);
    }

    @EventBusSubscriber(modid = CreateBrokenBad.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
    public static class TabEvents {
        @SubscribeEvent
        public static void buildContents(BuildCreativeModeTabContentsEvent event) {
            if (event.getTabKey() == CREATEBB.getKey()) {
                // Safely add items, checking if they're bound first
                CBBItems.ITEMS.getEntries().forEach(item -> {
                    try {
                        if (item.isBound()) {
                            event.accept(item.get());
                        }
                    } catch (Exception e) {
                        // Log the error but don't crash
                        System.err.println("Failed to add item to creative tab: " + item.getId());
                    }
                });

                CBBBlocks.ITEMS.getEntries().forEach(item -> {
                    try {
                        if (item.isBound()) {
                            event.accept(item.get());
                        }
                    } catch (Exception e) {
                        System.err.println("Failed to add block item to creative tab: " + item.getId());
                    }
                });

                CBBFluids.ITEMS.getEntries().forEach(item -> {
                    try {
                        if (item.isBound()) {
                            event.accept(item.get());
                        }
                    } catch (Exception e) {
                        System.err.println("Failed to add fluid item to creative tab: " + item.getId());
                    }
                });
            }
        }
    }
}