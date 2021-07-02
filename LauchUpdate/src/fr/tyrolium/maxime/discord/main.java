package fr.tyrolium.maxime.discord;

import fr.theshark34.openlauncherlib.bootstrap.Bootstrap;
import fr.theshark34.openlauncherlib.bootstrap.LauncherClasspath;
import fr.theshark34.openlauncherlib.bootstrap.LauncherInfos;
import fr.theshark34.openlauncherlib.util.ErrorUtil;
import fr.theshark34.openlauncherlib.util.GameDir;
import fr.theshark34.openlauncherlib.util.SplashScreen;
import fr.theshark34.supdate.BarAPI;
import fr.theshark34.supdate.SUpdate;
import fr.theshark34.swinger.colored.SColoredBar;

import static fr.theshark34.swinger.Swinger.*;

import java.io.File;
import java.io.IOException;

public class main {

    private static SplashScreen splash;
    private static SColoredBar bar;
    private static Thread barThread;

    private static final LauncherInfos TY_B_INFOS = new LauncherInfos("TyroDiscordRCPSwitch", "fr.tyrolium.maxime.discord.main");
    private static final File TY_DIR = GameDir.createGameDir("TyroDiscordRCPSwitch");
    private static final LauncherClasspath TY_B_CP = new LauncherClasspath(new File(TY_DIR, "Files/TyroDiscordRCPSwitch.jar"), new File(TY_DIR, "Files/Libs/"));

    private static ErrorUtil errorUtil = new ErrorUtil(new File(TY_DIR, ("Files/crashes")));

    public static void main(String[] args) {

        setResourcePath("/fr/tyrolium/maxime/discord/assets");
        displaySplash();
        try {
            doUpdate();
        } catch (Exception e) {
            errorUtil.catchError(e, "Impossible de mettre a jour le logiciel !");
            barThread.interrupt();
        }
        try {
            launchLauncher();
        } catch (IOException e) {
            errorUtil.catchError(e, "Impossible de lancer le logiciel !");
            barThread.interrupt();
        }
    }

    private static void displaySplash() {

        splash = new SplashScreen("icone", getResource("splash.png"));

        bar = new SColoredBar(getTransparentWhite(100), getTransparentWhite(175));
        bar.setBounds(0, 490, 350, 20);
        splash.add(bar);

        splash.setBackground(TRANSPARENT);
        splash.getContentPane().setBackground(TRANSPARENT);
        splash.setVisible(true);
    }

    private static void doUpdate() throws Exception{

        SUpdate su = new SUpdate("https://tyrolium.fr/s-update-discord", new File(TY_DIR, "Files"));

        barThread = new Thread() {
            @Override
            public void run() {
                while(!this.isInterrupted()) {
                    bar.setValue((int) (BarAPI.getNumberOfTotalDownloadedBytes() / 1000));
                    bar.setMaximum((int) (BarAPI.getNumberOfTotalBytesToDownload() / 1000));
                }
            }
        };
        barThread.start();

        su.start();
        barThread.interrupt();

    }

    private static void launchLauncher() throws IOException{
        Bootstrap bootstrap = new Bootstrap(TY_B_CP, TY_B_INFOS);
        Process p = bootstrap.launch();

        splash.setVisible(false);

        try {
            p.waitFor();
        } catch (InterruptedException e) {
        }
        System.exit(0);
    }

}