import java.awt.*;

public class AlienExplosion extends Constants {
int x, y, duration;

void enable (int x, int y) {
    this.x = x;
    this.y = y;
    duration = 5;
}

void show(){
    if (duration >0) duration--;
}

void paint(Graphics g){
   g.setColor(Color.WHITE);
    if (duration >0)
        for( int i = 0; i<EXPLOSION.length; i++)
            for (int j = 0; j <EXPLOSION[i].length; j++){
            if (EXPLOSION[i][j] == 1) g.fillRect(j*BLOCK_SIZE +x, i*BLOCK_SIZE +y, BLOCK_SIZE, BLOCK_SIZE);}
}
}

