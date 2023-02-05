package dev.chaos.jingle.mixin;

import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import static dev.chaos.jingle.client.JingleClient.PLAY_SOUND;

@Mixin(ClientWorld.class)
public class ClientWorldMixin {
    @Inject(at = @At("HEAD"), method = "disconnect")
    public void disconnect(CallbackInfo ci) {
        PLAY_SOUND = true;
    }
}
