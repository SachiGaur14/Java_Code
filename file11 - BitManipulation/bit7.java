public class bit7{

    //FAST EXPONENTIATION.
    public static int fastexpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String k[]){
        System.out.println(fastexpo(3, 5));
        System.out.println(fastexpo(5, 3));
    }
}