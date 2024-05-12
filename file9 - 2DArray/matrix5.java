public class matrix5{

    //SEARCH IN SORTED MATRIX -- STAIRCASE SEARCH.
    public static boolean staircase(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("found at cell (" + row + ", " + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{  //key > matrix[row][col]
                row++;
            }
        }
        System.out.println("Key not found.");
        return false;
    }

    public static void main(String k[]){
        int matrix[][] = {{10, 20, 30 ,40}, {15, 25, 35, 45},
                          {27, 29, 37, 48}, {32, 33, 39,50}};
        int key = 33; 
        int key2 = 90;
        staircase(matrix, key); 
        staircase(matrix, key2);                
    }
}