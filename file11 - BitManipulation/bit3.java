public class bit3{

    //CLEAR Ith BIT -- makes ith bit = 0.
    public static int clearbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    // SET Ith BIT -- makes ith bit = 1.
    public static int setbit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    //UPDATE Ith BIT -- can be 0 or 1.
    public static int updatebit(int n, int i, int bit){
        if(bit == 0){
            return clearbit(n, i);
        }
        else{    // bit == 1
            return setbit(n, i);
        }
    }

    public static void main(String k[]){
        System.out.println(clearbit(10, 1)); // 10 - 1010
        System.out.println(updatebit(10, 2, 1));  //=1110
    }
}