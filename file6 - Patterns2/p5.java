public class p5{

    //0-1 TRIANGLE
    public static void triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");  // at even places
                }
                else{
                    System.out.print("0 ");  // at odd places
                }
            }
            System.out.println();
        }
    }

    public static void main(String k[]){
        triangle(5);
    }
}