package io.github.sirantonic.potpun.datagen;

import io.github.sirantonic.potpun.registeritems.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }



    @Override
    public void generate(RecipeExporter exporter) {
        generateStick(exporter, ModItems.OAK_STICK, Items.OAK_PLANKS);
    }

    public void generateStick(RecipeExporter exporter, ItemConvertible stick, ItemConvertible planks) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, stick)
                .pattern(" X ")
                .pattern(" X ")
                .input('X', planks)
                .criterion(FabricRecipeProvider.hasItem(planks),
                        FabricRecipeProvider.conditionsFromItem(planks))
                .offerTo(exporter);
    }
}
