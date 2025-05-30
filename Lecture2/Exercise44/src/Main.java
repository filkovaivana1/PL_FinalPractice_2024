import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature");
        int temp = scanner.nextInt();


       switch (temp) {
           case 30:
               System.out.println("The tempreature is 30 degresse, it's very hot");
               break;
           case 20:
               System.out.println("The tempreature is 20 degresse, it's warm");
               break;
           case 10:
               System.out.println("The tempreature is 10 degresse, it's cool");
               break;
           case 0:
               System.out.println("The tempreature is 0 degresse, it's cold");
               break;
           default:
               if(temp < 0) {
                   System.out.println("It's freezing");
               } else {
                   System.out.println("Temperature is" + temp + " degrees");
               }
               break;
       }

    }
}