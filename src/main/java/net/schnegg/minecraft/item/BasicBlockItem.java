package net.schnegg.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.schnegg.minecraft.init.ModItemGroups;

public class BasicBlockItem extends BlockItem {

    public BasicBlockItem(Block block) {
        super(block, new Properties().group(ModItemGroups.MOD_ITEM_GROUP));
        setRegistryName(block.getRegistryName());
    }

}
