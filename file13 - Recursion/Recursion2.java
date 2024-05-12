public class Recursion2{

    //FACTORIAL OF A NUMBER N.
    public static int fact(int n){
        if(n == 0){
           return 1;
        }
        int fn = n * fact(n-1);
        return fn;
    }

    //SUM OF FIRST N NATURAL NUMBERS.
    public static int sum(int n){
        if(n == 1){
           return 1;
        }
        int sn = n + sum(n-1);
        return sn;
    }

    public static void main(String k[]){
       int n = 5;
       System.out.println(fact(n));
       System.out.println(sum(n));
    }
}