public class Recursion10{

    //FRIENDS PAIRING
    public static int friendpair(int n){
        if(n==1 || n==2){
            return n;
        }
        int f1 = friendpair(n-1);  //single
        int f2 = friendpair(n-2);  //pairing
        int pair = (n-1) * f2;
        
        int totalways = f1 + pair;
        return totalways;
    }

    public static void main(String k[]){
        System.out.println(friendpair(3));
    }
}