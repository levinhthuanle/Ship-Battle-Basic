import java.util.Objects;
import java.util.Scanner;

public class Game {
    private volatile Boolean isRunning;
    public Scanner sc = new Scanner(System.in);

    Game(){
        isRunning = Boolean.FALSE;
    }

    void startGame(){
        System.out.println("Ship game");
        isRunning = Boolean.TRUE;

        while (isRunning) {
            Thread.onSpinWait();


            String x = sc.next();

            if (Objects.equals(x, "q")){
                isRunning = Boolean.FALSE;
            }
        }

        System.out.println("Game is over");
    }
}
