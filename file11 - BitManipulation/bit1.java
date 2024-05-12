public class bit1{

    //TO CHECK IF NO. IS EVEN OR ODD (IN BITS)
    public static void oddeven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){  //even
           System.out.println("Even number");
        }
        else{   //odd
            System.out.println("Odd number");
        }
    }

    public static void main(String k[]){
       oddeven(3);
       oddeven(12);
    }
}