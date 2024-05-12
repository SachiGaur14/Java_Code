public class Backtracking6{

    //N-QUEENS  --- checking if solution exist or not.
    static int count = 0;
    public static boolean safe(char board[][], int row, int col){
        for(int i=row-1; i>=0; i--){     //vertically up
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){    //diagonally left up
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){  //diagonally right up
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean nqueens(char board[][], int row){
        if(row == board.length){
            //print(board);
            count++;
            return true;
        }
        for(int j=0; j<board.length; j++){
            if(safe(board, row, j)){
               board[row][j] = 'Q';
               if(nqueens(board, row+1)){
                return true;
               }
               board[row][j] = 'X';    //backtracking step
            }    
        }
        return false;
    }

    public static void print(char board[][]){
        System.out.println("--------chess board---------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String k[]){
        int n=4;
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }

        if(nqueens(board, 0)){           //checking solution exist or not.
            System.out.println("Solution is possible");
            print(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
    }
}