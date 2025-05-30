import java.util.Random;

//1.	Create a class MagicBox that contains an array of 10 random integers between 1 and 100.
//2.	Include a method findEvens that returns the number of even numbers in the array.
//3.	Create a method calculateAverage to find and return the average of all the numbers.
//4.	In the main method, generate a MagicBox object, print the numbers, and display how many of them are even along with the average.


public class MagicBox {
    private int[] numbers = new int[10];;

    public MagicBox() {
        Random random = new Random();
//        numbers = new int[10];
        for (int i = 0; i< numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
    }



    public int countEvens() {
        int numEvens = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                numEvens++;
            }
        }
        return numEvens;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int num : numbers) {
                sum+=num;
        }
        return (double) sum/numbers.length;
    }

    public void displayNumbers() {
        System.out.println("Magic box numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //    private int[] numbers;
//
//    public MagicBox() {
//        numbers = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = random.nextInt(100) + 1;
//        }
//    }
//
//    public int findEvens() {
//        int numEven = 0;
//        for (int num : numbers) {
//            if (num % 2 == 0) {
//                numEven++;
//            }
//        }
//        return numEven;
//    }
//
//    public double calculateAverage() {
//        int sum = 0;
//        for (int num : numbers) {
//            sum += num;
//        }
//        return (double) sum/numbers.length;
//    }
//
//    public void displayNumbers() {
//        System.out.print("Magicbox numbers: ");
//        for (int num : numbers) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }
//
    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox();
        magicBox.displayNumbers();

        int countEvens = magicBox.countEvens();
        System.out.println("Number of even numbers: " + countEvens);

        double average = magicBox.calculateAverage();
        System.out.println("Average value is: " + average);


//        MagicBox magicBox = new MagicBox();
//
//        magicBox.displayNumbers();
//
//        int countEven = magicBox.findEvens();
//        System.out.println("Number of even numbers: " + countEven);
//
//        double average = magicBox.calculateAverage();
//        System.out.println("Average value is: " + average);

    }
}