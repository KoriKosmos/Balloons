package com.leonic.balloons.init;

import com.leonic.balloons.Balloons;

import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(Balloons.MOD_ID);

    // TODO: Register items here.
    //
    // Block items are registered automatically when using
    // DeferredRegister.Blocks#registerSimpleBlockItem.
    //
    // Standalone items (rubber, rubber_sheet, rubber_nozzle, rubber_ball):
    // public static final DeferredItem<Item> RUBBER =
    //     ITEMS.register("rubber", () -> new Item(new Item.Properties()));
}
