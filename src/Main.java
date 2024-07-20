

import java.util.List;

public class Main {
//      public static void main(String[] args) {
//          MyClass myObj = new MyClass();
//          System.out.println(myObj.x);
//
//      }
//    }
//    class MyClass {
//    int x=5;
        public static void main(String[] args){

            Budget myBudget =new Budget(1233);
            SuccessfulStudents successfulStudents = new SuccessfulStudents("eren", "istanbul", 20, myBudget );
            Students myStudent = new Students("ece", "ankara", 12, myBudget );
            myStudent.displayDetails();
            Department.addDepartment("uzay bilimleri");

            List<String> departmentNames = Department.getDepartments();
            for (String deptName : departmentNames){
                Department myDepartment= new Department(deptName);
                myDepartment.displayDetails();
            }
            successfulStudents.displayDetails();
            successfulStudents.displaySuccessMessage();
//

        }
    }
