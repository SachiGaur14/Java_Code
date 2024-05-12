public class Backtracking5{

    //N-QUEENS  --- counting all the possible ways.
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

    public static void nqueens(char board[][], int row){
        if(row == board.length){
            //print(board);
            count++;
            return;
        }
        for(int j=0; j<board.length; j++){
            if(safe(board, row, j)){
               board[row][j] = 'Q';
               nqueens(board, row+1);
               board[row][j] = 'X';    //backtracking step
            }    
        }
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
        nqueens(board, 0);
        System.out.println("Total ways to solve n queens = " + count); 
    }
}