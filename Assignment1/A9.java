package Assignment;

public class A9 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        try{
            throw new MYException("Array index out of range");}
        catch(MYException m)
        {
//         System.out.println(m.getMessage());
           System.out.println(m.fillInStackTrace());
        }
    }
}

   
class MYException extends RuntimeException {
    public MYException(String m) {
        super(m);
    } 
    @Override
    public Throwable fillInStackTrace() {
        return null;
    }
}

