public class s4{

    //TO FIND SHORTEST PATH.
    public static float path(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'W'){
                x--;
            }
            else{   //dir==E
                x++;
            }
        }
        int X2 = x*x;    //displacement = sqrt[(x2-x1)sq + (y2-y1)sq]
        int Y2 = y*y;    // x1=0, y1=0

        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String []k){
        String path = "WNEENESENNN";
        System.out.println("Shortest distance = " + path(path));
        String p2 = "NS";
        System.out.println("Shortest distance = " + path(p2));
    }
}