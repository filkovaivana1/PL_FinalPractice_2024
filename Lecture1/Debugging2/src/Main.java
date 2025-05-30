import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> array1 = new ArrayList<>();
        array1.add("firstWord");
        array1.add("SecondTest");
        array1.add("Third");

        List<String> array2 = new ArrayList<>();
        for(String element : array1){
            array2.add(element.substring(6));
        }
        System.out.println(array2);
    }
}