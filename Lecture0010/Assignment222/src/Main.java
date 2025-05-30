import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static Student createStudent(String name, int age, int indexNum){
        return new Student(name, age, indexNum);

    }

    public static void main(String[] args) {

        Random random = new Random();
        List<String> names = Arrays.asList("AName", "BName", "PNAme");
        List<Student> students = names.stream().map(name -> createStudent(name, (random.nextInt(30 - 18) + 18),(random.nextInt(10000 - 1) + 1))).collect(Collectors.toList());
        students.stream().forEach(student -> System.out.println(student));

       List<Student> filteredStudents = students.stream().filter(student -> student.getName().startsWith("P")).collect(Collectors.toList());
       filteredStudents.stream().forEach(student -> System.out.println(student));

        System.out.println("Checking if all the students have age smaller than 25: " + students.stream().allMatch(student -> student.getAge() < 25));
        System.out.println("Checking if any of the students is younger than 25: " + students.stream().anyMatch(student -> student.getAge() < 25));
    }
}