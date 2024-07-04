public class Position {
    public int x;
    public int y;

    Position(){
        x = 0;
        y = 0;
    }

    Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Boolean checkValid(int size){
        if (x <= 0 || x > size)
            return Boolean.FALSE;

        if (y <= 0 || y > size)
            return Boolean.FALSE;

        return Boolean.TRUE;
    }

    void increaseX(){
        this.x++;
    }

    void increaseY(){
        this.y++;
    }
}
