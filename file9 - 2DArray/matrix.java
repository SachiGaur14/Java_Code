import java.util.*;
public class matrix{

    //TO SEARCH AN ELEMENT
    public static boolean search(int ar[][], int key){
        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar[0].length; j++){
                if(ar[i][j] == key){
                    System.out.println("Found at cell = (" + i+ ", " + j+ ")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void main(String k[]){
        //2D ARRAYS
        int matrix[][] = new int[3][3];
        int n = matrix.length;     //rows
        int m = matrix[0].length;  //columns

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               matrix[i][j] = sc.nextInt(); 
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter number to search : ");
        int key = sc.nextInt();
        search(matrix, key);
    }
}