package io.github.sirantonic.potpun.datagen;

import java.util.concurrent.CompletableFuture;

import io.github.sirantonic.potpun.registry.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;

import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        generateStick(exporter, ModItems.OAK_STICK,      Items.OAK_PLANKS);
        generateStick(exporter, ModItems.SPRUCE_STICK,   Items.SPRUCE_PLANKS);
        generateStick(exporter, ModItems.BIRCH_STICK,    Items.BIRCH_PLANKS);
        generateStick(exporter, ModItems.JUNGLE_STICK,   Items.JUNGLE_PLANKS);
        generateStick(exporter, ModItems.ACACIA_STICK,   Items.ACACIA_PLANKS);
        generateStick(exporter, ModItems.DARK_OAK_STICK, Items.DARK_OAK_PLANKS);
        generateStick(exporter, ModItems.MANGROVE_STICK, Items.MANGROVE_PLANKS);
        generateStick(exporter, ModItems.CHERRY_STICK,   Items.CHERRY_PLANKS);
        generateStick(exporter, ModItems.CRIMSON_STICK,  Items.CRIMSON_PLANKS);
        generateStick(exporter, ModItems.WARPED_STICK,   Items.WARPED_PLANKS);
    }

    public void generateStick(RecipeExporter exporter, ItemConvertible stick, ItemConvertible planks) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, stick)
                .input('X', planks)
                .pattern(" X ")
                .pattern(" X ")
                .criterion(FabricRecipeProvider.hasItem(planks),
                        FabricRecipeProvider.conditionsFromItem(planks))
                .offerTo(exporter);
    }
}
