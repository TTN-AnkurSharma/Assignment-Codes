package Assignment;

public class A7 {
    public static void main(String[] args) {
        try {
            // String str = null;
            // System.out.println(str.length());

            int[] numbers = {10, 20, 30};
            System.out.println("Accessing an array element: " + numbers[5]);
        } 
        catch (NullPointerException e) {
            System.out.println(e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } 
        finally {
            System.out.println("Finally block");
        }
    }
}
