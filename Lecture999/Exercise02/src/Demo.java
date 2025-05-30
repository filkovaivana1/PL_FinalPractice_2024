public class Demo {
    public static void main(String[] args) {
        Student s = new Student("Student", "072/555-555", 1234, 7822);

        StudentFileStream studentFileStream = new StudentFileStream();
        String file_name = "student_example.txt";
        studentFileStream.writeToFile(s, file_name);
        s = studentFileStream.readFromFile(file_name);
    }
}