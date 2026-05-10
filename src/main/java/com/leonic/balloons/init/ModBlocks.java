package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;

import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Balloons.MOD_ID);

    // TODO: Register balloon blocks here.
    //
    // In 1.21.1, use a single BalloonBlock class with a DyeColor block state property
    // rather than 16 separate classes. Example:
    //
    // public static final DeferredBlock<BalloonBlock> BALLOON_BLACK =
    //     BLOCKS.register("balloon_black", () -> new BalloonBlock(DyeColor.BLACK));
}
