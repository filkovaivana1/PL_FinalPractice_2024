import java.nio.file.LinkPermission;
import java.util.Scanner;

public class TimeTravelersChallenge1 {
    public static void main(String[] args) {
//        Create an instance of Scanner
        Scanner scanner = new Scanner(System.in);

        while(true) {
//            Prompt the user to enter a year or 'STOP' to exit
            System.out.println("Enter a year to check if it's a leap year (or type 'STOP' to exit): ");
            String input = scanner.nextLine();
//            Check if the user wants to stop
            if (input.equalsIgnoreCase("STOP")) {
                System.out.println("Exiting the time traveler's challenge. Safe travels!");
                break;
            }
//            Convert input to integer
            try {
            int year = Integer.parseInt(input);

//            Check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } catch (NumberFormatException e) {
                System.out.println("Invalid input ! Please enter a valid year or 'STOP' o exit.");
            }
        }

        scanner.close();
    }

//    method to determine if a year is a leap year
    public static boolean isLeapYear(int year){
//       A year is a leap year if it's divisible by 4
//        but years divisible by 100 are not leap unless divisible by 400
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}