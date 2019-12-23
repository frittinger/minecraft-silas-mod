package net.schnegg.minecraft.init;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.schnegg.minecraft.SilasMod;
import net.schnegg.minecraft.item.CoteAzureAxeItem;

//@ObjectHolder(SilasMod.MOD_ID)
@Mod.EventBusSubscriber(modid = SilasMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    public static final CoteAzureAxeItem COTE_AZURE_AXE_ITEM = new CoteAzureAxeItem();

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(COTE_AZURE_AXE_ITEM.setRegistryName(SilasMod.MOD_ID, "cote_azure_axe_item"));
    }

}
