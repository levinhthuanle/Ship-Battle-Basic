public class Computer extends Player{
    Computer(){

    }
    public Position getRandomPos(int a, int b){
        int randomX = (int)(Math.random() * (b - a + 1)) + a;
        int randomY = (int)(Math.random() * (b - a + 1)) + a;

        return new Position(randomX, randomY);
    }
}
