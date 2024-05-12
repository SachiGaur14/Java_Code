public class bit5{

    //CLEAR BIT RANGE
    public static int clearbitrange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int bitmask = a|b;
        return n & bitmask;
    }
    
    public static void main(String k[]){
        System.out.println(clearbitrange(10, 2, 4));  //01010 == 00010 == 2
    }
}