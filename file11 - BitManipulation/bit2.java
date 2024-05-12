public class bit2{

    // GET Ith BIT
    public static int getbit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    // SET Ith BIT --makes ith bit = 1.
    public static int setbit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static void main(String k[]){
        System.out.println(getbit(10, 2));  // 10 - 1010 
        System.out.println(setbit(10, 2));
    }
}