package Assignment;
import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) { 
            int csum = 0;
            for (int j = 0; j < m; j++) 
                csum += arr[j][i];
            System.out.println("Sum of " + (i + 1) + " column is " + csum);
        }

        for (int i = 0; i < m; i++) {
            int rsum = 0;
            for (int j = 0; j < n; j++) 
                rsum += arr[i][j];
            System.out.println("Sum of " + (i + 1) + " row is " + rsum);
        }
    }
}
