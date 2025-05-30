import java.util.Random;

public class Main {

    public static void generateArray(int[] arr, int size) {
        Random random = new Random();
        for (int i = 0; i<size; i++){
            arr[i] = random.nextInt(101);
        }
    }

    public static int countDivisibleBy(int[] arr, int divisor) {
        int numDivisible = 0;
        for (int elem : arr) {
           if (elem % divisor == 0) {
               numDivisible++;
           }
        }
        return numDivisible;
    }

    public static void complementArray(int[] arr, int[] complement) {
        for (int i = 0; i< arr.length; i++) {
            complement[i] = 100 - arr[i];
        }
    }

    public static void printArray(int[] array){
        for (int elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int sizeArr = 5;
        int[] originalArray = new int[sizeArr];
        int[] complementArray = new int[sizeArr];
        generateArray(originalArray, sizeArr);
        System.out.println("Original array generated: ");
        printArray(originalArray);

        int count = countDivisibleBy(originalArray, 7);
        complementArray(originalArray, complementArray);
        System.out.println("Complement array: ");
        printArray(complementArray);

        System.out.println("Number of numbers divisible by 7: " + count);



    }
}

//Create a method generateArray(int[] arr, int size) that fills an array with random numbers between 0 and 100.
//Create a method countDivisibleBy(int[] arr, int divisor) that counts how many numbers in the array are divisible by a given divisor.
//Create a method complementArray(int[] arr, int[] complement) that fills a new array with the complements of the first array.
//Test the methods in the main function by generating an array, counting the divisible numbers, and printing both the original and complement arrays.