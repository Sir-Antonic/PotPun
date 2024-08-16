package io.github.sirantonic.potpun.registry;

import io.github.sirantonic.potpun.PotPun;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item OAK_STICK = register("oak_stick");
    public static final Item SPRUCE_STICK = register("spruce_stick");
    public static final Item BIRCH_STICK = register("birch_stick");
    public static final Item JUNGLE_STICK = register("jungle_stick");
    public static final Item ACACIA_STICK = register("acacia_stick");
    public static final Item DARK_OAK_STICK = register("dark_oak_stick");
    public static final Item MANGROVE_STICK = register("mangrove_stick");
    public static final Item CHERRY_STICK = register("cherry_stick");
    public static final Item CRIMSON_STICK = register("crimson_stick");
    public static final Item WARPED_STICK = register("warped_stick");

    public static Item register(String id) {
        return Registry.register(Registries.ITEM, Identifier.of(PotPun.MOD_ID, id), new Item(new Item.Settings()));
    }

    public static void initialize() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsGroup);
    }

    private static void addItemsToIngredientsGroup(FabricItemGroupEntries itemGroup) {
        itemGroup.addAfter(Items.NETHERITE_INGOT,   ModItems.OAK_STICK);
        itemGroup.addAfter(ModItems.OAK_STICK,      ModItems.SPRUCE_STICK);
        itemGroup.addAfter(ModItems.SPRUCE_STICK,   ModItems.BIRCH_STICK);
        itemGroup.addAfter(ModItems.BIRCH_STICK,    ModItems.JUNGLE_STICK);
        itemGroup.addAfter(ModItems.JUNGLE_STICK,   ModItems.ACACIA_STICK);
        itemGroup.addAfter(ModItems.ACACIA_STICK,   ModItems.DARK_OAK_STICK);
        itemGroup.addAfter(ModItems.DARK_OAK_STICK, ModItems.MANGROVE_STICK);
        itemGroup.addAfter(ModItems.MANGROVE_STICK, ModItems.CHERRY_STICK);
        itemGroup.addAfter(ModItems.CHERRY_STICK,   ModItems.CRIMSON_STICK);
        itemGroup.addAfter(ModItems.CRIMSON_STICK,  ModItems.WARPED_STICK);
    }
}
