public class Recursion3{

    //FIBONACCI NUMBER
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.....
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        int fn = f1 + f2;
        return fn;
    }

    public static void main(String k[]){
        int n=10;
        System.out.println(fib(n));
        //sequence
        for(int i=0; i<=n; i++){
         System.out.print(fib(i) + " ");   
        }
    }
}