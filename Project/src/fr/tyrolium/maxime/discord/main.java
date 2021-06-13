package fr.tyrolium.maxime.discord;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.util.WindowMover;

import javax.swing.*;

public class main extends JFrame {

    private static main instance;


    public static void main(String[] args)	{
        Swinger.setSystemLookNFeel();
        Swinger.setResourcePath("/fr/tyrolium/maxime/launcher/ressource/");
        instance = new main();
        System.out.println("test");
    }


    public main(){
        this.setTitle("Tyrolium Launcher");
        this.setSize(975, 625);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setUndecorated(true);
        WindowMover mover = new WindowMover(this);
        this.addMouseListener(mover);
        this.addMouseMotionListener(mover);
        this.setVisible(true);
    }





}
