import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int score = random.nextInt(101);
        System.out.println("Generated score is "
         + score);

        String grade;
        String message;
        if(score >= 90){
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        switch (grade) {
            case "A":
                message = "Excellent work!";
                break;
            case "B":
                message = "Good work!";
                break;
            case "C":
                message = "Good effort!";
                break;
            case "D":
                message = "Needs some improvement!";
                break;
            case "F":
                message = "Failed!";
                break;
            default:
                message = "Invalid input";
                break;
        }

        System.out.println("YOu've earned " + grade + "! " + message);


    }
}