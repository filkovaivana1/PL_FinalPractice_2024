import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter score1:");
        double score1 = scanner.nextDouble();
        System.out.println("Score1: " + score1);
        System.out.println("Enter score2:");
        double score2 = scanner.nextDouble();
        System.out.println("Score2: " + score2);
        System.out.println("Enter score3:");
        double score3 = scanner.nextDouble();
        System.out.println("Score3: " + score3);

        double average = (score1 + score2 + score3) / 3.0;
        System.out.println("Average: " + average);

        String message;
        if (average >= 85) {
            message = "Excellent";
        } else if (average >= 70) {
            message = "Good";

        } else if (average >= 50) {
            message = "Average";

        } else {
            message = "Poor";
        }

        System.out.println("MEssage: " + message);

    }


}

//Write a Java program that calculates and categorizes a student’s score in a test.
//
//Input:
//
//Accept three scores from the user, each between 0 and 100.
//Process:
//
//Calculate the average score.
//Categorize performance based on the average score:
//Excellent for average ≥ 85
//Good for 70 ≤ average < 85
//Average for 50 ≤ average < 70
//Poor for average < 50
//Output:
//
//Display the calculated average and the performance category.