package com.ethan.block;

import com.ethan.register.AllSoundEvents;
import com.ethan.register.CBBBlockEntityTypes;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class BrassCallBellBlock extends BaseEntityBlock {
    public static final MapCodec<BrassCallBellBlock> CODEC = simpleCodec(BrassCallBellBlock::new);

    public BrassCallBellBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    public static BooleanProperty DOWN = BooleanProperty.create("down");

    @Override
    @SuppressWarnings("deprecation")
    public @NotNull VoxelShape getShape(@NotNull BlockState pState, @NotNull BlockGetter pLevel, @NotNull BlockPos pPos, @NotNull CollisionContext pContext) {
        return shape;
    }

    private static final VoxelShape shape = Stream.of(
            Block.box(6, 1, 6, 10, 3, 10),
            Block.box(5, 0, 5, 11, 1, 11),
            Block.box(7, 3, 7, 9, 4, 9)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    @Nullable
    @Override
    public BlockState getStateForPlacement(@NotNull BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(DOWN, false);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(DOWN);
    }

    @SuppressWarnings("deprecation")
    public @NotNull InteractionResult use(@NotNull BlockState pState, @NotNull Level pLevel, @NotNull BlockPos pPos, @NotNull Player pPlayer, @NotNull InteractionHand pHand, @NotNull BlockHitResult pHit) {
        pState = pState.setValue(DOWN, true);
        pLevel.setBlock(pPos, pState, 3);
        pLevel.playSound(pPlayer, pPos, AllSoundEvents.BRASS_CALL_BELL_DING.get(), net.minecraft.sounds.SoundSource.BLOCKS, 2f, 1f);
        return InteractionResult.sidedSuccess(pLevel.isClientSide);
    }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState pState) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pPos, @NotNull BlockState pState) {
        return new BrassCallBellBlockEntity(pPos, pState);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onRemove(@NotNull BlockState pState, Level pLevel, @NotNull BlockPos pPos, @NotNull BlockState pNewState, boolean pIsMoving) {
        if (!pState.is(pNewState.getBlock())) {
            pLevel.removeBlockEntity(pPos);
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(@NotNull Level pLevel, @NotNull BlockState pState, @NotNull BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, CBBBlockEntityTypes.BRASS_CALL_BELL.get(), BrassCallBellBlockEntity::tick);
    }

    public static class Trapped extends BrassCallBellBlock {
        public static final MapCodec<Trapped> CODEC = simpleCodec(Trapped::new);

        public Trapped(Properties pProperties) {
            super(pProperties);
        }

        @Override
        protected MapCodec<? extends BaseEntityBlock> codec() {
            return CODEC;
        }

        @Override
        @SuppressWarnings("deprecation")
        public int getSignal(@NotNull BlockState pBlockState, @NotNull BlockGetter pBlockAccess, @NotNull BlockPos pPos, @NotNull Direction pSide) {
            return pBlockState.getValue(DOWN) ? 15 : 0;
        }
    }
}