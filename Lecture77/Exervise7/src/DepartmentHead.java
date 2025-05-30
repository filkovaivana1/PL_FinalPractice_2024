public class DepartmentHead extends Professor implements Administrator{
    public String departmentName;

    public DepartmentHead(String id, String name, String departmentName) {
        super(id, name);
        this.departmentName = departmentName;
    }
    @Override
    public void manageDepartment(String departmentName){
        this.departmentName = departmentName;

    }

}
