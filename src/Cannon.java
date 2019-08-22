import java.awt.*;

public class Cannon extends Constants {
    int x, y, direction;

    public Cannon() {
        x = 10;
        y = PLATFORM - 26;
    }

    void move() {
        if (direction == LEFT && x > 10) x -= CANNON_DX;
        if (direction == RIGHT && x < FIELD_WIDTH - CANNON_WIDTH - 12) x += CANNON_DX;
    }

    void setDirection(int direction) {
        this.direction = direction;
    }

    void shot(){
        Game.bullet.launch(x, y);
    }


    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    int getWidth() {
        return CANNON_WIDTH;
    }

    void paint(Graphics g) {
        //  if(!shoot.isShot()){
        g.setColor(Color.GREEN);
        g.fillRect(x, y + CANNON_HEIGHT / 2, CANNON_WIDTH, CANNON_HEIGHT / 2);
        g.fillRect(x + 2, y + CANNON_HEIGHT / 2 - 2, CANNON_WIDTH - 4, CANNON_HEIGHT / 2);
        g.fillRect(x + 10, y + 2, CANNON_WIDTH - 20, CANNON_HEIGHT / 2);
        g.fillRect(x + 12, y, 2, 2);
        //  }
    }
}
