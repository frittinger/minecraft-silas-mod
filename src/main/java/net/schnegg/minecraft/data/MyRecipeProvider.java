package net.schnegg.minecraft.data;

import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.schnegg.minecraft.SilasMod;
import net.schnegg.minecraft.init.ModBlocks;
import net.schnegg.minecraft.init.ModItems;
import net.schnegg.minecraft.item.ModTags;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MyRecipeProvider extends RecipeProvider {

    public MyRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(ModItems.COTE_AZURE_AXE_ITEM, 5) //
                .patternLine("NNN") //
                .patternLine("FNF") //
                .patternLine("FNF") //
                .key('N', ModBlocks.NIZZA_BLOCK) //
                .key('F', ModBlocks.FREIBURG_BLOCK) //
                .build(consumer, new ResourceLocation(SilasMod.MOD_ID, "cote_azure_axe"));

        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.NIZZA_BLOCK, 2) //
                .addIngredient(ModTags.Items.TUTORIAL) //
                .addIngredient(Blocks.DIRT) //
                .addIngredient(Blocks.DIRT) //
                .addCriterion("has_dirt", hasItem(Blocks.DIRT)) //
                .build(consumer, new ResourceLocation(SilasMod.MOD_ID, "tutorial_nizza_blocks")); // TODO

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromTag(ModTags.Items.TUTORIAL), Blocks.DIRT, 3, 20) //
                .addCriterion("has_tutorial_stuff", hasItem(ModTags.Items.TUTORIAL)) //
                .build(consumer, new ResourceLocation(SilasMod.MOD_ID, "tutorial_dirt")); // TODO

        CookingRecipeBuilder.smeltingRecipe(getFakeIngredient(Tags.Items.STORAGE_BLOCKS), Blocks.DIRT, 3, 20) //
                .addCriterion("has_storage_blocks", hasItem(Tags.Items.STORAGE_BLOCKS)) //
                .build(consumer, new ResourceLocation(SilasMod.MOD_ID, "tutorial_dirt_fake")); // TODO
    }

    private Ingredient getFakeIngredient(Tag<Item> tag) {
        return Ingredient.fromItemListStream(Stream.of(new Ingredient.TagList(tag) {

            @Override
            public Collection<ItemStack> getStacks() {
                return Arrays.asList(new ItemStack(Items.ACACIA_BOAT));
            }
        }));
    }
}
