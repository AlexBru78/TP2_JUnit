package Bowling;

import java.util.ArrayList;
import java.util.List;

public class Bowling {

    public int final_score; // final score of the game
    List<Tour> tab_score; // List of score composed of two moves

    public Bowling(int final_score, List<Tour> tab_score) {
        this.final_score = final_score;
        this.tab_score = tab_score;
    }

    public void move_spare(int ball1) {
        /*@param :
        ball1 : score of the first ball
        This function adds the spare score to the final score
        */
        int score = ball1 + (10 - ball1);
        tab_score.add(new Tour(ball1, 10 - ball1));
        final_score += score;
    }

    public void move_strike() {
        /*
        This function adds the strike score to the final score
        */
        int score = 10;
        tab_score.add(new Tour(10, 0));
        final_score += score;
    }

    public void bad_move(int ball1, int ball2) {
        /*@param :
        ball1 : score of the first ball
        ball2 : score of the second ball
        This function adds the bad score to the final score (a bad score is a score that is under 10 with two balls)
        */
        int score = ball1 + ball2;
        tab_score.add(new Tour(ball1, ball2));
        final_score += score;
    }

    public void final_frame_strike(int ball1_bonus, int ball2_bonus) {
        /*@param :
        ball1_bonus : score of the first bonus ball
        ball2_bonus : score of the second bonus ball
        This function adds the strike score to the final score and the bonus score defines in parameters
        */
        int score = 0;
        score += ball1_bonus + ball2_bonus;
        tab_score.add(new Tour(ball1_bonus, ball2_bonus));
        final_score += score;
    }

    public void final_frame_spare(int ball_bonus) {
        /*@param :
        ball_bonus : score of the bonus ball
        This function adds the spare score to the final score and the bonus score defines in parameters
        */
        int score = 10;
        score += ball_bonus;
        tab_score.add(new Tour(ball_bonus, 0));
        final_score += score;
    }

    public void final_frame_bad(int score) {
        /*@param :
        score : score of the ball
        This function adds the bad score to the final score with no bonus
        */
        final_score += score;
    }

    public void add_bonus_score(List<Tour> tab_score) {
        /*@param :
        tab_score : list of all scores of type Tour, each Tour is composed of two moves
        This function adds all the bonus score of the game to the final score
        */
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
        /*@param :
        i : index in the list
        This function allows you to obtain the bonus for strikes
        */
        int bonus = 0;
        if (i < tab_score.size() - 2) {
            if (tab_score.get(i + 1).isStrike) {
                bonus += tab_score.get(i + 1).first_move;
                bonus += tab_score.get(i + 2).first_move;
            } else {
                bonus += tab_score.get(i + 1).first_move;
                bonus += tab_score.get(i + 1).second_move;
            }
        } else if (i < tab_score.size() - 2) {
            bonus += tab_score.get(i + 1).first_move;
        }

        return bonus;
    }

    public int get_spare_bonus(int i) {
        /*@param :
        i : index in the list
        This function allows you to obtain the bonus for spares
        */
        if (i < tab_score.size() - 1) {
            return tab_score.get(i + 1).first_move;
        }
        return 0;
    }
}
