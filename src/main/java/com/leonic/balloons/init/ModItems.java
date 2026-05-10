package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Registers all items: standalone crafting components and block items for balloons.
 * Block items use registerSimpleBlockItem to wrap the corresponding DeferredBlock.
 *
 * @author ZanyLeonic
 */
public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Balloons.MOD_ID);

    // Standalone crafting component items
    public static final DeferredItem<Item> RUBBER =
            ITEMS.registerSimpleItem("rubber", new Item.Properties());
    public static final DeferredItem<Item> RUBBER_SHEET =
            ITEMS.registerSimpleItem("rubber_sheet", new Item.Properties());
    public static final DeferredItem<Item> RUBBER_NOZZLE =
            ITEMS.registerSimpleItem("rubber_nozzle", new Item.Properties());
    public static final DeferredItem<Item> RUBBER_BALL =
            ITEMS.registerSimpleItem("rubber_ball", new Item.Properties());

    // Block items for all 16 balloon colors
    public static final DeferredItem<BlockItem> BALLOON_WHITE_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_WHITE);
    public static final DeferredItem<BlockItem> BALLOON_ORANGE_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_ORANGE);
    public static final DeferredItem<BlockItem> BALLOON_MAGENTA_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_MAGENTA);
    public static final DeferredItem<BlockItem> BALLOON_LIGHT_BLUE_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_LIGHT_BLUE);
    public static final DeferredItem<BlockItem> BALLOON_YELLOW_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_YELLOW);
    public static final DeferredItem<BlockItem> BALLOON_LIME_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_LIME);
    public static final DeferredItem<BlockItem> BALLOON_PINK_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_PINK);
    public static final DeferredItem<BlockItem> BALLOON_GRAY_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_GRAY);
    public static final DeferredItem<BlockItem> BALLOON_LIGHT_GRAY_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_LIGHT_GRAY);
    public static final DeferredItem<BlockItem> BALLOON_CYAN_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_CYAN);
    public static final DeferredItem<BlockItem> BALLOON_PURPLE_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_PURPLE);
    public static final DeferredItem<BlockItem> BALLOON_BLUE_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_BLUE);
    public static final DeferredItem<BlockItem> BALLOON_BROWN_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_BROWN);
    public static final DeferredItem<BlockItem> BALLOON_GREEN_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_GREEN);
    public static final DeferredItem<BlockItem> BALLOON_RED_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_RED);
    public static final DeferredItem<BlockItem> BALLOON_BLACK_ITEM =
            ITEMS.registerSimpleBlockItem(ModBlocks.BALLOON_BLACK);
}
