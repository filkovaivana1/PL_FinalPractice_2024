import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        int len = name.length();
        System.out.println("Hello " + name);
        System.out.println("The lenght of the name is " + len);
        char middle_char;
        if(len % 2 == 0){
            middle_char = name.charAt(len / 2 - 1);
        }
        else{
            middle_char = name.charAt(len / 2 );
        }
        System.out.println("The middle character of your name is " + middle_char);
    }
}



//Output the agent’s full name.
//Calculate and output the length of the name.
//Determine the character in the middle of the name and display it.
//Print a message: “Agent [Name], the middle character of your name is [Character].”