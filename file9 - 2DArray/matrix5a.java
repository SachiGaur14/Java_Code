public class matrix5a{

// STAIRCASE SEARCH FROM LEFT BOTTOM ELEMENT.
public static void staircase(int matrix[][], int key){
    int row = matrix.length-1;
    int col = 0;
    while(row >= 0 && col < matrix[0].length){
        if(matrix[row][col] == key){
           System.out.println("found at cell (" + row + ", " + col + ")");
           return;
        }
        else if(key < matrix[row][col]){
            row--;
        }
        else{    //key > matrix[row][col]
            col++;
        }
    }
    System.out.println("key not found");
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