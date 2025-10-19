public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("ola", calculateHighScorePosition(1500));
        displayHighScorePosition("raseel", calculateHighScorePosition(999));
        displayHighScorePosition("aya", calculateHighScorePosition(499));
        displayHighScorePosition("natasha", calculateHighScorePosition(99));
        displayHighScorePosition("teeb", calculateHighScorePosition(-1000));

    }

    public static void displayHighScorePosition (String name, int score) {
        System.out.println(name + " managed to get into position " + score + " on the high score list");
    }

    public static int calculateHighScorePosition (int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        }
        else if (score >= 500) {
            position = 2;
        }
        else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
