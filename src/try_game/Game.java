package try_game;

public class Game {

    private int score = 100;

    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }

    public void displayInfo() {
        System.out.printf("Type: general, Score: %s\n", score);
    }
    
}
