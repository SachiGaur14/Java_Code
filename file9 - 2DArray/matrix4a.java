public class matrix4a{

    //optimised approach of diagonal sum
    public static int diagonal(int matrix[][]){
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];
            
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
         return sum;
    }

    public static void main(String k[]){
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8},
                          {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(diagonal(matrix)); 
    }
}