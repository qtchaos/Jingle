package dev.chaos.jingle.client.event;


import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

import static dev.chaos.jingle.client.JingleClient.PLAY_SOUND;
import static dev.chaos.jingle.client.JingleClient.alert;


public class TickHandler {
    public static void register() {
        ClientTickEvents.START_WORLD_TICK.register(world -> {
            if (PLAY_SOUND) {
                alert();
            }
        });
    }
}
