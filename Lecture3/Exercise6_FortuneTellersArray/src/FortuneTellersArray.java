import java.util.Random;

//Create a method generateArray(int[] arr, int size) that fills an array with random numbers between 0 and 100.
//Create a method countDivisibleBy(int[] arr, int divisor) that counts how many numbers in the array are divisible by a given divisor.
//Create a method complementArray(int[] arr, int[] complement) that fills a new array with the complements of the first array.
//Test the methods in the main function by generating an array, counting the divisible numbers, and printing both the original and complement arrays.

public class FortuneTellersArray {

    public static void generateArray(int[] arr, int size) {
        Random random = new Random();
        for (int i=0; i<size; i++) {
            arr[i]= random.nextInt(101);
        }
    }

    public static int countDivisibleBy(int[] arr, int divisor) {
        int count = 0;
        for (int elem : arr) {
            if(elem % divisor == 0) {
                count++;
            }
        }
        return count;
    }

    public static void complementArray(int[] arr, int[] complement) {
        for (int i = 0; i < arr.length; i++) {
            complement[i] = 100 - arr[i];
        }
    }

    public static void printArray(int[] arr){
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int lengthArray = 10;
        int[] originalArray = new int[lengthArray];
        int[] complementArray = new int[lengthArray];
        int divisor = 5;

        generateArray(originalArray, lengthArray);
        System.out.println("Original array: ");
        printArray(originalArray);

        complementArray(originalArray, complementArray);
        System.out.println("Complement array: ");
        printArray(complementArray);



//        int lengthArray = 10;
//        int[] originalArray = new int[lengthArray];
//        int[] complementArray = new int[lengthArray];
//        int divisor = 5;
//
//        generateArray(originalArray, lengthArray);
//        System.out.println("Original array: ");
//        printArray(originalArray);
//
//        generateComplementArray(originalArray, complementArray);
//        System.out.println("Generated complement array: ");
//        printArray(complementArray);
//
//       int countDivisible = countDivisible(originalArray, divisor);
//        System.out.println("Number of divisible by divisor: " + countDivisible);

    }

//    public static void printArray(int[] array) {
//        for (int elem: array) {
//            System.out.println("Elem: " + elem);
//        }
//    }
//
//    public static void generateArray(int[] array, int size) {
//        Random random = new Random();
//        for (int i=0; i<size; i++) {
//            array[i] = random.nextInt(101);
//        }
//    }
//
//    public static void generateComplementArray(int[] array, int[] outputArray) {
//        for (int i=0; i<array.length; i++) {
//            outputArray[i] = 100 - array[i];
//        }
//    }
//
//    public static int countDivisible(int[] array, int divisor) {
//        int count = 0;
//        for (int elem : array) {
//            if(elem % divisor == 0) {
//                count++;
//            }
//        }
//        return count;
//    }


}