import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static Student createStudent (String fullName, String yearOfStudy, double id){
        return new Student(fullName, yearOfStudy, id);
    }

    public static void print(Student student) {
        System.out.println("Student info:");
        System.out.println("Name: " + student.getFullName());
        System.out.println("Year od study: " + student.getYearOfStudy());
        System.out.println("ID: "+ student.getId());
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<String> names = Arrays.asList("Name1", "Name2", "Name3");

        List<Student> students = names.stream().map(name -> createStudent(name, Integer.toString(random.nextInt(3) + 1), random.nextDouble(9999 - 1000) + 1000)).collect(Collectors.toList());
        System.out.println("Print all students");
        students.stream().forEach(student -> print(student));

        System.out.println("Print students of 2nd year:");
        students.stream().filter(student -> student.getYearOfStudy().equals("2")).forEach(student -> print(student));


    }
}