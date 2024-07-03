import java.util.Objects;
import java.util.Scanner;

public class Game {
    private volatile Boolean isRunning;
    private Board board = new Board();

    private Player user = new Player();

    private Computer computer = new Computer();
    public Scanner sc = new Scanner(System.in);

    Game(){
        isRunning = Boolean.TRUE;
    }

    public void initialSetup(){
        System.out.print("Enter board size: ");
        int temp = sc.nextInt();
        board.setSize(temp);


    }

    void startGame(){
        System.out.println("Ship game");


        while (isRunning) {
            Thread.onSpinWait();

            String x = sc.next();
            if (Objects.equals(x, "q")){
                isRunning = Boolean.FALSE;
            }

            board.drawBoard();
        }

        System.out.println("Game is over");
    }
}
