import java.util.*;

// Factorial
public class f2{

    public static int fact(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }

    public static void main(String k[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = fact(n);
        System.out.println("Factorial : " + factorial);
    }
}