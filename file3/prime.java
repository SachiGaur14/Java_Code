import java.util.*;

public class prime{
    public static void main(String k[]){
        Scanner sc = new Scanner(System.in);

        // to check prime number.
        int n = sc.nextInt();
        boolean prime = true;
        if(n==2){
            System.out.println("2 is prime");
        }
        else{
        for(int i=2; i<n; i++){
           if(n%i == 0){
            System.out.println("Not Prime");
            prime = false;
            break;
           }
        }
        if(prime == true){
            System.out.println("Prime number");
        }
        }
    }
}
