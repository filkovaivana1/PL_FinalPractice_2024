public class StaffMember implements UniversityMember, Administrator{
    private String id;
    private String name;
    private String role;
    public String departmentName;

    public StaffMember(String id, String name, String departmentName) {
        this.id = id;
        this.name = name;
        this.role = "StaffMember";
        this.departmentName = departmentName;
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
    public void manageDepartment(String departmentName){
        this.departmentName = departmentName;
    }
}
