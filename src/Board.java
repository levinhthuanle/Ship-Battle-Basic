public class Board {
    private int size;
    private int[][] stt = new int[20][20];
    // 0: Does not open yet
    // 1: Select correct
    // 2: Select uncorrected
    Board(){
        size = 0;
        for (int i = 0;i < 20; i++)
            for (int j = 0;j < 20; j++)
                stt[i][j] = 0;
    }

    public void drawBoard(){
        for (int i = 1;i <= size; i++){
            for (int j = 1;j <= size; j++){
                if (stt[i][j] == 0)
                    System.out.print("0 ");
                else if (stt[i][j] == 1)
                    System.out.print("B ");
                else
                    System.out.print("x ");
            }

            System.out.println(" ");
        }
    }
}
