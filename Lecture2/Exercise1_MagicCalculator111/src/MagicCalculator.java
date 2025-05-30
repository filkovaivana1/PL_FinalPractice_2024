//Declare two integer variables representing the magical numbers.
//Perform all arithmetic operations on them.
//Store the result of each operation in separate variables.
//Output all the results with a message for each (e.g., "The sum of the numbers is...").
//Finally, calculate and output the average of the results.


public class MagicCalculator {
    public static void main(String[] args) {
        int a = 4, b = 7;

        int sum = a + b;
        System.out.println("The sum is " + sum);

        int difference = a - b;
        System.out.println("The difference is " + difference);

        int product = a * b;
        System.out.println("The product is " + product);

        double quotient =  a / b;
        System.out.println("The quotient is " + quotient);

        double average = (sum + difference + product + quotient) / 4;
        System.out.println("The average of the operations is " + average);
    }
}