package com.tizio.withertweaks;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WitherTweaks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.BooleanValue WITHER_INVULNERABILITY = BUILDER
            .comment("Wither invulnerability and explosion when summoned")
            .define("witherInvulnerability", false);

    public static final ForgeConfigSpec.IntValue WITHER_DESTROY_LEVEL = BUILDER
            .comment("Which blocks can Wither destroy? 0 can't destroy any block, 1 can't break tough blocks like obsidian, 2 default behaviour")
            .defineInRange("witherDestroyLevel", 1, 0, 2);

    static final ForgeConfigSpec SPEC = BUILDER.build();

}