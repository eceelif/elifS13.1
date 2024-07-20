public class SuccessfulStudents extends Students {
   public SuccessfulStudents(String name, String city, int age, Budget budget){
       super(name, city, age, budget);
   }
   public void displaySuccessMessage(){
       System.out.println("basarili");
   }
}
