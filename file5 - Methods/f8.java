public class f8{

    //DECIMAL TO BINARY NUMBER.
    public static void decimal(int n){
        int pow = 0;
        int bin = 0;
        int N = n;
        while(n > 0){
            int rem = n%2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary of " + N + " = " + bin);
    }

    public static void main(String k[]){
        decimal(8);
        decimal(15);
    }
}