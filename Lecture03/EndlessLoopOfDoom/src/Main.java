//Write a program using a for loop that runs 10 times.
//Inside the loop, check if the current iteration is divisible by 2. If it is, use continue to skip printing the number.
//If the iteration reaches 7, use break to exit the loop.
//Explain how the use of break and continue controls the flow of the program.
//Assignment 5: "The Treasure Map"

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if(i%2==0){
                continue;
            }
            if(i==7){
                break;
            }
            System.out.println("The odd number is "+i);
        }

    }
}