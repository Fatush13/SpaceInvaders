import java.awt.*;

public class InvadersBullet extends Constants {
    int x, y;

    InvadersBullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void fly() {
        y += IB_SPEED;
    }

    boolean offScreen() {
        return y + IB_HEIGHT > PLATFORM;
    }

    boolean hitCannon() {
        if (y + IB_HEIGHT > Game.cannon.getY())
            if (x >= Game.cannon.getX() && x <= Game.cannon.getX() + Game.cannon.getWidth())
                return true;
        return false;
    }

    void paint (Graphics g){
        g.setColor(Color.white);
        g.fillRect(x +2, y, 2, IB_HEIGHT);
        g.fillRect(x, y + IB_HEIGHT -4, IB_WIDTH, 2);
    }
}
