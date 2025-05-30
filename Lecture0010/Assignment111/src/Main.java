import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> initialList = Arrays.asList(1,2,3,4,3);

        Set<Integer> finalList = initialList.stream().map(number -> number * number).collect(Collectors.toSet());
        finalList.stream().forEach(number -> System.out.println(number));
        System.out.println("Hello world!");


        List<String> initialLetters = Arrays.asList("a", "b", "c");
        initialLetters.stream().map(str -> str.toUpperCase()).forEach(x-> System.out.println(x));

    }
}