package Bowling;

public class Tour {
    public int first_move;
    public int second_move;
    public boolean isStrike;
    public boolean isSpare;

    public Tour(int first_move, int second_move, boolean isStrike, boolean isSpare) {
        this.first_move = first_move;
        this.second_move = second_move;
        this.isStrike = isStrike;
        this.isSpare = isSpare;
    }
}
