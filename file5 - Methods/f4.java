public class f4{

    // FUNCTION OVERLOADING -- depend on parameters only.
    // parameter type or number can be different.
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String k[]){
       System.out.println(sum(4, 5));
       System.out.println(sum(3, 4, 7));
    }
}