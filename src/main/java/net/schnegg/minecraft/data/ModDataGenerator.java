package net.schnegg.minecraft.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.schnegg.minecraft.SilasMod;

@Mod.EventBusSubscriber(modid = SilasMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerator {

    @SubscribeEvent
    public static void data(GatherDataEvent event) {
        final DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new ModBlockTagsProvider(generator));
            generator.addProvider(new ModItemTagsProvider(generator));

            generator.addProvider(new MyRecipeProvider(generator));

            //generator.addProvider(new TutorialModLootTableProvider(generator));
        }
    }

}
