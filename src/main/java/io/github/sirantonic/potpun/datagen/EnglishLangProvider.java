package io.github.sirantonic.potpun.datagen;

import java.util.concurrent.CompletableFuture;

import io.github.sirantonic.potpun.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

public class EnglishLangProvider extends FabricLanguageProvider {

    protected EnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add(ModItems.OAK_STICK, "Oak Stick");
        translationBuilder.add(ModItems.SPRUCE_STICK, "Spruce Stick");
        translationBuilder.add(ModItems.BIRCH_STICK, "Birch Stick");
        translationBuilder.add(ModItems.JUNGLE_STICK, "Jungle Stick");
        translationBuilder.add(ModItems.ACACIA_STICK, "Acacia Stick");
        translationBuilder.add(ModItems.DARK_OAK_STICK, "Dark_oak Stick");
        translationBuilder.add(ModItems.MANGROVE_STICK, "Mangrove Stick");
        translationBuilder.add(ModItems.CHERRY_STICK, "Cherry Stick");
        translationBuilder.add(ModItems.CRIMSON_STICK, "Crimson Stick");
        translationBuilder.add(ModItems.WARPED_STICK, "Warped Stick");
    }
}
