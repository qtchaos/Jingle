package dev.chaos.jingle.mixin;

import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import static dev.chaos.jingle.client.JingleClient.PLAY_SOUND;

@Mixin(MultiplayerScreen.class)
public class MultiplayerScreenMixin {
    @Inject(at = @At("HEAD"), method = "connect*")
    private void init(CallbackInfo ci) {
        PLAY_SOUND = true;
    }
}
