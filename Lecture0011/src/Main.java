import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.println("Enter amount of your account: ");
            double amount = Double.parseDouble(bufferedReader.readLine());

            System.out.println("ENter your bank:");
            String bank = bufferedReader.readLine();

            Account account = new Account(bank, amount);
            int choice=0;
            System.out.println("Choose something: ");
            System.out.println("1 - get bank info");
            System.out.println("2 - get amount info");
            System.out.println("3 - adding some amount");
            System.out.println("4 - withdraw");
            System.out.println("5 - clear all account");

            choice = Integer.parseInt(bufferedReader.readLine());
            switch (choice){
                case 1:
                    System.out.println("Your bank: " + bank);
                    break;
                case 2:
                    System.out.println("Your amount: " + amount);
                    break;
                case 3:
                    System.out.println("Enter desired amount: ");
                    amount = Double.parseDouble(bufferedReader.readLine());
                    account.add(amount);
                    break;
                case 4:
                    System.out.println("Enter desired amount: ");
                    amount = Double.parseDouble(bufferedReader.readLine());
                    account.withdraw(amount);
                    break;
                case 5:
                    account.withdraw(account.getAmount());
                    break;
                default:
                    System.out.println("Invalid choice");
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}