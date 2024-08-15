package io.github.sirantonic.potpun.registeritems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ModItems {
    public static Item register(Item item, String id) {

        return register(new Item(new Item.Settings()), id);
    }

    public static final Item OAK_STICK = register(
            new Item(new Item.Settings()),
            "oak_stick"
    );
    public static final Item SPRUCE_STICK = register(
            new Item(new Item.Settings()),
            "spruce_stick"
    );
    public static final Item BIRCH_STICK = register(
            new Item(new Item.Settings()),
            "birch_stick"
    );
    public static final Item JUNGLE_STICK = register(
            new Item(new Item.Settings()),
            "jungle_stick"
    );
    public static final Item ACACIA_STICK = register(
            new Item(new Item.Settings()),
            "acacia_stick"
    );
    public static final Item DARK_OAK_STICK = register(
            new Item(new Item.Settings()),
            "dark_oak_stick"
    );
    public static final Item MANGROVE_STICK = register(
            new Item(new Item.Settings()),
            "mangrove_stick"
    );
    public static final Item CHERRY_STICK = register(
            new Item(new Item.Settings()),
            "cherry_stick"
    );
    public static final Item CRIMSON_STICK = register(
            new Item(new Item.Settings()),
            "crimson_stick"
    );
    public static final Item WARPED_STICK = register(
            new Item(new Item.Settings()),
            "warped_stick"
    );

    public static void initialize(){

        //Item Group Placements
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.NETHERITE_INGOT, ModItems.OAK_STICK);
        });

    }
}
