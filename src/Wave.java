import java.awt.*;
import java.util.ArrayList;

public class Wave extends Constants {
    ArrayList<Invader> wave = new ArrayList<Invader>();
    int numFrames = 30;
    int countFrames = 0;
    int direction = RIGHT;
    boolean stepDown = false;
    int startX = 50;
    int startY = 60;

    Wave() {
        for (int y = 0; y < PATTERN.length; y++)
            for (int x = 0; x < PATTERN[y].length; x++)
                wave.add(new Invader(startX + x * BLOCK_SIZE * 16 + PATTERN[y][x] * BLOCK_SIZE, startY + y * 16, PATTERN[y][x]));
    }

    void nextStep() {
        if (countFrames == numFrames) {
            if ((startX == 10) || (startX == 17 * MOVE_X + 10)) { // time to change direction
                if (!stepDown) {
                    direction = DOWN;
                } else {
                    direction = (startX == 10) ? RIGHT : LEFT;
                    stepDown = false;
                }
            }
            for (Invader invader : wave) { // wave moves and shots
                invader.travel(direction);
                if (Game.random.nextInt(10) == 9)
                    if (Game.bullets.getSize() < MAX_INV_BULLETS)
                        invader.shot();

            }
            if (direction == DOWN) {
                startY += MOVE_Y;
                stepDown = true;
            } else {
                startX += (direction == RIGHT) ? MOVE_X : -MOVE_X;
            }
            countFrames = 0;
        } else {
            countFrames++;
        }
        for (Invader invader : wave) // check hit alien
            if (invader.isHit()) {
                Game.score += (invader.getType() + 1) * 10;
                wave.remove(invader);
                numFrames = 10 + (int) (20f / 55f * wave.size()); // increase wave's speed
                if (countFrames > numFrames) countFrames = numFrames; // correct countFrames
                System.out.println(numFrames + ":" + countFrames);
                break;
            }
    }

    boolean isCleared() {

        return wave.size() == 0;

    }

    void paint(Graphics g) {
        for (Invader invader : wave) invader.paint(g);
    }
}

