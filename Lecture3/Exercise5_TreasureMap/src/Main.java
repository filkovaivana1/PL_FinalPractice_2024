import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int rows = 5;
        int cols = 10;
        int[][] map = new int[rows][cols];
        int[] rowSums = new int[rows];

        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < cols; j++) {
                map[i][j] = random.nextInt(101);
            }
        }

        System.out.println("Treasure map: ");
        printMap(map);

        for (int i = 0; i <rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += map[i][j];
            }
            rowSums[i] = sum;
        }

        System.out.println("Printing row sums");
        for(int i=0; i<rowSums.length; i++) {
            System.out.println("Sum of row " + i + ": " + rowSums[i]);
        }
    }

    public static void printMap(int[][] map){
        for (int[] row : map){
            for (int elem : row) {
                System.out.println("Elem: " + elem);
            }
        }
    }
}