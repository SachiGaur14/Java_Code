public class p4{

    //FLOYD'S TRIANGLE
    public static void floyd_triangle(int n){
        int k = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String k[]){
        floyd_triangle(5);
    }
}