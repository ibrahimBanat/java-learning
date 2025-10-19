public class Hello {

    public static void main (String[] args) {
        System.out.println("Hello, Ibrahim");

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not alien!");
            System.out.println("And i am scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;

        if (topScore > secondTopScore && topScore < 100) {
            System.out.print("Greater than second top score and less than 100!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true!");
        }
        int newValue = 50;

    }
}
