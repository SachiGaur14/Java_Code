public class Recursion6{

    //X TO THE POWER OF N == X^N
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xn = x * power(x, n-1);
        return xn;
    }

    public static void main(String k[]){
        System.out.println(power(2, 10));  //1024
        System.out.println(power(3, 5));  //243
    }
}