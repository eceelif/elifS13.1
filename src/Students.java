public class Students {
private String name;
private String city;
private int age;
private Budget myBudget;
public Students(String name, String city, int age, Budget budget) {
    this.name = name;
    this.city = city;
    this.age = age;
    this.myBudget = budget;

}



    public void displayDetails(){
    System.out.println("Name: "+ name);
    System.out.println("city: "+ city);
    System.out.println("Age: "+ age);
    myBudget.displayDetails();

}



}

