package fr.tyrolium.maxime.discord;

import club.minnced.discord.rpc.*;
import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.textured.STexturedButton;

public class games {


    public static void SuperSmashBrosUltimate(String arg1) {
        DiscordRPC DiscStatus = DiscordRPC.INSTANCE;
        String IdApp= "853648719868854273";
        String IdSteam = "";
        DiscordEventHandlers DiscHandler = new DiscordEventHandlers();
        DiscStatus.Discord_Initialize( IdApp, DiscHandler, true, IdSteam);
        DiscordRichPresence status = new DiscordRichPresence();
        status.startTimestamp = System.currentTimeMillis() / 1000;
        status.largeImageKey = "supersmashbrosultimate";
        status.largeImageText = "Super Smash Bros. Ultimate";
        status.smallImageKey = "nintendoswitch";
        status.smallImageText = "Nintendo Switch";
        status.details = arg1;
        status.partyId = "ae488379-351d-4a4f-ad32-2b9b01c91657";
        status.joinSecret = "MTI4NzM0OjFpMmhuZToxMjMxMjM= ";
        status.state = " Joue depuis : ";
        DiscStatus.Discord_UpdatePresence(status);
    }
    public static void SuperMario3DAllStars(String arg1) {
        DiscordRPC DiscStatus = DiscordRPC.INSTANCE;
        String IdApp= "856158258083528775";
        String IdSteam = "";
        DiscordEventHandlers DiscHandler = new DiscordEventHandlers();
        DiscStatus.Discord_Initialize( IdApp, DiscHandler, true, IdSteam);
        DiscordRichPresence status = new DiscordRichPresence();
        status.startTimestamp = System.currentTimeMillis() / 1000;
        status.largeImageKey = "supermario3dallstars";
        status.largeImageText = "Super Mario 3D All-Stars";
        status.smallImageKey = "nintendoswitch";
        status.smallImageText = "Nintendo Switch";
        status.details = arg1;
        status.state = " Joue depuis : ";
        DiscStatus.Discord_UpdatePresence(status);
    }
    public static void SuperMario3DWorldPlusBowsersFury(String arg1) {
        DiscordRPC DiscStatus = DiscordRPC.INSTANCE;
        String IdApp= "856172666582335518";
        String IdSteam = "";
        DiscordEventHandlers DiscHandler = new DiscordEventHandlers();
        DiscStatus.Discord_Initialize( IdApp, DiscHandler, true, IdSteam);
        DiscordRichPresence status = new DiscordRichPresence();
        status.startTimestamp = System.currentTimeMillis() / 1000;
        status.largeImageKey = "supermario3dworldplusbowsersfury";
        status.largeImageText = "Super Mario 3D World + Bowser's Fury";
        status.smallImageKey = "nintendoswitch";
        status.smallImageText = "Nintendo Switch";
        status.details = arg1;
        status.state = " Joue depuis : ";
        DiscStatus.Discord_UpdatePresence(status);
    }
    public static void SuperMarioOdyssey(String arg1) {
        DiscordRPC DiscStatus = DiscordRPC.INSTANCE;
        String IdApp= "856175882150740018";
        String IdSteam = "";
        DiscordEventHandlers DiscHandler = new DiscordEventHandlers();
        DiscStatus.Discord_Initialize( IdApp, DiscHandler, true, IdSteam);
        DiscordRichPresence status = new DiscordRichPresence();
        status.startTimestamp = System.currentTimeMillis() / 1000;
        status.largeImageKey = "supermarioodyssey";
        status.largeImageText = "Super Mario Odyssey";
        status.smallImageKey = "nintendoswitch";
        status.smallImageText = "Nintendo Switch";
        status.details = arg1;
        status.state = " Joue depuis : ";
        DiscStatus.Discord_UpdatePresence(status);
    }

    public static void SuperMarioMaker2(String arg1) {
        DiscordRPC DiscStatus = DiscordRPC.INSTANCE;
        String IdApp= "856176324480466984";
        String IdSteam = "";
        DiscordEventHandlers DiscHandler = new DiscordEventHandlers();
        DiscStatus.Discord_Initialize( IdApp, DiscHandler, true, IdSteam);
        DiscordRichPresence status = new DiscordRichPresence();
        status.startTimestamp = System.currentTimeMillis() / 1000;
        status.largeImageKey = "supermariomaker2";
        status.largeImageText = "Super Mario Maker 2";
        status.smallImageKey = "nintendoswitch";
        status.smallImageText = "Nintendo Switch";
        status.details = arg1;
        status.state = " Joue depuis : ";
        DiscStatus.Discord_UpdatePresence(status);
    }
    public static void NewSuperMarioBrosUDeluxe(String arg1) {
        DiscordRPC DiscStatus = DiscordRPC.INSTANCE;
        String IdApp= "856176735744819211";
        String IdSteam = "";
        DiscordEventHandlers DiscHandler = new DiscordEventHandlers();
        DiscStatus.Discord_Initialize( IdApp, DiscHandler, true, IdSteam);
        DiscordRichPresence status = new DiscordRichPresence();
        status.startTimestamp = System.currentTimeMillis() / 1000;
        status.largeImageKey = "newsupermariobrosudeluxe";
        status.largeImageText = "New Super Mario Bros. U Deluxe";
        status.smallImageKey = "nintendoswitch";
        status.smallImageText = "Nintendo Switch";
        status.details = arg1;
        status.state = " Joue depuis : ";
        DiscStatus.Discord_UpdatePresence(status);
    }
    public static void MarioKart8Deluxe(String arg1) {
        DiscordRPC DiscStatus = DiscordRPC.INSTANCE;
        String IdApp= "856177021901471764";
        String IdSteam = "";
        DiscordEventHandlers DiscHandler = new DiscordEventHandlers();
        DiscStatus.Discord_Initialize( IdApp, DiscHandler, true, IdSteam);
        DiscordRichPresence status = new DiscordRichPresence();
        status.startTimestamp = System.currentTimeMillis() / 1000;
        status.largeImageKey = "mariokart8deluxe";
        status.largeImageText = "Mario Kart 8 Deluxe";
        status.smallImageKey = "nintendoswitch";
        status.smallImageText = "Nintendo Switch";
        status.details = arg1;
        status.partyId = "ae488379-351d-4a4f-ad32-2b9b01c91657";
        status.joinSecret = "MTI4NzM0OjFpMmhuZToxMjMxMjM= ";
        status.state = " Joue depuis : ";
        DiscStatus.Discord_UpdatePresence(status);


    }

}
