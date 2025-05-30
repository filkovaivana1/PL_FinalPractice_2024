import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int i=0;
        while (i<10){
            int r = random.nextInt(500)+1;
            System.out.print(r + " ");
            i++;
        }
        System.out.println();

        int r;
        do{
            r = random.nextInt(500)+1;
        }while (r>300);

        int counter=0;
        for(int j=0;j<=20;j++){
            int a = random.nextInt(500)+1;
            System.out.print(a + " ");
            if(a%2==0){
                counter++;
            }
        }

        System.out.println("There were " + counter + " even numbers.");

        while (true){
            int b = random.nextInt(500)+1;
            if(b%7==0){
                System.out.println("The number " + b + " is divisible by 7.");
                break;
            }
        }



    }
}

//Generate random integers between 1 and 500.
//Use a while loop to print 10 numbers in a row.
//Use a do-while loop to keep generating numbers until a number greater than 300 is produced.
//Count how many even numbers are generated in 20 trials.
//Stop generating numbers once one divisible by 7 is found.