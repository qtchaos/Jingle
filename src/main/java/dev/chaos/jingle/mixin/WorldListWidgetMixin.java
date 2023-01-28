package dev.chaos.jingle.mixin;

import net.minecraft.client.gui.screen.world.WorldListWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import static dev.chaos.jingle.client.JingleClient.PLAY_SOUND;

@Mixin(WorldListWidget.WorldEntry.class)
public class WorldListWidgetMixin {
    @Inject(at = @At("HEAD"), method = "play")
    private void play(CallbackInfo ci) {
        PLAY_SOUND = true;
    }
}
