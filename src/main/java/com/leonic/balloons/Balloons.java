package com.leonic.balloons;

import com.leonic.balloons.init.ModBlocks;
import com.leonic.balloons.init.ModCreativeTabs;
import com.leonic.balloons.init.ModItems;
import com.leonic.balloons.init.ModSounds;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Balloons.MOD_ID)
public class Balloons {

    public static final String MOD_ID = "bm";

    public Balloons(IEventBus modEventBus) {
        ModSounds.SOUND_EVENTS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
