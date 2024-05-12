public class p2{

    //INVERTED AND ROTATED HALF PYRAMID
    public static void half_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");  //spaces
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");  //stars
            }
            System.out.println();  //next line
        }
    }

    public static void main(String k[]){
        half_pyramid(6);
    }
}