import java.awt.*;

public class Bullet extends Constants {
    int x, y;
    boolean onScreen;

    void launch(int x, int y) {
        if (!onScreen) {
            onScreen = true;
            this.x = x + 12;
            this.y = y - CANNON_HEIGHT;
        }
    }

    void fly() {
        if (onScreen) {
            y -= BULLET_DY;
            onScreen = (y + BULLET_DY) > 0;
        }
    }

    void disable() {
        onScreen = false;
    }

    boolean isEnable() {
        return onScreen;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void paint(Graphics g) {
        g.setColor(Color.GREEN);
        if (onScreen) g.fillRect(x, y, BULLET_WIDTH, BULLET_HEIGHT);
    }
}
