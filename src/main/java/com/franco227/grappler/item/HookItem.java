package com.franco227.grappler.item;

import net.minecraft.item.Item;

public class HookItem extends Item {
    public HookItem(int maxDamage) {
        super(new Item.Settings().maxDamage(maxDamage));
    }
}
