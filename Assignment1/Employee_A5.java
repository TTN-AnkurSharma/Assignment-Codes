package Assignment;
public class Employee_A5 {
    String firstName;
    String lastName;
    int age;
    private String designation;
    Employee_A5()
    {
        firstName="";
        lastName="";
        age=0;
    }
    Employee_A5(String firstName, String lastName, int age, String designation) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.designation=designation;}
    Employee_A5(Employee_A5 e) {
        this.firstName=e.firstName;
        this.lastName=e.lastName;
        this.age=e.age;
        this.designation=e.designation;}
    public String getDesignation() {
        return designation;}
    public void setDesignation(String designation) {
        this.designation=designation;}
    @Override
    public String toString() {
        return "Employee Details: " + firstName + " " + lastName + ", Age: " + age + ", Designation: " + designation;}
    public static void main(String[] args) {
        Employee_A5 obj=new Employee_A5("Ankur", "Sharma",21,"JVM Developer");
        System.out.println(obj.toString());
        Employee_A5 obj2=new Employee_A5(obj);
        System.out.println(obj2.toString());}}
