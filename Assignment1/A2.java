package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        while(true)
        {
            String s=sc.next();
            if(s.equals("XDONE"))
           break;
            else
            arr.add(s);

        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
