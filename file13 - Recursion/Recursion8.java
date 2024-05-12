public class Recursion8{

    //TILING PROBLEM
    public static int tiling(int n){   //2*n -- floor size
        if(n==0 || n==1){
            return 1;
        }
        //vertical
        int f1 = tiling(n-1);
        //horizontal
        int f2 = tiling(n-2);
        int totalways = f1+f2;
        return totalways;
    }

    public static void main(String k[]){
    System.out.println(tiling(3));
    System.out.println(tiling(2));
    System.out.println(tiling(4));
    }
}