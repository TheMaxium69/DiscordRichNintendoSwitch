package fr.tyrolium.maxime.discord;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.colored.SColoredButton;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;
import fr.theshark34.swinger.textured.STexturedButton;

import javax.swing.*;
import javax.swing.plaf.synth.SynthButtonUI;
import java.awt.*;

import static fr.theshark34.swinger.Swinger.colorImage;
import static fr.theshark34.swinger.Swinger.drawFullsizedImage;

public class panel extends JPanel implements SwingerEventListener {

    private Image background = Swinger.getResource("background.png");
    private STexturedButton quitBtn = new STexturedButton(Swinger.getResource("quit.png"));
    private STexturedButton hideBtn = new STexturedButton(Swinger.getResource("hide.png"));
    private STexturedButton test = new STexturedButton(Swinger.getResource("hide.png"));

    public panel() {
        this.setLayout(null);


        test.setBounds(142, 290, 206, 74);
        test.addEventListener(this);
        this.add(test);

        quitBtn.setBounds(920, 7, 45, 45);
        quitBtn.addEventListener(this);
        this.add(quitBtn);

        hideBtn.setBounds(867, 7, 45, 45);
        hideBtn.addEventListener(this);
        this.add(hideBtn);
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        drawFullsizedImage(graphics, this, background);
    }

    @Override
    public void onEvent(SwingerEvent e) {

        if (e.getSource() == test){
            System.out.println("lance discord");
            games.SuperSmashBrosUltimate();
        }






        if(e.getSource() == quitBtn){
            System.exit(0);
        } else if(e.getSource() == hideBtn){
            main.getInstance().setState(JFrame.ICONIFIED);
        }
    }

}
