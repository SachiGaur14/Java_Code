public class f7{

    // BINARY TO DECIMAL NUMBER.
    public static void binary(int n){
        int pow = 0;
        int dec = 0;
        int N = n;
        while(n > 0){
        int ld = n%10;
        dec = dec + (ld * (int)Math.pow(2, pow));
        pow ++;
        n = n/10;
        }
        System.out.println("Decimal of " + N + " = " + dec);
    }

    public static void main(String k[]){
        binary(111);
    }
}