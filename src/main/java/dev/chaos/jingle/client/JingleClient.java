package dev.chaos.jingle.client;

import dev.chaos.jingle.client.event.TickHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.sound.SoundEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.client.MinecraftClient;

@Environment(EnvType.CLIENT)
public class JingleClient implements ClientModInitializer {
    public static Logger LOGGER;
    public static MinecraftClient client;
    public static boolean PLAY_SOUND = true;
    public static boolean FIRST_INIT = true;

    @Override
    public void onInitializeClient() {
        LOGGER = LoggerFactory.getLogger("Jingle");
        LOGGER.info("Jingle initialized.");
        TickHandler.register();
    }
    public static void alert() {
        client = MinecraftClient.getInstance();
        client.getSoundManager().play(PositionedSoundInstance.master(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, 1F));
        PLAY_SOUND = false;
    }
}
