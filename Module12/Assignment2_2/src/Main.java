import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static Student createStudent(String name, String yearOfStudy, double id){
        return new Student(name, yearOfStudy, id);
    }

    public static void printData(Student s){
        System.out.println("Name: " + s.getName());
        System.out.println("Year of study: " + s.getYearOfStudy());
        System.out.println("Id: " + s.getId());
    }

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Anna", "Barbara", "CName", "Petra");
        Random random = new Random();
//        nameList.stream().map(name -> createStudent(name, (random.nextInt(12) + 18), (random.nextInt(10000 - 1) + 1))).forEach(student -> printData(student));
        List<Student> students =  nameList.stream().map(name -> createStudent(name, Integer.toString(random.nextInt(3) + 1), (random.nextDouble(9999 - 1000) + 1000))).collect(Collectors.toList());
        System.out.println("All students: ");
        students.stream().forEach(student -> printData(student));
        List<Student> studentResult = students.stream().filter(student -> student.getYearOfStudy().equalsIgnoreCase("2")).collect(Collectors.toList());
        System.out.println("Filtered students of 2nd year: ");
        studentResult.stream().forEach(student -> printData(student));

//        System.out.println("Check if all students have age less than 25:" + students.stream().allMatch(student -> student.getAge() < 25000));
//        System.out.println(studentResult.stream().anyMatch(student -> student.getAge() < 25000));


    }
}