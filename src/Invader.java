import java.awt.*;

public class Invader extends Constants {
    int x, y = 0;
           int type, animation = 0;
    int width, height = 8;

    Invader(int x, int y, int type) {
        this.x = x;
        this.y = y;
        this.type = type;
        width = INVADERS_TYPES[type][animation][8][0];
    }


    int getType() {
        return type;
    }

    void shot(){
        Game.bullets.add(x + width/2, y +height);
    }

    boolean isHit() {
        if (Game.bullet.isEnable())
            if ((Game.bullet.getX() >= x) && (Game.bullet.getX() <= x + width * BLOCK_SIZE))
                if (Game.bullet.getY() < y + height * BLOCK_SIZE) {
                    Game.bullet.disable();
                    return true;
                }
        return false;
    }

    void travel(int direction) {
        animation = 1 - animation;
        if (direction == RIGHT) x += MOVE_X;
        else if (direction == LEFT) x -= MOVE_X;
        else if (direction == DOWN) y += MOVE_Y;
    }

    void explode() {
        Game.explosion.enable(x, y -2);
    }

    void paint(Graphics g) {
        g.setColor(Color.WHITE);
        for (int col = 0; col < width; col++)
            for (int row = 0; row < height; row++)
                if (INVADERS_TYPES[type][animation][row][col] == 1)
                    g.fillRect(col * BLOCK_SIZE + x, row * BLOCK_SIZE + y, BLOCK_SIZE, BLOCK_SIZE);
    }
}
