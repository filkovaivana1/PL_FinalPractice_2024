import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        try {
            System.out.println("What is your name? ");
            String name = bufferedReader.readLine();

            System.out.println("WHat is your year of birth? ");
            int year = Integer.parseInt(bufferedReader.readLine());

            System.out.println("What is your height? ");
            double height = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Enter your weight: ");
            double weight = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Your name is: " + name);
            System.out.println("This year you turn: " + (2024 - year) +  " years");

            System.out.println("Your body mass index: " + weight / (height * height));

        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}