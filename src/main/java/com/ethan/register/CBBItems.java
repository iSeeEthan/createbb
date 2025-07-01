package com.ethan.register;

import com.ethan.CreateBrokenBad;
import com.ethan.item.MatchItem;
import com.ethan.item.MethItem;
import com.ethan.item.NonConsumedCatalystItem;
import com.ethan.item.ToolTippedItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class CBBItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, CreateBrokenBad.MOD_ID);

    public static final DeferredHolder<Item, Item> MATCH = ITEMS.register("match", () -> new MatchItem(new Item.Properties()));
    public static final DeferredHolder<Item, Item> PSEUDOPHEDRINE = ITEMS.register("pseudophedrine", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> SUDAFED = ITEMS.register("sudafed", () -> new ToolTippedItem("sudafed_tooltip", new Item.Properties()));
    public static final DeferredHolder<Item, Item> SUDAFED_BOX = ITEMS.register("sudafed_box", () -> new ToolTippedItem("sudafed_box_tooltip", new Item.Properties()));
    public static final DeferredHolder<Item, Item> EPHEDRA = ITEMS.register("ephedra", () -> new ToolTippedItem("ephedra_tooltip", new Item.Properties()));
    public static final DeferredHolder<Item, Item> EPHEDRA_SEEDS = ITEMS.register("ephedra_seeds", () -> new ItemNameBlockItem(CBBBlocks.EPHEDRA_CROP_BLOCK.get(), new Item.Properties()));
    public static final DeferredHolder<Item, Item> WHITE_PHOSPHORUS = ITEMS.register("white_phosphorus", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> RED_PHOSPHORUS = ITEMS.register("red_phosphorus", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> BRINE = ITEMS.register("brine", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> IODINE = ITEMS.register("iodine", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> WHITE_METH = ITEMS.register("white_meth", () -> new MethItem.White(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CRUSHED_COPPER = ITEMS.register("crushed_copper", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CRUSHED_ZINC = ITEMS.register("crushed_zinc", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_ZINC_CATALYST = ITEMS.register("copper_zinc_catalyst", () -> new NonConsumedCatalystItem(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CYANIDE = ITEMS.register("cyanide", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder()
                    .alwaysEdible()
                    .nutrition(1)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 60, 4), 1)
                    .build()
            )));
    public static final DeferredHolder<Item, Item> ALUMINOSILICATE_CATALYST = ITEMS.register("aluminosilicate_catalyst", () -> new NonConsumedCatalystItem(new Item.Properties()));
    public static final DeferredHolder<Item, Item> ALUMINOSILICATE_CHUNK = ITEMS.register("aluminosilicate_chunk", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> ALUMINOSILICATE_BIT = ITEMS.register("aluminosilicate_bit", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> NITROGEN = ITEMS.register("nitrogen", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> BLUE_METH = ITEMS.register("blue_meth", () -> new MethItem.Blue(new Item.Properties()));
}