package dev.chaos.jingle.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static dev.chaos.jingle.client.JingleClient.FIRST_INIT;
import static dev.chaos.jingle.client.JingleClient.alert;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    @Inject(at = @At("TAIL"), method = "render")
    private void render(CallbackInfo ci) {
        if (FIRST_INIT) {
            alert();
            FIRST_INIT = false;
        }
    }
}
