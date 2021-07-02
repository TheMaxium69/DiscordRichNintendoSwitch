package fr.tyrolium.maxime.discord;

import fr.theshark34.swinger.*;
import fr.theshark34.swinger.util.*;
import javax.swing.*;

public class main extends JFrame {

    private static main instance;
    public panel panel;

    public static void main(String[] args)	{
        Swinger.setSystemLookNFeel();
        Swinger.setResourcePath("/fr/tyrolium/maxime/discord/assets/");
        instance = new main();
        System.out.println("start");
    }


    public main(){
        this.setTitle("DiscordRishSwitch");
        this.setIconImage(Swinger.getResource("icone.png"));
        this.setSize(975, 625);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        this.setContentPane(panel = new panel());
        WindowMover mover = new WindowMover(this);
        this.addMouseListener(mover);
        this.addMouseMotionListener(mover);
        this.setVisible(true);
    }


    public static main getInstance()	{
        return instance;
    }


}
