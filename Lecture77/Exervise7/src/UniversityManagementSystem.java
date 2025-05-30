import java.beans.PropertyEditor;
import java.util.List;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student = new Student("5708","Damjan");
        Professor professor = new Professor("P5700","Fatlind");
        DepartmentHead departmentHead = new DepartmentHead("D754","Davor","Computer science");
        StaffMember staffMember = new StaffMember("SM655","Nikola","Student Affair");


        student.attendClass("Programming Languages");

        for(String course: student.getCoursesEnrolled()){
            System.out.println("Course: " + course);
        }
    }
}