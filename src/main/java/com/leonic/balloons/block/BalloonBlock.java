package com.leonic.balloons.block;

import com.leonic.balloons.init.ModSounds;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * A single block class for all 16 balloon colors.
 * Replaces the 16 separate BlockBalloon<Color> classes from 1.7.10.
 *
 * @author ZanyLeonic
 */
public class BalloonBlock extends Block {

    // Slightly smaller than a full block to give a rounded appearance
    private static final VoxelShape SHAPE = Block.box(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

    private final DyeColor color;

    public BalloonBlock(DyeColor color) {
        super(BlockBehaviour.Properties.of()
                .mapColor(color.getMapColor())
                .strength(1.0F, 1.0F)
                .sound(SoundType.WOOL)
                .noOcclusion());
        this.color = color;
    }

    public DyeColor getColor() {
        return this.color;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide()) {
            level.playSound(null, pos, ModSounds.BALLOON_POP.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
        }
        return super.playerWillDestroy(level, pos, state, player);
    }
}
