public class Constants {

    final static String TITLE = "SpaceInvaders";
    final static int BLOCK_SIZE = 2;
    final static int FIELD_WIDTH = 224 * BLOCK_SIZE;
    final static int FIELD_HEIGHT = 256 * BLOCK_SIZE;
    final static int FIELD_DX = 2;
    final static int FIELD_DY = 26;
    final static int START_LOCATION = 150;
    final static int MOVE_X = 5;
    final static int MOVE_Y = 15;
    final static int PLATFORM = FIELD_HEIGHT - 20;
    final static int LEFT = 37;
    final static int RIGHT = 39;
    final static int DOWN = 40;
    final static int FIRE = 32;
    final static int ANIMATION_DELAY = 20;
    final static int MAX_INV_BULLETS = 2;
    final static int CANNON_WIDTH = 26;
    final static int CANNON_HEIGHT = 16;
    final static int CANNON_DX = 5;
    final static int BULLET_WIDTH = 2;
    final static int BULLET_HEIGHT = 8;
    final static int BULLET_DY = 12;
    final static int IB_WIDTH = 6;
    final static int IB_HEIGHT = 10;
    final static int IB_SPEED = 6;

    final int[][] PATTERN = {
            {2,2,2,2,2,2,2,2,2,2,2}, {1,1,1,1,1,1,1,1,1,1,1}, {1,1,1,1,1,1,1,1,1,1,1}, {0,0,0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0,0,0}};

    final static int[][][][] INVADERS_TYPES = {
            {{{0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, // alien 1/1
                    {1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                    {0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0}, {0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0}, {12}},
                    {{0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, // alien 1/2
                            {1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0},
                            {0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}}},
            {{{0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, // alien 2/1
                    {0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0},
                    {1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0}, {0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0}, {11}},
                    {{0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, {1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0}, {1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0}, // alien 2/2
                            {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
                            {0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}}},
            {{{0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0}, // alien 3/1
                    {1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                    {0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0}, {1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0}, {8}},
                    {{0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0}, // alien 3/2
                            {1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0},
                            {1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}}}
    };

    final static int[][] SCORE = {
            {1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,1,1,1,1,1,1},
            {0,0,0,0,0,1,0,1,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,0,0,0,0,0,0,1,1,1,1,1,1}
    };

    final static int[][] LIVES = {
            {1,0,0,0,0,0,0,1,0,1,0,0,0,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
            {1,0,0,0,0,0,0,1,0,0,1,0,1,0,0,1,1,1,1,1,1,0,1,1,1,1,1,1},
            {1,0,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,0,1,0,0,0,1,0,0,0,1,1,1,1,1,1,0,1,1,1,1,1,1}
    };

    final static int[][] GAME_OVER = {
            {1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,0,1,0,0,0,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1},
            {1,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
            {1,0,0,0,0,1,0,1,1,1,1,1,1,0,1,0,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,1,0,0,1,0,1,0,0,1,1,1,1,1,1,0,1,0,0,0,0,0},
            {1,0,0,0,0,1,0,1,0,0,0,0,1,0,1,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
            {1,1,1,1,1,1,0,1,1,1,1,1,1,0,1,0,0,1,0,0,1,0,1,1,1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,0,0,0,1,0,0,0,1,1,1,1,1,1,0,1,0,0,0,0,0},
            {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
    };

    final static int[][][] NUMBERS = {
            {{1,1,1,1,1,1}, {1,0,0,0,0,1}, {1,0,0,0,0,1}, {1,0,0,0,0,1}, {1,1,1,1,1,1}}, // 0
            {{0,0,0,0,0,1}, {0,0,0,0,0,1}, {0,0,0,0,0,1}, {0,0,0,0,0,1}, {0,0,0,0,0,1}}, // 1
            {{1,1,1,1,1,1}, {0,0,0,0,0,1}, {1,1,1,1,1,1}, {1,0,0,0,0,0}, {1,1,1,1,1,1}}, // 2
            {{1,1,1,1,1,1}, {0,0,0,0,0,1}, {1,1,1,1,1,1}, {0,0,0,0,0,1}, {1,1,1,1,1,1}}, // 3
            {{1,0,0,0,0,1}, {1,0,0,0,0,1}, {1,1,1,1,1,1}, {0,0,0,0,0,1}, {0,0,0,0,0,1}}, // 4
            {{1,1,1,1,1,1}, {1,0,0,0,0,0}, {1,1,1,1,1,1}, {0,0,0,0,0,1}, {1,1,1,1,1,1}}, // 5
            {{1,1,1,1,1,1}, {1,0,0,0,0,0}, {1,1,1,1,1,1}, {1,0,0,0,0,1}, {1,1,1,1,1,1}}, // 6
            {{1,1,1,1,1,1}, {0,0,0,0,0,1}, {0,0,0,0,0,1}, {0,0,0,0,0,1}, {0,0,0,0,0,1}}, // 7
            {{1,1,1,1,1,1}, {1,0,0,0,0,1}, {1,1,1,1,1,1}, {1,0,0,0,0,1}, {1,1,1,1,1,1}}, // 8
            {{1,1,1,1,1,1}, {1,0,0,0,0,1}, {1,1,1,1,1,1}, {0,0,0,0,0,1}, {1,1,1,1,1,1}}  // 9
    };
}