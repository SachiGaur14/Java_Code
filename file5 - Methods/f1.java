public class f1{
    // product of 2 numbers

    public static int product(int a, int b){
        int product = a*b;
        return product;
    }

    public static void main(String k[]){
        
        int mul1 = product(3, 6);
        System.out.print("Product : " + mul1);
        System.out.println();
        int mul2 = product(4, 5);
        System.out.print("Product : " + mul2);
    }
}