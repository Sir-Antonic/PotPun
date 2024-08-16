package io.github.sirantonic.potpun;

import io.github.sirantonic.potpun.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PotPun implements ModInitializer {
    public static final String MOD_ID = "potpun";
    public static final String MOD_NAME = "Potpun";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    @Override
    public void onInitialize() {

        ModItems.initialize();
    }
}
