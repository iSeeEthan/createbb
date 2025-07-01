package com.ethan.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BrassCallBellBlockItem extends BlockItem {
    public BrassCallBellBlockItem(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    public void appendHoverText(ItemStack pStack, TooltipFlag.Default pTooltipFlag, List<Component> pTooltip) {
        pTooltip.add(Component.translatable("brass_call_bell_tooltip"));
    }
}