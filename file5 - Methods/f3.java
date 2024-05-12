import java.util.*;
  // Binomial Coefficient

public class f3{

    public static int fact (int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static int Binomial(int n, int r){
        int nf = fact(n);
        int rf = fact(r);
        int nrf = fact(n-r);
        int bc = nf/(rf * nrf);
        return bc;
    }

    public static void main(String k[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int r = sc.nextInt();
       System.out.println("C(n,r) = " + Binomial(n, r));
    }
}