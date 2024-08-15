package io.github.sirantonic.potpun;

import io.github.sirantonic.potpun.registeritems.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class PotPun implements ModInitializer {
    public static final String MOD_ID = "potpun";

    @Override
    public void onInitialize() {
        
        //Item Registration
        ModItems.initialize();
    }
}
