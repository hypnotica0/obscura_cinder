package net.hypnotica.obscura_ch1.datagen;

import net.hypnotica.obscura_ch1.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(pOutput);
    }
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OBSCURE_CHARM.get())
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .define('#', Items.GOLD_INGOT)
                .define('$', ModItems.OBSCURE_GEM.get())
                .unlockedBy(getHasName(ModItems.OBSCURE_GEM.get()), has(ModItems.OBSCURE_GEM.get()))
                .save(consumer);
    }
}
