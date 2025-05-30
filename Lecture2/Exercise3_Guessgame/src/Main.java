import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random result = new Random();
        int examResult = result.nextInt(101);
        System.out.println("Random number is " + examResult);

        if(examResult>=60)
        {
            System.out.println("You have passed the exam!");
        }
        else
        {
            System.out.println("You have failed the exam.");
        }
    }
}