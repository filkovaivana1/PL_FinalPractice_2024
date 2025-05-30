import java.util.Random;

public class GuessingGame1 {
    public static void main(String[] args) {
//        Create an instance of Random
        Random random = new Random();

//        Generate a random score between 0 and 100 inclusive
        int score = random.nextInt(101);

//        Display the generate score (optional for debugging)
        System.out.println("Generated score: " + score);

//        Use if-else to determine pass or fail
        if (score >= 60) {
            System.out.println("You have passed the exam!");
        } else {
            System.out.println("You have failed the exam.");
        }


    }
}