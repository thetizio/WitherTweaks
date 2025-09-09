package com.tizio.withertweaks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WitherTweaks.MODID)
public class WitherTweaks {

    public static final String MODID = "withertweaks";

    public WitherTweaks(FMLJavaModLoadingContext context) {

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

    }

}