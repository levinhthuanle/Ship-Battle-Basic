import java.util.Objects;
import java.util.Scanner;

public class Game {
    private volatile Boolean isRunning;
    private Player user = new Player();
    private Computer computer = new Computer();
    public Scanner sc = new Scanner(System.in);

    Game(){
        isRunning = Boolean.TRUE;
    }

    public void enterBoatPos(){
        System.out.println("Enter the location & direction of 3 ships in pairs: ");
        for (int i = 1;i <= 3; i++){
            System.out.print("Enter the " + String.valueOf(i) + " location boat: ");

            int x, y;
            String direction = "";

            x = sc.nextInt();
            y = sc.nextInt();
            direction = sc.nextLine();

            System.out.println("Direction: " + direction);
            if (Objects.equals(direction, " x")){
                Position pos = new Position(x, y);
                user.getBoard().setPosition(pos, 3);
                pos.increaseX();
                user.getBoard().setPosition(pos, 3);
                pos.increaseX();
                user.getBoard().setPosition(pos, 3);
            }
            else if (Objects.equals(direction, " y")){
                Position pos = new Position(x, y);
                user.getBoard().setPosition(pos, 3);
                pos.increaseY();
                user.getBoard().setPosition(pos, 3);
                pos.increaseY();
                user.getBoard().setPosition(pos, 3);
            }


            user.getBoard().drawBoard(Boolean.TRUE);
        }
    }
    public void initialSetup(){
        System.out.print("Enter board size: ");

        int temp = sc.nextInt();
        user.getBoard().setSize(temp);
        computer.getBoard().setSize(temp);

        System.out.println("Initial board: ");
        user.getBoard().drawBoard(Boolean.TRUE);

        enterBoatPos();

    }

    void startGame(){
        System.out.println("Ship game");
        initialSetup();

        while (isRunning) {
            Thread.onSpinWait();

            String x = sc.next();
            if (Objects.equals(x, "q")){
                isRunning = Boolean.FALSE;
            }

            user.getBoard().drawBoard(Boolean.FALSE);
            computer.getBoard().drawBoard(Boolean.FALSE);

        }

        System.out.println("Game is over");
    }
}
