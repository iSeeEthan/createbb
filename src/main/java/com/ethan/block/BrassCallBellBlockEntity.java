package com.ethan.block;

import com.ethan.register.CBBBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BrassCallBellBlockEntity extends BlockEntity {
    private int ticksRemaining = 5;

    @SuppressWarnings("unused")
    public BrassCallBellBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(CBBBlockEntityTypes.BRASS_CALL_BELL.get(), pWorldPosition, pBlockState);
    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, BrassCallBellBlockEntity pBlockEntity) {
        if (pState.getValue(BrassCallBellBlock.DOWN)) {
            if (pBlockEntity.ticksRemaining > 0) {
                pBlockEntity.ticksRemaining--;
            } else {
                pLevel.setBlock(pPos, pState.setValue(BrassCallBellBlock.DOWN, false), 3);
                pBlockEntity.ticksRemaining = 5;
            }
        }
    }
}