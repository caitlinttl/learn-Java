package try_game;

public class Main {

    public static void main(String[] args) {

        VideoGame videoGame = new VideoGame();
        PhoneGame phoneGame = new PhoneGame();
        videoGame.setScore(20);
        phoneGame.setScore(50);
        videoGame.displayInfo();
        phoneGame.displayInfo();        
    }
    
}
