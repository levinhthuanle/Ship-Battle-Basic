public class Board {
    private int size;
    private int[][] stt = new int[20][20];
    // 0: Does not open yet
    // 1: Select correct
    // 2: Select uncorrected
    // 3: Player select
    Board(){
        size = 0;
        for (int i = 0;i < 20; i++)
            for (int j = 0;j < 20; j++)
                stt[i][j] = 0;
    }

    public void drawBoard(Boolean isDisplayed){

        if (!isDisplayed) {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    if (stt[i][j] == 1)
                        System.out.print("B ");
                    else if (stt[i][j] == 2)
                        System.out.print("x ");
                    else
                        System.out.print("0 ");
                }

                System.out.println(" ");
            }
        }
        else {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    if (stt[i][j] == 3)
                        System.out.print("* ");
                    else
                        System.out.print("0 ");
                }

                System.out.println(" ");
            }
        }
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[][] getStt() {
        return stt;
    }

    public void setStt(int[][] stt) {
        this.stt = stt;
    }

    public void setPosition(Position pos, int status){
        stt[pos.x][pos.y] = status;
    }
}
