public class bit4{

    //Update ith bit
    public static int clearbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updatebit(int n, int i, int bit){
        n = clearbit(n, i);
        int bitmask = bit<<i;
        return n | bitmask;
    }

    //clear last i bits
    public static int clearibits(int n, int i){
        int bitmask = (~0)<<i;    //~0 = -1  = 11111...
        return n & bitmask;
    } 

    public static void main(String k[]){
        System.out.println(updatebit(10, 1, 0));  //10 - 1010 = 8
        System.out.println(clearibits(14, 2));  //1110 == 1100 == 12
    }
}