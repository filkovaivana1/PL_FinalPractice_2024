import java.util.Random;

public class Main {
    public static void generateMatrix(char[][] matrix) {
        Random random = new Random();
        for (int i = 0;  i<3; i++) {
            for (int j=0; j<3; j++) {
                matrix[i][j] = random.nextBoolean() ? 'X' : 'O';
            }
        }
    }

    public static void printMatrix (char[][] matrix) {
        for(char[] row : matrix) {
            for (char elem : row){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static int countLines(char[][] matrix, char symbol) {
        int countLines = 0;
        for (int i=0; i<3; i++) {
            if (matrix[i][0] == symbol && matrix[i][1]==symbol && matrix[i][2]==symbol) {
                countLines++;
            }
        }

        for (int j=0; j<3; j++) {
            if (matrix[0][j] == symbol && matrix[1][j]==symbol && matrix[2][j]==symbol) {
                countLines++;
            }
        }

        if (matrix[0][0]==symbol && matrix[1][1]==symbol && matrix[2][2]==symbol){
            countLines++;
        }

        if (matrix[0][2]==symbol && matrix[1][1]==symbol && matrix[2][0]==symbol){
            countLines++;
        }
        return countLines;
    }

    public static void announceWinner(int countX, int countO){
        if (countO == countX) {
            System.out.println("No winner");
        } else if (countO > countX) {
            System.out.println("Player O is winner");
        } else {
            System.out.println("Player X is winner");
        }

    }


    public static void main(String[] args) {
       char[][] matrix = new char[3][3];
       generateMatrix(matrix);
       printMatrix(matrix);
       int countXLInes = countLines(matrix,'X');
       int countOLines = countLines(matrix, 'O');

       announceWinner(countXLInes, countOLines);

    }
}

//Create a method generateMatrix(char[][] matrix) that fills a 3x3 matrix with randomly placed 'X' and 'O' values.
//Create a method printMatrix(char[][] matrix) to output the matrix.
//Create a method countLines(char[][] matrix, char symbol) that counts how many rows, columns, and diagonals are filled with the given symbol.
//Create a method announceWinner(int countX, int countO) that compares the counts and prints whether 'X' or 'O' wins, or if there is no winner.
//In main, generate the matrix, print it, count the lines for 'X' and 'O', and announce the winner.