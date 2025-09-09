package com.tizio.withertweaks.mixin;

import com.tizio.withertweaks.Config;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WitherBoss.class)
public class WitherCanDestroy {

    @Inject(method = "canDestroy", at = @At("HEAD"), cancellable = true)
    private static void destroy(BlockState state, CallbackInfoReturnable<Boolean> cir){
        if(Config.WITHER_DESTROY_LEVEL.get()<2) cir.setReturnValue(false);
    }

}