package com.ethan.register;

import com.ethan.CreateBrokenBad;
import com.ethan.block.BrassCallBellBlock;
import com.ethan.block.EphedraBlock;
import com.ethan.block.TrayBlock;
import com.ethan.item.BrassCallBellBlockItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class CBBBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, CreateBrokenBad.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, CreateBrokenBad.MOD_ID);

    public static final DeferredHolder<Block, Block> EPHEDRA_CROP_BLOCK = BLOCKS.register("ephedra_crop_block", () -> new EphedraBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BEETROOTS)));
    public static final DeferredHolder<Block, Block> BRASS_CALL_BELL = BLOCKS.register("brass_call_bell", () -> new BrassCallBellBlock(BlockBehaviour.Properties.of().strength(1.0f)));
    public static final DeferredHolder<Item, Item> BRASS_CALL_BELL_ITEM = ITEMS.register("brass_call_bell", () -> new BrassCallBellBlockItem(BRASS_CALL_BELL.get(), new Item.Properties()));
    public static final DeferredHolder<Block, Block> TRAPPED_BRASS_CALL_BELL = BLOCKS.register("trapped_brass_call_bell", () -> new BrassCallBellBlock.Trapped(BlockBehaviour.Properties.of().strength(1.0f)));
    public static final DeferredHolder<Item, Item> TRAPPED_BRASS_CALL_BELL_ITEM = ITEMS.register("trapped_brass_call_bell", () -> new BlockItem(TRAPPED_BRASS_CALL_BELL.get(), new Item.Properties()));
    public static final DeferredHolder<Block, Block> BLUE_METH_TRAY = BLOCKS.register("blue_meth_tray", () -> new TrayBlock.Blue(BlockBehaviour.Properties.of().strength(0.5f)));
    public static final DeferredHolder<Item, Item> BLUE_METH_TRAY_ITEM = ITEMS.register("blue_meth_tray", () -> new BlockItem(BLUE_METH_TRAY.get(), new Item.Properties()));
    public static final DeferredHolder<Block, Block> TRAY = BLOCKS.register("tray", () -> new TrayBlock.Empty(BlockBehaviour.Properties.of().strength(0.5f)));
    public static final DeferredHolder<Item, Item> TRAY_ITEM = ITEMS.register("tray", () -> new BlockItem(TRAY.get(), new Item.Properties()));
    public static final DeferredHolder<Block, Block> WHITE_METH_TRAY = BLOCKS.register("white_meth_tray", () -> new TrayBlock.White(BlockBehaviour.Properties.of().strength(0.5f)));
    public static final DeferredHolder<Item, Item> WHITE_METH_TRAY_ITEM = ITEMS.register("white_meth_tray", () -> new BlockItem(WHITE_METH_TRAY.get(), new Item.Properties()));
}