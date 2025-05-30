import java.util.Random;
import java.util.Scanner;

public class TreasureHunt1 {
    public static void main(String[] args) {
//        Create an instance of Random
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int treasureX = random.nextInt(10) + 1;
        int treasureY = random.nextInt(10) + 1;

        System.out.println("Welcome to Treasure Hunt!");
        System.out.println("Guess the treasure's location on a 10x10 grid (coordinates between 1 and 10).");
        System.out.println("You have 5 attempts to find the treasure. Good luck!");

        boolean found = false;

//        Allow the player 5 attempts
        for (int attempt = 1; attempt <= 5; attempt++) {
            System.out.println("Attempt " + attempt + ": ");

//            Prompt the payer to enter the x coordinate
            int guessX;
            while (true) {
                System.out.println("Enter your guess for X (1-10): ");
                String inputX = scanner.nextLine();

                try {
                    guessX = Integer.parseInt(inputX);
                    if (guessX >= 1 && guessX <= 10) {
                        break;
                    } else {
                        System.out.println("Please enter a number between 1 an 10");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                }
            }

//            Prompt the player to enter Y coordinate
            int guessY;
            while (true) {
                System.out.println("Enter your guess for Y (1-10): ");
                String inputY = scanner.nextLine();

                try {
                    guessY = Integer.parseInt(inputY);
                    if (guessY >= 1 && guessY <= 10) {
                        break;
                    } else {
                        System.out.println("Please enter a number between 1 an 10");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                }
            }

//            Check if th guess is correct
            if (guessX == treasureX && guessY == treasureY) {
                System.out.println("Congratulations! You've found the treasure at (" + treasureX + ", " + treasureY + ")!");
                found = true;
                break;
            } else {
                System.out.println("Too far! Try again!");
            }

        }

//        We check if the treasure wasn't found after 5 attempts
        if(!found) {
            System.out.println("Game over ! The treasure was at (" + treasureX + ", " + treasureY + ").");
        }

        scanner.close();

    }
}