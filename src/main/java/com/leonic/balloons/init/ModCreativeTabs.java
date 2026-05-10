package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Balloons.MOD_ID);

    // TODO: Register creative tab and populate with mod items/blocks.
    // public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BALLOONS_TAB =
    //     CREATIVE_MODE_TABS.register("balloons", () -> CreativeModeTab.builder()
    //         .title(Component.translatable("itemGroup.bm.balloons"))
    //         .icon(() -> new ItemStack(ModItems.RUBBER.get()))
    //         .displayItems((params, output) -> {
    //             // add items here
    //         })
    //         .build());
}
