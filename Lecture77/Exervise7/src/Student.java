import java.util.ArrayList;
import java.util.List;

public class Student implements UniversityMember,Learner{
    String id;
    String name;
    String role;
    List<String> coursesEnrolled;

    public List<String> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        role = "Student";
        coursesEnrolled = new ArrayList<>();
    }
    @Override
    public String getID(){
        return id;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getRole(){
        return role;
    }

    @Override
    public void attendClass(String courseName){
        coursesEnrolled.add(courseName);
    }
}
