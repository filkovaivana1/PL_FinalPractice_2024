import java.util.Random;

public class GradingKnightsChallenge1 {
    public static void main(String[] args) {
//        Create an instance of Random
        Random random = new Random();

//        Generate a random score between 0 and 100 inclusive
        int score = random.nextInt(101);
        System.out.println("Generated score: " + score);

        String grade;
        String message;

//        Determine the grade using if-else statements
        if(score >= 90){
            grade = "A"; // when score >= 90
        } else if (score >= 80) {
            grade = "B"; // when score < 90 && score >= 80
        } else if (score >= 70) {
            grade = "C"; // when score < 80 && score >= 70
        } else if (score >= 60) {
            grade = "D"; // when score < 70 && score >= 60
        } else {
            grade = "F";
        }

//        Provide a personalized message based on the grade using switch
        switch (grade) {
            case "A":
                message = "Excellent work! ";
                break;
            case "B":
                message = "Great job! ";
                break;
            case "C":
                message = "Good effort! ";
                break;
            case "D":
                message = "Needs improvement! ";
                break;
            case "F":
                message = "Failed. Better luck next time! ";
                break;
            default:
                message = "Unknown grade.";
                break;
        }

//        Output the grade and the message
        System.out.println("You've earned a " + grade + "! " + message);
    }
}