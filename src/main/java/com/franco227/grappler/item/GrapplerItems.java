package com.franco227.grappler.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.franco227.grappler.Grappler.MOD_ID;

public class GrapplerItems {
    public static final Item WOODEN_GRAPPLING_HOOK = registerItem("wooden_grappling_hook", new HookItem(15));
    public static final Item STONE_GRAPPLING_HOOK = registerItem("stone_grappling_hook", new HookItem(33));
    public static final Item IRON_GRAPPLING_HOOK = registerItem("iron_grappling_hook", new HookItem(63));
    public static final Item GOLDEN_GRAPPLING_HOOK = registerItem("golden_grappling_hook", new HookItem(8));
    public static final Item DIAMOND_GRAPPLING_HOOK = registerItem("diamond_grappling_hook", new HookItem(391));
    public static final Item NETHERITE_GRAPPLING_HOOK = registerItem("netherite_grappling_hook", new HookItem(508));

    private static void addEquipmentItems(FabricItemGroupEntries entries) {
        entries.add(WOODEN_GRAPPLING_HOOK);
        entries.add(STONE_GRAPPLING_HOOK);
        entries.add(IRON_GRAPPLING_HOOK);
        entries.add(GOLDEN_GRAPPLING_HOOK);
        entries.add(DIAMOND_GRAPPLING_HOOK);
        entries.add(NETHERITE_GRAPPLING_HOOK);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(GrapplerItems::addEquipmentItems);
    }
}
