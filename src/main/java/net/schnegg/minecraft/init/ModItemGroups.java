package net.schnegg.minecraft.init;

import net.minecraft.block.Blocks;
import net.schnegg.minecraft.itemgroup.BasicItemGroup;

public class ModItemGroups {

    //public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(SilasMod.MOD_ID, () -> new ItemStack(ModItems.COTE_AZURE_AXE_ITEM));

    public static final BasicItemGroup MOD_ITEM_GROUP = new BasicItemGroup("group", () -> Blocks.DAMAGED_ANVIL);
}
