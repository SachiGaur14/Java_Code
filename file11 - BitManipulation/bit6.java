public class bit6{

    //check if no. is power of 2 or not.
    public static boolean powerof2(int n){
        return (n & (n-1)) == 0;   //power of 2
    }

    //count no. of set bits i.e. 1
    public static int countsetbit(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){   //bit is 1
                count++;
            }
           n = n>>1;
        }
        return count;
    }

    public static void main(String k[]){
        System.out.println(powerof2(8));
        System.out.println(powerof2(9));

        System.out.println("No. of set bit = " + countsetbit(10));   //1010
        System.out.println("No. of set bit = " + countsetbit(16));   //10000
    }
}