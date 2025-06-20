package org.osteam.ancient_ruins;


import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;



public class ModItems {
    public static final Item ANCIENT_SHARD = new Item(new Item.Settings());
    public static final Item FEX = new Item(new Item.Settings().food(new FoodComponent.Builder().build()));


    public static void register() {
        Registry.register(Registries.ITEM, "ancient_shard", ANCIENT_SHARD);
        Registry.register(Registries.ITEM, "fex", FEX);

    }

}
