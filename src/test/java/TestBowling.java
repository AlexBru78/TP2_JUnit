import Bowling.Bowling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBowling {
    Bowling game = new Bowling();
    int final_score = 0;
    @Test
    public void TestGame(){
        final_score += game.bad_move(5, 4);
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(9, 0);
        final_score += game.move_spare(9,3);
        final_score += game.bad_move(3, 6);
        final_score += game.move_spare(5,10);
        final_score += game.final_frame_strike(10,10);
        Assertions.assertEquals(220,final_score);

    }
    @Test
    public void StrikeGame(){
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(10, 10);
        final_score += game.move_strike(10, 10);
        final_score += game.final_frame_strike(10,10);
        Assertions.assertEquals(300,final_score);
    }
}
