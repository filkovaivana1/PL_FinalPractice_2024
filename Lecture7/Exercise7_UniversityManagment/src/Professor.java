import java.util.ArrayList;

public class Professor implements UniversityMember, Educator, Researcher{

    private String id;
    private String name;
    private String role;
    private ArrayList<String> coursesTaught;
    private ArrayList<String> researchTopics;

    public Professor(String id, String name) {
        this.id = id;
        this.name = name;
        this.role = "Professor";
        this.coursesTaught = new ArrayList<>();
        this.researchTopics = new ArrayList<>();
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
    public void teachCourse(String courseName){
        coursesTaught.add(courseName);
    }

    @Override
    public void conductResearch(String topic){
        researchTopics.add(topic);
    }


}
