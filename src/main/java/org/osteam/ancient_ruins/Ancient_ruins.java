package org.osteam.ancient_ruins;

import net.fabricmc.api.ModInitializer;

public class Ancient_ruins implements ModInitializer {
    public static final String MOD_ID = "ancient_ruins";
   @Override
    public void onInitialize() {
        ModItems.register();
        System.out.println("Hello Fabric world!");
    }

}

