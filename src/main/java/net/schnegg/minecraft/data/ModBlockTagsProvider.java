package net.schnegg.minecraft.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.schnegg.minecraft.init.ModBlocks;
import net.schnegg.minecraft.item.ModTags;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerTags() {
        getBuilder(ModTags.Blocks.TUTORIAL).add(ModBlocks.FREIBURG_BLOCK).add(ModBlocks.NIZZA_BLOCK).add(Tags.Blocks.STORAGE_BLOCKS_DIAMOND);
    }
}
