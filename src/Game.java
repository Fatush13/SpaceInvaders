import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


public class Game extends Constants {

    private Canvas canvas = new Canvas();
    static Cannon cannon = new Cannon();
    static Bullet bullet = new Bullet();
    static Wave wave = new Wave();
    static Random random = new Random();
    static int score;
    static int lives = 3;
    static boolean gameOver;
    private static JFrame frame = new JFrame();
    static InvadersBullets bullets = new InvadersBullets();

    Game() {
        frame.setTitle(TITLE);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(START_LOCATION, START_LOCATION, FIELD_WIDTH + FIELD_DX, FIELD_HEIGHT + FIELD_DY);
        frame.setResizable(false);
        canvas.setBackground(Color.BLACK);
        frame.getContentPane().add(BorderLayout.CENTER, canvas);
        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == LEFT) || (e.getKeyCode() == RIGHT))
                    cannon.setDirection(e.getKeyCode());
                if (e.getKeyCode() == FIRE)
                    cannon.shot();
            }

            public void keyReleased(KeyEvent e) {
                if ((e.getKeyCode() == LEFT) || (e.getKeyCode() == RIGHT))
                    cannon.setDirection(0);
            }
        });
        frame.setVisible(true);
    }

    void go() {

        while (true) {
            try {
                Thread.sleep(ANIMATION_DELAY);
            } catch (Exception e) {
                e.printStackTrace();
            }
            canvas.repaint();
            cannon.move();
            bullet.fly();
            wave.nextStep();
            bullets.fly();
            if (wave.isCleared()) {
                wave = new Wave();
                lives++;
            }
        }
    }

    static void paintPlatformAndText(Graphics g) {
        g.setColor(Color.white);
        for (int y = 0; y < SCORE.length; y++) {
            for (int x = 0; x < SCORE[y].length; x++)
                if (SCORE[y][x] == 1) g.fillRect(x * BLOCK_SIZE + 30, y * BLOCK_SIZE + 20, BLOCK_SIZE, BLOCK_SIZE);
            for (int i = 0; i < LIVES[y].length; i++)
                if (LIVES[y][i] == 1) g.fillRect(i * BLOCK_SIZE + 320, y * BLOCK_SIZE + 20, BLOCK_SIZE, BLOCK_SIZE);
        }
        if (gameOver)
            for (int y = 0; y < GAME_OVER.length; y++)
                for (int x = 0; x < GAME_OVER[y].length; x++)
                    if (GAME_OVER[y][x] == 1)
                        g.fillRect(x * BLOCK_SIZE + 170, y * BLOCK_SIZE + 250, BLOCK_SIZE, BLOCK_SIZE);
        g.setColor(Color.green);
        g.fillRect(10, PLATFORM, FIELD_WIDTH - 20, 2);
    }

    static void paintNumbers(Graphics g, int number, int x, int y) {
        String numStr = Integer.toString(number);
        g.setColor(Color.green);
        for (int p = 0; p < numStr.length(); p++) {
            int n = (int) numStr.charAt(p) - 48;
            for (int i = 0; i < 5; i++)
                for (int j = 0; j < 6; j++)
                    if (NUMBERS[n][i][j] == 1)
                        g.fillRect(x + j * BLOCK_SIZE + p * 14, y + i * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
        }
    }
}
