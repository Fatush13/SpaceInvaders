import java.awt.*;
import java.util.ArrayList;

public class InvadersBullets extends Game {
     ArrayList<InvadersBullet> bullets = new ArrayList<>();

    void add(int x, int y) {
        bullets.add(new InvadersBullet(x, y));
    }

     void fly() {
        for (InvadersBullet bullet : bullets) bullet.fly();
        for (InvadersBullet bullet : bullets)
            if (bullet.offScreen()) {
                bullets.remove(bullet);
                break;
            }
        for (InvadersBullet bullet : bullets)
            if (bullet.hitCannon()) {
                bang.enable();
                lives--;
                cannon = new Cannon();
                gameOver = lives == 0;
                bullets.remove(bullet);
                break;
            }
    }

    int getSize() {
        return bullets.size();
    }

    void paint(Graphics g) {
        for (InvadersBullet bullet : bullets) bullet.paint(g);
    }
}
