package com.franco227.grappler;

import com.franco227.grappler.item.GrapplerItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Grappler implements ModInitializer {
    public static final String MOD_ID = "grappler";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        GrapplerItems.initialize();
        LOGGER.info("[Grappler] Hooking grapplers!");
    }
}
