public class f5{

    // prime number.
    public static boolean prime(int n){
        boolean prime = true;
        if(n == 2){
            return true;
        }
        for(int i=2; i<=n-1; i++){
            if(n % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String k[]){
       System.out.println(prime(2));
       System.out.println(prime(6));
    }
}