import java.util.Scanner;

public class WeatherOracle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Prompt the oracle to enter the temperature
        System.out.println("Enter the temperature");
        int temperature = scanner.nextInt();

//        Use switch to evaluate the temperature
        switch (temperature){
            case 30:
                System.out.println("The temperature is 30 degrees, it's hot !");
                break;
            case 20:
                System.out.println("The temperature is 20 degrees, it's warm !");
                break;
            case 10:
                System.out.println("The temperature is 10 degrees, it's cool !");
                break;
            case 0:
                System.out.println("The temperature is 0 degrees, it's cold !");
                break;
            default:
                if (temperature < 0) {
                    System.out.println("Temperature is below 0, it's freezing !");
                } else {
                    System.out.println("Temperature is " + temperature + " degrees.");
                }
        }
        scanner.close();
    }
}