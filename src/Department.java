import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private static final List<String> departments = new ArrayList<>();

           static {
               departments.add( "Bolum1");
               departments.add( "Bolum2");
               departments.add( "Bolum3");
               departments.add( "Bolum4");
               departments.add( "Bolum5");
           }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    public void displayDetails(){
        System.out.println("department name " + departmentName);
    }
    public static List<String> getDepartments(){
        return departments;
    }
    public static void addDepartment(String departmentName){
        departments.add(departmentName);
    }
}
