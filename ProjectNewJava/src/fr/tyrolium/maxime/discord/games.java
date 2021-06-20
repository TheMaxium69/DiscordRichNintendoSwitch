package fr.tyrolium.maxime.discord;

import club.minnced.discord.rpc.*;

public class games {

    public static void SuperSmashBrosUltimate() {
        DiscordRPC DiscStatus = DiscordRPC.INSTANCE;
        String IdApp= "853648719868854273";
        String IdSteam = "";
        DiscordEventHandlers DiscHandler = new DiscordEventHandlers();
        DiscStatus.Discord_Initialize( IdApp, DiscHandler, true, IdSteam);
        DiscordRichPresence status = new DiscordRichPresence();
        status.startTimestamp = System.currentTimeMillis() / 1000;
        status.largeImageKey = "supersmashbrosultimate";
        status.largeImageText = "Super Smash Bros. Ultimate";
        status.details = "";
        status.state = " Joue depuis : ";
        DiscStatus.Discord_UpdatePresence(status);
    }
}
