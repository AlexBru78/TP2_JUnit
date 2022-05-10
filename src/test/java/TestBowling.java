import Bowling.Bowling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Bowling.Tour;
import java.util.ArrayList;
import java.util.List;

public class TestBowling {
    List<Tour> tab_score = new ArrayList<Tour>();
    Bowling game = new Bowling(0, tab_score);

    @Test
    public void TestRandomGameStrikeLast() {
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
    public void TestGameAllStrike() {
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
        game.final_frame_strike(10, 10);
        game.add_bonus_score(tab_score);
        Assertions.assertEquals(300, game.final_score);
        System.out.println(tab_score);
    }

    @Test
    public void TestGameAllBad() {
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

    @Test
    public void TestGameSpareLast() {
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
        game.final_frame_spare(1);
        Assertions.assertEquals(29, game.final_score);
    }

    @Test
    public void TestGameAllSpare() {
        game.move_spare(9);
        game.move_spare(9);
        game.move_spare(9);
        game.move_spare(9);
        game.move_spare(9);
        game.move_spare(9);
        game.move_spare(9);
        game.move_spare(9);
        game.move_spare(9);
        game.final_frame_spare(9);
        game.add_bonus_score(tab_score);
        Assertions.assertEquals(190, game.final_score);
    }
}
