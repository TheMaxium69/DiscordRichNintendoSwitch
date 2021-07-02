package fr.tyrolium.maxime.discord;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;
import fr.theshark34.swinger.textured.STexturedButton;
import javax.swing.*;
import java.awt.*;
import static fr.theshark34.swinger.Swinger.drawFullsizedImage;

public class panel extends JPanel implements SwingerEventListener {

    private Image background = Swinger.getResource("background.png");
    private STexturedButton quitBtn = new STexturedButton(Swinger.getResource("quit.png"));
    private STexturedButton hideBtn = new STexturedButton(Swinger.getResource("hide.png"));
    public JTextField usernameField = new JTextField();

    public STexturedButton SuperSmashBrosUltimate = new STexturedButton(Swinger.getResource("game/SuperSmashBrosUltimate.png"));
    public STexturedButton SuperMario3DAllStars = new STexturedButton(Swinger.getResource("game/SuperMario3DAllStars.png"));
    public STexturedButton SuperMario3DWorldPlusBowsersFury = new STexturedButton(Swinger.getResource("game/SuperMario3DWorldPlusBowsersFury.png"));
    public STexturedButton SuperMarioOdyssey = new STexturedButton(Swinger.getResource("game/SuperMarioOdyssey.png"));
    public STexturedButton SuperMarioMaker2 = new STexturedButton(Swinger.getResource("game/SuperMarioMaker2.png"));
    public STexturedButton NewSuperMarioBrosUDeluxe = new STexturedButton(Swinger.getResource("game/NewSuperMarioBrosUDeluxe.png"));
    public STexturedButton MarioKart8Deluxe = new STexturedButton(Swinger.getResource("game/MarioKart8Deluxe.png"));
    public STexturedButton TheLegendOfZeldaBreathOfTheWild = new STexturedButton(Swinger.getResource("game/TheLegendOfZeldaBreathOfTheWild.png"));
    public STexturedButton TheLegendOfZeldaLinksAwakening = new STexturedButton(Swinger.getResource("game/TheLegendOfZeldaLinksAwakening.png"));
    public STexturedButton TheLegendOfZeldaSkywardSwordHD = new STexturedButton(Swinger.getResource("game/TheLegendOfZeldaSkywardSwordHD.png"));
    public STexturedButton HyruleWarriorsLEreduFleau = new STexturedButton(Swinger.getResource("game/HyruleWarriorsLEreduFleau.png"));
    public STexturedButton DokiDokiLiteratureClubPlus = new STexturedButton(Swinger.getResource("game/DokiDokiLiteratureClubPlus.png"));

    public panel() {
        this.setLayout(null);
        quitBtn.setBounds(920, 7, 45, 45);
        quitBtn.addEventListener(this);
        this.add(quitBtn);
        hideBtn.setBounds(867, 7, 45, 45);
        hideBtn.addEventListener(this);
        this.add(hideBtn);
        usernameField.setForeground(Color.BLACK);
        usernameField.setCaretColor(Color.BLACK);
        usernameField.setFont(usernameField.getFont().deriveFont(20F));
        usernameField.setOpaque(true);
        usernameField.setBorder(null);
        usernameField.setBounds(57, 10, 300, 45);
        this.add(usernameField);

        SuperSmashBrosUltimate.setBounds(6, 75, 100, 100);
        SuperSmashBrosUltimate.addEventListener(this);
        this.add(SuperSmashBrosUltimate);

        SuperMario3DAllStars.setBounds(112, 75, 100, 100);
        SuperMario3DAllStars.addEventListener(this);
        this.add(SuperMario3DAllStars);

        SuperMario3DWorldPlusBowsersFury.setBounds(218, 75, 100, 100);
        SuperMario3DWorldPlusBowsersFury.addEventListener(this);
        this.add(SuperMario3DWorldPlusBowsersFury);

        SuperMarioOdyssey.setBounds(324, 75, 100, 100);
        SuperMarioOdyssey.addEventListener(this);
        this.add(SuperMarioOdyssey);

        SuperMarioMaker2.setBounds(430, 75, 100, 100);
        SuperMarioMaker2.addEventListener(this);
        this.add(SuperMarioMaker2);

        NewSuperMarioBrosUDeluxe.setBounds(536, 75, 100, 100);
        NewSuperMarioBrosUDeluxe.addEventListener(this);
        this.add(NewSuperMarioBrosUDeluxe);

        MarioKart8Deluxe.setBounds(642, 75, 100, 100);
        MarioKart8Deluxe.addEventListener(this);
        this.add(MarioKart8Deluxe);

        TheLegendOfZeldaBreathOfTheWild.setBounds(748, 75, 100, 100);
        TheLegendOfZeldaBreathOfTheWild.addEventListener(this);
        this.add(TheLegendOfZeldaBreathOfTheWild);

        TheLegendOfZeldaLinksAwakening.setBounds(854, 75, 100, 100);
        TheLegendOfZeldaLinksAwakening.addEventListener(this);
        this.add(TheLegendOfZeldaLinksAwakening);

        TheLegendOfZeldaSkywardSwordHD.setBounds(6, 181, 100, 100);
        TheLegendOfZeldaSkywardSwordHD.addEventListener(this);
        this.add(TheLegendOfZeldaSkywardSwordHD);

        HyruleWarriorsLEreduFleau.setBounds(112, 181, 100, 100);
        HyruleWarriorsLEreduFleau.addEventListener(this);
        this.add(HyruleWarriorsLEreduFleau);

        DokiDokiLiteratureClubPlus.setBounds(218, 181, 100, 100);
        DokiDokiLiteratureClubPlus.addEventListener(this);
        this.add(DokiDokiLiteratureClubPlus);

    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        drawFullsizedImage(graphics, this, background);
    }

    @Override
    public void onEvent(SwingerEvent e) {
        if(e.getSource() == quitBtn){
            System.exit(0);
        } else if(e.getSource() == hideBtn){
            main.getInstance().setState(JFrame.ICONIFIED);
        }

        String username = usernameField.getText();

        if (e.getSource() == SuperSmashBrosUltimate){
                games.SuperSmashBrosUltimate(username);
        }
        if (e.getSource() == SuperMario3DAllStars){
            games.SuperMario3DAllStars(username);
        }
        if (e.getSource() == SuperMario3DWorldPlusBowsersFury){
            games.SuperMario3DWorldPlusBowsersFury(username);
        }
        if (e.getSource() == SuperMarioOdyssey){
            games.SuperMarioOdyssey(username);
        }
        if (e.getSource() == SuperMarioMaker2){
            games.SuperMarioMaker2(username);
        }
        if (e.getSource() == NewSuperMarioBrosUDeluxe){
            games.NewSuperMarioBrosUDeluxe(username);
        }
        if (e.getSource() == MarioKart8Deluxe){
            games.MarioKart8Deluxe(username);
        }
        if (e.getSource() == TheLegendOfZeldaBreathOfTheWild){
            games.TheLegendOfZeldaBreathOfTheWild(username);
        }
        if (e.getSource() == TheLegendOfZeldaLinksAwakening){
            games.TheLegendOfZeldaLinksAwakening(username);
        }
        if (e.getSource() == TheLegendOfZeldaSkywardSwordHD){
            games.TheLegendOfZeldaSkywardSwordHD(username);
        }
        if (e.getSource() == HyruleWarriorsLEreduFleau){
            games.HyruleWarriorsLEreduFleau(username);
        }
        if (e.getSource() == DokiDokiLiteratureClubPlus){
            games.DokiDokiLiteratureClubPlus(username);
        }
    }

}
