package dev.chaos.jingle.client.event;

import dev.chaos.jingle.client.JingleClient;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;

public class TickHandler {
    public static void register() {
        ClientTickEvents.START_WORLD_TICK.register(world -> {
            MinecraftClient client = MinecraftClient.getInstance();
            if (client.player != null && client.worldRenderer.isRenderingReady(client.player.getBlockPos()) && client.currentScreen == null) {
                if (JingleClient.PLAY_SOUND) {
                    JingleClient.alert();
                }
            }
        });
    }
}
