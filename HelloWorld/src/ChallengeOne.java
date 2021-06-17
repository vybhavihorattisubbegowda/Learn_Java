public class ChallengeOne {
    public static void main(String[] args) {
        int position;
        position = calculateHighScorePosition(1500);
        displayHighScorePosition("Vybhavi",position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Tim",position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Bob",position);


    }

    public static void displayHighScorePosition(String name,int position){
        System.out.println(name+" managed to get into position "
                +position+" on the high score table. ");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score > 1000) {
            position = 1;
        } else if (score > 500 && score < 1000) {
            position = 2;
        } else if (score > 100 && score < 500) {
            position = 3;
        }
        return position;
    }
}
