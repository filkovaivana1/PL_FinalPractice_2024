import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number1:");
        double input1 = scanner.nextDouble();
        System.out.println("NUmber2:");
        double input2 = scanner.nextDouble();
        System.out.println("NUmber3");
        double input3 = scanner.nextDouble();

        double average = (input1 + input2 + input3) / 3.0;
        System.out.println("Average:" + average);

        String output;
        if(average >= 85) {
            output = "Excellent";
//            System.out.println("Excellent");
        } else if (average >= 70) {

            System.out.println("Good");
        } else if (average >= 50) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }

    }
}