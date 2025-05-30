import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[5][10];
        int[] sumRow = new int[5];
        Random random = new Random();

        for (int i=0; i<5; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                int num = random.nextInt(100);
                matrix[i][j] = num;
                sum = sum + matrix[i][j];
            }
            sumRow[i] = sum;
            System.out.println("Sum of i-th row: " + sumRow[i]);
        }

        for (int[] row : matrix){
            for (int elem : row){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}

//Create a 5x10 matrix.
//Fill the matrix with random integers.
//Print the matrix.
//For each row, calculate the sum of the numbers.
//Output the row sums along with the matrix.