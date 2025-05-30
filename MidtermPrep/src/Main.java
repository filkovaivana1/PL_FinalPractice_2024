import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double score1, score2, score3;

        System.out.println("Enter score for test 1: ");
        score1 = scanner.nextDouble();

        System.out.println("Enter score for test 2: ");
        score2 = scanner.nextDouble();

        System.out.println("Enter score for test 3: ");
        score3 = scanner.nextDouble();


        double average = (score1 + score2 + score3)/3;

        String performance;
        if(average >= 85) {
            performance = "Excellent";
        } else if (average >= 70) {
            performance = "Good";
        } else if (average >= 50) {
            performance = "Average";
        } else {
            performance = "Poor";
        }

        System.out.println("Average score: " + average);
        System.out.println("Performance: " + performance);
        scanner.close();

    }
}

//public class StudentScoreCalculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double score1, score2, score3;
//
//        // Input scores without range validation
//        System.out.print("Enter score for Test 1: ");
//        score1 = scanner.nextDouble();
//
//        System.out.print("Enter score for Test 2: ");
//        score2 = scanner.nextDouble();
//
//        System.out.print("Enter score for Test 3: ");
//        score3 = scanner.nextDouble();
//
//        // Calculate average
//        double average = (score1 + score2 + score3) / 3.0;
//
//        // Determine performance category
//        String performance;
//        if (average >= 85) {
//            performance = "Excellent";
//        } else if (average >= 70) {
//            performance = "Good";
//        } else if (average >= 50) {
//            performance = "Average";
//        } else {
//            performance = "Poor";
//        }
//
//        // Display results
//        System.out.printf("\nAverage Score: %.2f\n", average);
//        System.out.println("Performance: " + performance);
//
//        scanner.close();
//    }
//}