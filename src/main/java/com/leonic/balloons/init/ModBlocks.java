package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;
import com.leonic.balloons.block.BalloonBlock;

import net.minecraft.world.item.DyeColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Registers all balloon blocks using DeferredRegister.
 * Each DyeColor gets its own block entry.
 * Block items are registered separately in ModItems.
 *
 * @author ZanyLeonic
 */
public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Balloons.MOD_ID);

    public static final DeferredBlock<BalloonBlock> BALLOON_WHITE =
            BLOCKS.register("balloon_white", () -> new BalloonBlock(DyeColor.WHITE));
    public static final DeferredBlock<BalloonBlock> BALLOON_ORANGE =
            BLOCKS.register("balloon_orange", () -> new BalloonBlock(DyeColor.ORANGE));
    public static final DeferredBlock<BalloonBlock> BALLOON_MAGENTA =
            BLOCKS.register("balloon_magenta", () -> new BalloonBlock(DyeColor.MAGENTA));
    public static final DeferredBlock<BalloonBlock> BALLOON_LIGHT_BLUE =
            BLOCKS.register("balloon_light_blue", () -> new BalloonBlock(DyeColor.LIGHT_BLUE));
    public static final DeferredBlock<BalloonBlock> BALLOON_YELLOW =
            BLOCKS.register("balloon_yellow", () -> new BalloonBlock(DyeColor.YELLOW));
    public static final DeferredBlock<BalloonBlock> BALLOON_LIME =
            BLOCKS.register("balloon_lime", () -> new BalloonBlock(DyeColor.LIME));
    public static final DeferredBlock<BalloonBlock> BALLOON_PINK =
            BLOCKS.register("balloon_pink", () -> new BalloonBlock(DyeColor.PINK));
    public static final DeferredBlock<BalloonBlock> BALLOON_GRAY =
            BLOCKS.register("balloon_gray", () -> new BalloonBlock(DyeColor.GRAY));
    public static final DeferredBlock<BalloonBlock> BALLOON_LIGHT_GRAY =
            BLOCKS.register("balloon_light_gray", () -> new BalloonBlock(DyeColor.LIGHT_GRAY));
    public static final DeferredBlock<BalloonBlock> BALLOON_CYAN =
            BLOCKS.register("balloon_cyan", () -> new BalloonBlock(DyeColor.CYAN));
    public static final DeferredBlock<BalloonBlock> BALLOON_PURPLE =
            BLOCKS.register("balloon_purple", () -> new BalloonBlock(DyeColor.PURPLE));
    public static final DeferredBlock<BalloonBlock> BALLOON_BLUE =
            BLOCKS.register("balloon_blue", () -> new BalloonBlock(DyeColor.BLUE));
    public static final DeferredBlock<BalloonBlock> BALLOON_BROWN =
            BLOCKS.register("balloon_brown", () -> new BalloonBlock(DyeColor.BROWN));
    public static final DeferredBlock<BalloonBlock> BALLOON_GREEN =
            BLOCKS.register("balloon_green", () -> new BalloonBlock(DyeColor.GREEN));
    public static final DeferredBlock<BalloonBlock> BALLOON_RED =
            BLOCKS.register("balloon_red", () -> new BalloonBlock(DyeColor.RED));
    public static final DeferredBlock<BalloonBlock> BALLOON_BLACK =
            BLOCKS.register("balloon_black", () -> new BalloonBlock(DyeColor.BLACK));
}
