import java.util.Scanner;

public class SecretAgentCode1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter agent's full name: ");

        String fullName = scanner.nextLine();
        System.out.println("Agent's full name is: " + fullName);

        int length = fullName.length();
        System.out.println("Length of the agent's name is: " + length);

        char middleChar;
        if(length % 2 == 0){
            middleChar = fullName.charAt(length / 2 - 1);
        } else {
            middleChar = fullName.charAt(length / 2);
        }

        System.out.println("Agent " + fullName + ", middle character of your name is: " + middleChar);

    }
}