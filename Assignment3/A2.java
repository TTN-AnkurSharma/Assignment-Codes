package Assignment3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class A2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(21, 450000, "Ankur Sharma"));
        employees.add(new Employee(21, 500000, "Ansh"));
        employees.add(new Employee(22, 480000, "Dhruv"));
        employees.add(new Employee(23, 460000, "Lavanya Ahuja"));
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return Double.compare(employee.salary,t1.salary);
            }
        });
        System.out.println("Sorted based on Salary");
     for(Employee emp:employees)
       {
           System.out.println(emp.name+" "+emp.salary);
       }
        Collections.sort(employees);
        System.out.println("Sorted based on name length");
        for(Employee emp:employees)
        {
            System.out.println(emp.name);
        }}}
class Employee implements Comparable<Employee>
{
    int age;
    double salary;
    String name;
    public Employee(int age,double sal,String name)
    {
        this.age=age;
        this.salary=sal;
        this.name=name;
    }
    @Override
    public int compareTo(Employee emp) {
     return this.name.length()-emp.name.length();
    }
}
