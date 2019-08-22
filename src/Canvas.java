import javax.swing.*;
import java.awt.*;


public class Canvas extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Game.paintPlatformAndText(g);
        Game.paintNumbers(g, Game.score, 110, 20);
        Game.paintNumbers(g, Game.lives, 390, 20);
        if(!Game.gameOver) {
            Game.cannon.paint(g);
            Game.wave.paint(g);
            Game.bullet.paint(g);
            Game.bullets.paint(g);
        }
    }
}
