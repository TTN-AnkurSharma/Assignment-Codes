package Assignment3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Float> list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextFloat());
        }
        Iterator<Float> iterator= list.iterator();
        float sum=0f;
        while(iterator.hasNext())
        {
            float ele=iterator.next();
            System.out.println(ele);
            sum+=ele;
        }
        System.out.println("sum is "+sum);
    }
}
