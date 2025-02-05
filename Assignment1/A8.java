package Assignment;

public class A8 {
   
        public static void classNotFound() {
            try {
                Class.forName("com.mysql.jdbc.Driver"); 
            } catch (ClassNotFoundException e) {
                System.out.println("Exception: MySQL JDBC Driver not found!");
            }
        }
        
    
}
