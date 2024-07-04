public class Player {
    private int numPlayed;
    private String username;
    private Board board = new Board();
    Player() {
        numPlayed = 0;
    }

    public int getNumPlayed() {
        return numPlayed;
    }

    public void setNumPlayed(int numPlayed) {
        this.numPlayed = numPlayed;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
