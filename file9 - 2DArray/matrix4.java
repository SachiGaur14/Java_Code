public class matrix4{

    //SUM OF DIAGONAL ELEMENTS
    public static int diagonal(int matrix[][]){  // when n=m.
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){

                if(i == j){      //primary diagonal
                    sum = sum + matrix[i][j];
                }

                else if(i + j == matrix.length-1){   //secondary diagonal
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] k){
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8},
                          {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(diagonal(matrix));                  
    }
}