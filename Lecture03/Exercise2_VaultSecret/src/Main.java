import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[15];

        Random random = new Random();
        int counter = 0;

        for(int i = 0; i < 15; i++) {
            int r = random.nextInt(101);
            arr[i] = r;
            if (arr[i] % 3 == 0) {
                counter++;
            }

        }

        System.out.println("There are " + counter + " numbers divisible by 3");

        int[] arrB = new int[15];
        for (int i = 0; i < 15; i++) {
            arrB[i] = 100 - arr[i];
        }

        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            System.out.print(arrB[i] + " ");

        }

        System.out.println("Array A");
        for (int element : arr) {
            System.out.println(element + " ");
        }
    }
}

//Create an array A of 15 elements, with values between 0 and 100.
//Count how many numbers in the array are divisible by 3.
//Create another array B where each element is the complement of the corresponding element in A (i.e., B[i] = 100 - A[i]).
//Print both arrays.