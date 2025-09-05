package com.tizio.withertweaks;

import net.neoforged.neoforge.common.ModConfigSpec;

public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.BooleanValue WITHER_INVULNERABILITY = BUILDER
            .comment("Wither invulnerability and explosion when summoned")
            .define("witherInvulnerability", false);

    public static final ModConfigSpec.IntValue WITHER_DESTROY_LEVEL = BUILDER
            .comment("Which blocks can Wither destroy? 0 can't destroy any block, 1 can't break tough blocks like obsidian, 2 default behaviour")
            .defineInRange("witherDestroyLevel",1,0,2);

    static final ModConfigSpec SPEC = BUILDER.build();

}