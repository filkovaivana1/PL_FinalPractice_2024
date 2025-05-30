public class UniversityManagementSystem1 {
    public static void main(String[] args) {

        Student student = new Student("5343", "Narcis");
        student.attendClass("Programming languages");

        Professor professor = new Professor("537895", "Professor");
        professor.conductResearch("AI");
        professor.teachCourse("PRogramming languages");

        DepartmentHead departmentHead = new DepartmentHead("53y8935", "Vladimir", "Computer sciences");
        departmentHead.manageDepartment("HR");


    }
}