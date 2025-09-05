package com.tizio.withertweaks;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;

@Mod(WitherTweaks.MODID)
public class WitherTweaks {

    public static final String MODID = "withertweaks";

    public WitherTweaks(IEventBus modEventBus, ModContainer modContainer) {

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

    }

}