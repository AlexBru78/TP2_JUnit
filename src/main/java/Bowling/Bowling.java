package Bowling;

import java.util.ArrayList;
import java.util.List;

public class Bowling {

    public int final_score;
    List<Tour> tab_score;

    public Bowling(int final_score, List<Tour> tab_score) {
        this.final_score = final_score;
        this.tab_score = tab_score;
    }

    public void move_spare(int ball1) {
        /*@param :
        ball1 : score of the first ball
        bonus_ball : bonus score of the spare
        @return : sum of the spare score and bonus score of the next ball
        */
        int score = ball1 + (10 - ball1);
        tab_score.add(new Tour(ball1, 10 - ball1, false, true));
        final_score += score;
    }

    public void move_strike() {
        /*@param :
        first_bonus_ball : score of the first bonus ball
        second_bonus_ball : score of the second bonus ball
        @return : sum of the strike score and two bonus ball of the next two ball
        */
        int score = 10;
        tab_score.add(new Tour(10, 0, true, false));
        final_score += score;
    }

    public void bad_move(int ball1, int ball2) {
        /*@param :
        ball1 : score of the first ball
        ball2 : score of the second ball
        @return : sum of the two balls
        */
        int score = ball1 + ball2;
        tab_score.add(new Tour(ball1, ball2, false, false));
        final_score += score;
    }

    public void final_frame_strike(int ball1_bonus, int ball2_bonus) {
        /*@param :
        ball1_bonus : score of the first bonus ball
        ball2_bonus : score of the second bonus ball
        @return : sum of the two bonus balls and the strike of the last frame
        */
        int score = 0;
        score += ball1_bonus + ball2_bonus;
        final_score += score;
    }

    public void final_frame_spare(int ball_bonus) {
        /*@param :
        ball_bonus : score of the first ball
        @return : sum of the bonus ball and the spare of the last frame
        */
        int score = 10;
        score += ball_bonus;
        final_score += score;
    }

    public void final_frame_bad(int score) {
        /*@param :
        score : score of the ball
        @return : score of the ball
        */
        final_score += score;
    }

    public void add_bonus_score(List<Tour> tab_score) {
        int bonus = 0;
        for (int i = 0; i < tab_score.size(); i++) {
            if (tab_score.get(i).isStrike) {
                bonus += get_strike_bonus(i);
            }
            if (tab_score.get(i).isSpare) {
                bonus += get_spare_bonus(i);
            }
        }
        final_score += bonus;
    }

    public int get_strike_bonus(int i) {
        int bonus = 0;
        if (i < tab_score.size() - 2) {
            if (tab_score.get(i + 1).isStrike) {
                bonus += tab_score.get(i + 1).first_move;
                bonus += tab_score.get(i + 2).first_move;
            } else {
                bonus += tab_score.get(i + 1).first_move;
                bonus += tab_score.get(i + 1).second_move;
            }
        } else if (i < tab_score.size() - 1) {
            bonus += tab_score.get(i + 1).first_move;
        }

        return bonus;
    }

    public int get_spare_bonus(int i) {
        if (i < tab_score.size() - 1) {
            return tab_score.get(i + 1).first_move;
        }
        return 0;
    }
}
