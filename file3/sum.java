import java.util.*;

public class sum{
    public static void main(String k[]){

        // sum from 1 to n.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int sum = 0;

        while(i <= n){
           sum = sum + i;
           i++;
        }
        System.out.println("sum is : " + sum);
    }
}