package net.schnegg.minecraft.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.schnegg.minecraft.init.ModBlocks;
import net.schnegg.minecraft.init.ModItems;
import net.schnegg.minecraft.item.ModTags;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerTags() {
        getBuilder(ModTags.Items.TUTORIAL).add(ModItems.COTE_AZURE_AXE_ITEM).add(ModBlocks.FREIBURG_BLOCK.asItem()).add(ModBlocks.NIZZA_BLOCK.asItem());
    }

}
