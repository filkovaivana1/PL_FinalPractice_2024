public class MagicCalculator1 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 2;

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        double quotient = (double) number1 / number2;

        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Difference of the numbers is: " + difference);
        System.out.println("Product of the numbers is: " + product);
        System.out.println("Quotient of the numbers is: " + quotient);

        double average = (sum + difference + product + quotient) / 4.0;
        System.out.println("Average of these results is: " + average);
    }
}