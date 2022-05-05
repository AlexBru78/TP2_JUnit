import Bowling.Bowling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBowling {
    Bowling game = new Bowling();
    int final_score = 0;
    @Test
    public void TestRandomGame1(){
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
    public void TestRandomGame2(){
        final_score += game.bad_move(3, 5);
        final_score += game.move_spare(3,5);
        final_score += game.bad_move(5, 4);
        final_score += game.move_spare(6,8);
        final_score += game.move_spare(8,4);
        final_score += game.bad_move(4, 2);
        final_score += game.bad_move(5, 3);
        final_score += game.bad_move(5, 2);
        final_score += game.bad_move(5, 1);
        final_score += game.final_frame_spare(5);
        Assertions.assertEquals(106,final_score);

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

    @Test
    public void BadGame(){
        final_score += game.bad_move(1, 1);
        final_score += game.bad_move(1, 1);
        final_score += game.bad_move(1, 1);
        final_score += game.bad_move(1, 1);
        final_score += game.bad_move(1, 1);
        final_score += game.bad_move(1, 1);
        final_score += game.bad_move(1, 1);
        final_score += game.bad_move(1, 1);
        final_score += game.bad_move(1, 1);
        final_score += game.final_frame_bad(2);
        Assertions.assertEquals(20,final_score);
    }

}
