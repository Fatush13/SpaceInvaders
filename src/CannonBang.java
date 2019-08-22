public class CannonBang extends Game {

    int x, y, count, duration, visibility;

    void enable(){
        this.x = cannon.getX() -1;
        this.y = cannon.getY() -1;
       count = 5;
        duration = Constants.DURATION;
        visibility =0;
    }

    void show() {
        if(duration ==0) {

        }
    }
}
