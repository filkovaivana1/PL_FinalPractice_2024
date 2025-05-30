import java.util.Random;

public class MagicBox {
 private int[] numbers = new int[10];

    public MagicBox() {

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);

        }
    }

    public int findEvenNUm(){
        int countEven=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                countEven++;
            }
        }
       return countEven;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
           sum += numbers[i];
        }
        return (double) sum/numbers.length;

    }

    public void display(){
      for (int num: numbers) {
          System.out.print(num + " ");
      }
    }
}

//Create a class MagicBox that contains an array of 10 random integers between 1 and 100.
//Include a method findEvens that returns the number of even numbers in the array.
//Create a method calculateAverage to find and return the average of all the numbers.
//In the main method, generate a MagicBox object, print the numbers, and display how many of them are even along with the average.
