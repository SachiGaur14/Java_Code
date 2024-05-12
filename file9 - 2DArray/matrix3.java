public class matrix3{

    //SPIRAL MATRIX
    public static void spiral(int matrix[][]){
        int sr = 0;    //start row
        int sc = 0;    //start column
        int er = matrix.length-1;     //end row
        int ec = matrix[0].length-1;  //end column

        while(sr <= er && sc <= ec){

        for(int j=sc; j<=ec; j++){     //top
            System.out.print(matrix[sr][j] + " ");
        }
        for(int i=sr+1; i<=er; i++){   //right
            System.out.print(matrix[i][ec] + " ");
        }
        for(int j=ec-1; j>=sc; j--){    //bottom
            if(sr == er){
                break;
            }
            System.out.print(matrix[er][j] + " ");
        }
        for(int i=er-1; i>=sr+1; i--){    //left
             if(sc == ec){
                break;
            }
            System.out.print(matrix[i][sc] + " ");
        }
        sr++;
        sc++;
        er--;
        ec--;
        }
        System.out.println();
    }

    public static void main(String[] k){
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8},
                          {9, 10, 11, 12}, {13, 14, 15, 16}};

        spiral(matrix);                  
    }
}