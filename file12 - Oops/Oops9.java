public class Oops9{

    //INTERFACES
    public static void main(String k[]){
        Queen q = new Queen();
        q.moves();
    }
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal in all 4 drx");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up, down, right, left");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal by 1 step");
    }
}