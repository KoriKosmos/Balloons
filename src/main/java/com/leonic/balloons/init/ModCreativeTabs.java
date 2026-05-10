package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Registers the Balloons creative mode tab containing all mod items and blocks.
 *
 * @author ZanyLeonic
 */
public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Balloons.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BALLOONS_TAB =
            CREATIVE_MODE_TABS.register("balloons", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.bm.balloons"))
                    .icon(() -> new ItemStack(ModItems.RUBBER.get()))
                    .displayItems((params, output) -> {
                        // Crafting components
                        output.accept(ModItems.RUBBER.get());
                        output.accept(ModItems.RUBBER_SHEET.get());
                        output.accept(ModItems.RUBBER_NOZZLE.get());
                        output.accept(ModItems.RUBBER_BALL.get());

                        // Balloon blocks (all 16 colors)
                        output.accept(ModBlocks.BALLOON_WHITE.get());
                        output.accept(ModBlocks.BALLOON_ORANGE.get());
                        output.accept(ModBlocks.BALLOON_MAGENTA.get());
                        output.accept(ModBlocks.BALLOON_LIGHT_BLUE.get());
                        output.accept(ModBlocks.BALLOON_YELLOW.get());
                        output.accept(ModBlocks.BALLOON_LIME.get());
                        output.accept(ModBlocks.BALLOON_PINK.get());
                        output.accept(ModBlocks.BALLOON_GRAY.get());
                        output.accept(ModBlocks.BALLOON_LIGHT_GRAY.get());
                        output.accept(ModBlocks.BALLOON_CYAN.get());
                        output.accept(ModBlocks.BALLOON_PURPLE.get());
                        output.accept(ModBlocks.BALLOON_BLUE.get());
                        output.accept(ModBlocks.BALLOON_BROWN.get());
                        output.accept(ModBlocks.BALLOON_GREEN.get());
                        output.accept(ModBlocks.BALLOON_RED.get());
                        output.accept(ModBlocks.BALLOON_BLACK.get());
                    })
                    .build());
}
