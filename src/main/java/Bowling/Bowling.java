package Bowling;

public class Bowling {

    /*public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }*/
    /*https://www.bowlinggenius.com/*/

    public int move_spare(int ball1, int after_ball_score) {
        int score = ball1 + (10 - ball1);
        score += after_ball_score;
        return score;
    }

    public int move_strike(int first_bonus_ball, int second_bonus_ball) {
        int score = 10;
        score += first_bonus_ball + second_bonus_ball;
        return score;
    }

    public int bad_move(int ball1, int ball2) {
        int score = ball1 + ball2;
        return score;
    }

    public int final_frame_strike(int ball1_bonus, int ball2_bonus) {
        int score = 10;
        score += ball1_bonus + ball2_bonus;
        return score;
    }

    public int final_frame_spare(int ball_bonus) {
        int score = 10;
        score += ball_bonus;
        return score;
    }

    public int final_frame_bad(int score) {
        return score;
    }
}
