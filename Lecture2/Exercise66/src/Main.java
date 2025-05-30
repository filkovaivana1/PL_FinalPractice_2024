import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter year, or 'STOP' to exit");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("STOP")){
                System.out.println("Exiting the loop");
                break;
            }

            try{
                int year = Integer.parseInt(input);
                if(isLeap(year)){
                    System.out.println("It's a leap year");
                } else {
                    System.out.println("It's not leap year");
                }
            }catch (Exception e){
                System.out.println("Invalid input");
            }

        }
    }

    public static boolean isLeap (int year){
        if (year % 4 != 0){
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else return false;

    }
}