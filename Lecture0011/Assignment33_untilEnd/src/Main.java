import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);



        while(true){
            int weight= 0;
            try {
                System.out.println("Enter input or END to finish");
                String input = bufferedReader.readLine();
                if(input.equalsIgnoreCase("END")){
                    break;
                }
                for(int i=0; i<=input.length(); i++) {
                    weight += input.charAt(i);
                }
                System.out.println("Weight of input: " + weight);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}