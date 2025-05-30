import java.util.Random;
import java.util.Scanner;

public class NumberGeneratorsSecret {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int countNum = 0;
        while (countNum < 10) {
            int number = random.nextInt(500) + 1;
            System.out.println(number + " ");
            countNum ++;
        }

        int generatedNum;
        do {
            generatedNum = random.nextInt(500) + 1;
            System.out.println("Generated number: " + generatedNum);
        } while (generatedNum <= 300);


        int countEven = 0;
        for (int i = 1; i <= 20; i++){
            int num = random.nextInt(500) + 1;
            System.out.println("Trial " + i + ": " + num);
            if(num % 2 ==0){
                countEven ++;
            }
        }
        System.out.println("Number of even numbers in 20 trials is: " + countEven);


        while (true) {
            int genNum = scanner.nextInt(500) + 1;
            System.out.println("Generated num: " + genNum);

            if (genNum % 7 == 0) {
                System.out.println("Divisible by 7 found");
                break;
            }
        }

 scanner.close();

    }
}