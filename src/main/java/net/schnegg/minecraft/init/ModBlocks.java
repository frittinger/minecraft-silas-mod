package net.schnegg.minecraft.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.schnegg.minecraft.SilasMod;
import net.schnegg.minecraft.block.FreiburgBlock;
import net.schnegg.minecraft.block.NizzaBlock;
import net.schnegg.minecraft.item.BasicBlockItem;

@Mod.EventBusSubscriber(modid = SilasMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {

    public static final FreiburgBlock FREIBURG_BLOCK = new FreiburgBlock();
    public static final NizzaBlock NIZZA_BLOCK = new NizzaBlock();

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event) {
        final IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(FREIBURG_BLOCK.setRegistryName(SilasMod.MOD_ID, "freiburg_block"));
        registry.register(NIZZA_BLOCK.setRegistryName(SilasMod.MOD_ID, "nizza_block"));
    }

    @SubscribeEvent
    public static void registerBlockItem(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new BasicBlockItem(FREIBURG_BLOCK));
        registry.register(new BasicBlockItem(NIZZA_BLOCK));
    }

}
