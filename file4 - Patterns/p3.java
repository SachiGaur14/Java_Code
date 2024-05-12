public class p3{
    public static void main(String k[]){

        //half pyramid pattern of 1234.
        int n=4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}