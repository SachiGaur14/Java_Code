public class Recursion7{

    //A TO THE POWER N(OPTIMISED WAY)
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        int half = power(a, n/2);
        int halfpower = half * half;
        //if n is odd
        if(n%2 != 0){
            halfpower = a * halfpower;
        }
        return halfpower;
    }

    public static void main(String k[]){
       int a=2;
       int n=5; 
       System.out.println(power(a, n));
    }
}