package Assignment3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Map<Employee,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
       Employee ankur=new Employee("Ankur Sharma",21,"JVM Developer");
       Employee anurag=new Employee("Anurag Mishra",21,"QE Engineer");
       map.put(ankur,450000);
       map.put(anurag,500000);
        Iterator<Employee> it=map.keySet().iterator();
        while(it.hasNext()) {
            Employee obj=it.next();
            System.out.println(obj.getName()+" has salary "+map.get(obj));}}}
class Employee{
   private String name;
   private int age;
    private String designation;
    public Employee(String name, int age, String designation) {
        setName(name);
        setAge(age);
        setDesignation(designation);}
    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;}
    public int getAge() {
        return age;}
    public void setAge(int age) {
        this.age = age;}
    public String getDesignation() {
        return designation;}
    public void setDesignation(String designation) {
        this.designation = designation;
    }}