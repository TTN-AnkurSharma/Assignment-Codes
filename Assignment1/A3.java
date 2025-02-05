package Assignment;
import java.util.Scanner;
public class A3 {
    public static double area(int radius)
    {
        return 3.14*radius*radius;
    }
    public static double circumfrence(int radius)
    {
        return 2*3.14*radius;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("*******Menu******* \n 1. Calculate Area of Circle\n" + //
                        "2. Calculate Circumference of a Circle\n" + //
                        "3. Exit.\n" + //
                        "Choose an option (1-3): ");
            int ch=sc.nextInt();
            System.out.println("Enter radius");
            int radius=sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println(area(radius));
                    break;
                case 2:
                    System.out.println(circumfrence(radius));
                    break;
            
                default:
                    break;
            }; }}
