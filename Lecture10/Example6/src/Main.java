import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Stream", null, "Filter", null);
        List<String> result = list.stream().collect(Collectors.toList());
        result.forEach(System.out::println);

        System.out.println("Hello world!");
    }
}
