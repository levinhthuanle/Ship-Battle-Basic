public class Position {
    public int x;
    public int y;

    Position(){
        x = 0;
        y = 0;
    }

    public Boolean checkValid(int size){
        if (x <= 0 || x > size)
            return Boolean.FALSE;

        if (y <= 0 || y > size)
            return Boolean.FALSE;

        return Boolean.TRUE;
    }
}
