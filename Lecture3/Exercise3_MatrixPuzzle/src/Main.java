import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        char[][] matrix = new char[3][3];

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                int num = random.nextInt(100);
                if (num % 2 == 0) {
                    matrix[i][j] = 'X';
                } else {
                    matrix[i][j] = 'O';
                }
            }
        }

        System.out.println("Generated 3x3 matrix:");
        printMatrix(matrix);


        String winner = checkWinner(matrix);

        if(winner.equals("X") || winner.equals("O")){
            System.out.println("Player " + winner + " wins! ");
        } else {
            System.out.println("There's no winner. ");
        }

    }

    public static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char elem: row){
                System.out.println("Elem: " + elem);
            }
        }
    }

    public static String checkWinner(char[][] matrix){

        for (int i=0; i<3; i++) {
            if (matrix[i][0] == matrix [i][1] && matrix [i][1] == matrix[i][2]) {
                return String.valueOf(matrix[i][0]);
            }
        }

        for (int j=0; j<3; j++) {
            if (matrix[0][j] == matrix [1][j] && matrix [1][j] == matrix[2][j]) {
                return String.valueOf(matrix[0][j]);
            }
        }

        if (matrix[0][0] == matrix [1][1] && matrix [1][1] == matrix[2][2]) {
            return String.valueOf(matrix[0][0]);
        }

        if (matrix[0][2] == matrix [1][1] && matrix [1][1] == matrix[2][0]) {
            return String.valueOf(matrix[0][2]);
        }

        return "No winner";

    }
}