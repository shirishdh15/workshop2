import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n =9 , sum = 0;
        System.out.println(" Enter any number ");
        for (int i = 1; i < n; i++ )
        {
            if ( n % i == 0) {
                sum = sum+i;
            }
        }
        if (sum == n) {
            System.out.println(n + "perfect number");
        }
        else {
            System.out.println(n + "not a perfect number");
        }
    }
}