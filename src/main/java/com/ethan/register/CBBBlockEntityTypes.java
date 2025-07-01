package com.ethan.register;

import com.ethan.CreateBrokenBad;
import com.ethan.block.BrassCallBellBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class CBBBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, CreateBrokenBad.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BrassCallBellBlockEntity>> BRASS_CALL_BELL = BLOCK_ENTITY_TYPES.register(
            "brass_call_bell",
            () -> BlockEntityType.Builder.of(BrassCallBellBlockEntity::new,
                    CBBBlocks.BRASS_CALL_BELL.get(), CBBBlocks.TRAPPED_BRASS_CALL_BELL.get()).build(null)
    );
}