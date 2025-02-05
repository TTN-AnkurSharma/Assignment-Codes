import java.io.*;
public class A2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        File file=new File("Assignment2/src/file.txt");
        BufferedWriter fileWriter=new BufferedWriter(new FileWriter("Assignment2/src/file.txt",true));
      do {
          System.out.println("Enter First Name");
          String fname=br.readLine();
          System.out.println("Enter Last Name");
          String lname=br.readLine();
          System.out.println("Enter Age");
          int age=Integer.parseInt(br.readLine());
          System.out.println("Enter Phone number");
          long pno=Long.parseLong(br.readLine());
          User obj=new User(fname,lname,age,pno);
          fileWriter.write("First Name: " + obj.firstName + ", ");
          fileWriter.write("Last Name: " + obj.lastName + ", ");
          fileWriter.write("Age: " + obj.age + ", ");
          fileWriter.write("Phone Number: " + obj.phoneNumber);
          fileWriter.flush();
          System.out.println("Do you want to continue creating users? (Type QUIT to exit)");
          String choice=br.readLine();
          if(choice.equals("QUIT"))
              break;}
      while(true);
      fileWriter.close();
      br.close();  }}
class User {
    String firstName;
    String lastName;
    int age;
    long phoneNumber;
    public User(String firstName, String lastName, int age, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;}}