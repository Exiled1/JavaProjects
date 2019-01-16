package ticTacToePlayer;

/**
 * @author rudyp
 */
public class TicTacToePlayer {
    private String name;
    private char exAndOh;
    private int numberOfWins;

    public String getName() {
        return name;
    }

    public char getExAndOh() {
        return exAndOh;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setGameState(String name, char exAndOh, int numberOfWins) {
        this.name = name;
        this.exAndOh = exAndOh;
        this.numberOfWins = numberOfWins;
    }

    public String toString() {
        return "Name: " + this.name +
                "X or O: " + this.exAndOh +
                "Number of Wins: " + this.numberOfWins;
    }
}
