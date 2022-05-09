import Bowling.Bowling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Bowling.Tour;
import java.util.ArrayList;
import java.util.List;

public class TestBowling {
    List<Tour> tab_score = new ArrayList<Tour>();
    Bowling game = new Bowling(0, tab_score);
/*
    @Test
    public void TestRandomGame1() {
        game.bad_move(5, 4);
        game.move_strike(10, 10);
        game.move_strike(10, 10);
        game.move_strike(10, 10);
        game.move_strike(10, 9);
        game.move_strike(9, 1);
        game.move_spare(9, 3);
        game.bad_move(3, 6);
        game.move_spare(5, 10);
        game.final_frame_strike(10, 10);
        Assertions.assertEquals(220, game.final_score);
        System.out.println(tab_score);
    }
*/
    @Test
    public void TestRandomGame3() {
        game.bad_move(5, 4);
        game.move_strike();
        game.move_strike();
        game.move_strike();
        game.move_strike();
        game.move_strike();
        game.move_spare(9);
        game.bad_move(3, 6);
        game.move_spare(5);
        game.move_strike();
        game.add_bonus_score(tab_score);
        game.final_frame_strike(10, 10);
        Assertions.assertEquals(220, game.final_score);
        System.out.println(tab_score);
    }
    @Test
    public void TestRandomGame1() {
        game.move_strike();
        game.move_strike();
        game.move_strike();
        game.move_strike();
        game.move_strike();
        game.move_strike();
        game.move_strike();
        game.move_strike();
        game.move_strike();
        game.move_strike();
        game.add_bonus_score(tab_score);
        game.final_frame_strike(10, 10);
        Assertions.assertEquals(300, game.final_score);
        System.out.println(tab_score);
    }

    @Test
    public void TestRandomGame2() {
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.add_bonus_score(tab_score);
        game.final_frame_bad(2);
        Assertions.assertEquals(20, game.final_score);
    }
/*
    @Test
    public void TestRandomGame2() {
        game.bad_move(3, 5);
        game.move_spare(3, 5);
        game.bad_move(5, 4);
        game.move_spare(6, 8);
        game.move_spare(8, 4);
        game.bad_move(4, 2);
        game.bad_move(5, 3);
        game.bad_move(5, 2);
        game.bad_move(5, 1);
        game.final_frame_spare(5);
        Assertions.assertEquals(106, game.final_score);

    }


    @Test
    public void StrikeGame() {
        game.move_strike(10, 10);
        game.move_strike(10, 10);
        game.move_strike(10, 10);
        game.move_strike(10, 10);
        game.move_strike(10, 10);
        game.move_strike(10, 10);
        game.move_strike(10, 10);
        game.move_strike(10, 10);
        game.move_strike(10, 10);
        game.final_frame_strike(10, 10);
        Assertions.assertEquals(300, game.final_score);
    }

    @Test
    public void BadGame() {
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.bad_move(1, 1);
        game.final_frame_bad(2);
        Assertions.assertEquals(20, game.final_score);
    }
*/
}
