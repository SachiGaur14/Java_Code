public class f6{

    // prime range b/w 1 and n.
    public static boolean prime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void range(int n){
        for(int i=2; i<=n; i++){
        if(prime(i) == true){
            System.out.println(i);
        }
        }
    }

    public static void main(String k[]){
        range(10);
    }
}