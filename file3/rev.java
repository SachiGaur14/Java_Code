import java.util.*;

public class rev{
    public static void main(String k[]){
        // to reverse a number.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int rev = 0;
        for(int i=1; n>0; i++){
            rev = (rev*10) + (n%10); 
            n=n/10;
        }
        System.out.println("Reverse is : " + rev);

        // another way
        int N = sc.nextInt();
        while(N > 0){
            int last = N % 10;
            N = N/10;
            System.out.print(last);
        }
    }
}