package com.tizio.withertweaks.mixin;

import com.tizio.withertweaks.Config;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WitherSkull.class)
public class WitherSkullExplosion extends AbstractHurtingProjectile {

    protected WitherSkullExplosion(EntityType<? extends AbstractHurtingProjectile> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "onHit", at = @At("HEAD"), cancellable = true)
    public void skullExplosion(HitResult result, CallbackInfo ci){

        if (Config.WITHER_DESTROY_LEVEL.getAsInt()==0) {
            super.onHit(result);
            if (!this.level().isClientSide) {
                this.discard();
            }
            ci.cancel();

        }

    }

}