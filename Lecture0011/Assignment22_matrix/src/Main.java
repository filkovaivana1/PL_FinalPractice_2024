import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int rows = 0;
            System.out.println("Enter number of rows: ");
            if(scanner.hasNextInt()){
                rows = scanner.nextInt();

            } else {
                System.out.println("Invalid input !");
            }

            System.out.println("Enter number of columns: ");
            int columns = scanner.nextInt();

            int[][] matrix = new int[rows][columns];

            int sum = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.println("Enter element: ");
                    matrix[i][j] = scanner.nextInt();
                    sum += matrix[i][j];
                }
            }

            System.out.println("Sum of all elements is: " + sum);
            System.out.println("Average of all elements is: " + sum / (rows * columns));

        } catch (InputMismatchException inputMismatchException) {
            System.out.println(inputMismatchException.getMessage());
        }
    }
}