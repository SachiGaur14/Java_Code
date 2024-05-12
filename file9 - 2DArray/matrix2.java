public class matrix2{

    //TO FIND LARGEST AND SMALLEST ELEMENT IN 2D ARRAY.
    public static void compare(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                largest = Math.max(largest, matrix[i][j]);
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        System.out.println("largest : " + largest);
        System.out.println("smallest : " + smallest);
    }

    public static void main(String k[]){
        int matrix[][] = {{1, 2}, {3, 4}, {5, 6}};
        int m2[][] = {{44, 67}, {67,98}};
        compare(matrix);
        compare(m2);
    }
}