package com.zhiyu;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static void init() {}

    public static Item registerItems(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EternalViolet.MOD_ID, name), item);
    }
    public static Item registerItems(String name) {
        return registerItems(name,new Item(new Item.Settings()));
    }
    public static final Item FLINT_KNIFE = registerItems("flint_knife");
    public static final Item FURRY_CLOTH = registerItems("furry_cloth");
    public static final Item GOLDEN_KNIFE  = registerItems("golden_knife");
    public static final Item IRON_STICK = registerItems("iron_stick");
    public static final Item OBSIDIAN_KNIFE = registerItems("obsidian_knife");
    public static final Item WHITE_CLAY_BALL  = registerItems("white_clay_ball");

}
