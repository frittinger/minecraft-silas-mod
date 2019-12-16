package net.schnegg.minecraft;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.schnegg.minecraft.SilasMod.MOD_ID;

/**
 * The main class of the mod, this is the class that looks like a mod to forge.
 */
@Mod(MOD_ID)
public class SilasMod {

    /**
     * The modid of this mod, this has to match the modid in the mods.toml and has to be in the format defined in {@link net.minecraftforge.fml.loading.moddiscovery.ModInfo}
     */
    public static final String MOD_ID = "silasmod";

    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public SilasMod() {
        LOGGER.debug("Hello from Silas example Mod!");
    }

}