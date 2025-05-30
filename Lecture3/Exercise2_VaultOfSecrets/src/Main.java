import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] A = new int[15];
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(101);
        }

        int divisibleBy3Count = 0;
        for (int num : A) {
            if(num % 3 == 0) {
                divisibleBy3Count++;
            }
        }

        int[] B = new int[A.length];
        for (int i=0; i<A.length; i++){
            B[i] = 100 - A[i];
        }

        System.out.println("Print original array A: ");
        printArray(A);

        System.out.println("Print complement array B: ");
        printArray(B);

        System.out.println("Divisible by 3: " + divisibleBy3Count);

    }

    public static void printArray (int[] array){
        for (int num : array) {
            System.out.println("Element: " + num + " ");
        }

    }
}