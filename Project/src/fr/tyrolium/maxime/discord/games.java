package fr.tyrolium.maxime.discord;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;

public class games {

    public static void SuperSmashBrosUltimate() {
        DiscordRPC DiscStatus = DiscordRPC.INSTANCE;
        String IdApp= "849915439844687893";
        String IdSteam = "";
        DiscordEventHandlers DiscHandler = new DiscordEventHandlers();
        DiscStatus.Discord_Initialize( IdApp, DiscHandler, true, IdSteam);
        DiscordRichPresence status = new DiscordRichPresence();
        status.startTimestamp = System.currentTimeMillis() / 1000;
        status.largeImageKey = "tyrolium_servermc_v2_discord";
        status.largeImageText = "Super Smash Bros. Ultimate";
        status.details = "";
        status.state = " Joue depuis : ";
        DiscStatus.Discord_UpdatePresence(status);
    }
}
