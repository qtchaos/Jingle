package dev.chaos.jingle.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static dev.chaos.jingle.client.JingleClient.alert;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin {
    @Inject(at = @At("HEAD"), method = "wakeUp*")
    private void wakeUp(boolean bl, boolean updateSleepingPlayers, CallbackInfo ci) {
        alert();
    }
}
