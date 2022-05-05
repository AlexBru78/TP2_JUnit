package Bowling;

public class Bowling {

    public int final_score;

    public Bowling(int final_score) {
        this.final_score = final_score;
    }

    public void move_spare(int ball1, int bonus_ball) {
        /*@param :
        ball1 : score of the first ball
        bonus_ball : bonus score of the spare
        @return : sum of the spare score and bonus score of the next ball
        */
        int score = ball1 + (10 - ball1);
        score += bonus_ball;
        final_score += score;
    }

    public void move_strike(int first_bonus_ball, int second_bonus_ball) {
        /*@param :
        first_bonus_ball : score of the first bonus ball
        second_bonus_ball : score of the second bonus ball
        @return : sum of the strike score and two bonus ball of the next two ball
        */
        int score = 10;
        score += first_bonus_ball + second_bonus_ball;
        final_score += score;
    }

    public void bad_move(int ball1, int ball2) {
        /*@param :
        ball1 : score of the first ball
        ball2 : score of the second ball
        @return : sum of the two balls
        */
        int score = ball1 + ball2;
        final_score += score;
    }

    public void final_frame_strike(int ball1_bonus, int ball2_bonus) {
        /*@param :
        ball1_bonus : score of the first bonus ball
        ball2_bonus : score of the second bonus ball
        @return : sum of the two bonus balls and the strike of the last frame
        */
        int score = 10;
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
}
