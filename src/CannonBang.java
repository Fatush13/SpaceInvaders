import java.awt.*;

public class CannonBang extends Game {

    int x, y, count, duration, visibility;

    void enable() {
        this.x = cannon.getX() - 1;
        this.y = cannon.getY() - 1;
        count = 5;
        duration = Constants.DURATION;
        visibility = 0;
    }

    void show() {
        if (duration == 0) {
            duration = Constants.DURATION;
            visibility = 1 - visibility;
            if (count > 0 && !gameOver) count--;
        } else
            duration--;
    }

    boolean isBang() {
        return count != 0;
    }

    void paint(Graphics g) {
        g.setColor(Color.GREEN);
        if (count > 0)
            for (int i = 0; i < Constants.BANG[visibility].length; i++)
                for (int j = 0; j < Constants.BANG[visibility][i].length; j++)
                    if (Constants.BANG[visibility][i][j] == 1)
                        g.fillRect(j * Constants.BLOCK_SIZE + x, i * Constants.BLOCK_SIZE + y, Constants.BLOCK_SIZE, Constants.BLOCK_SIZE);
    }
}
