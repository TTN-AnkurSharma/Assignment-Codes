package Assignment;

public class A1 {
    static String firstName;
    static String lastName;
    static int age;

    static{
        firstName="Ankur";
        System.out.println("First name is "+firstName);
    }
    
    static void printLastName()
    {
        lastName="Sharma";
        System.out.println("Last Name is "+lastName);
    }
    public static void main(String[] args) {
        printLastName();
        age=21;
        System.out.println("Age is "+age);
    }
}
