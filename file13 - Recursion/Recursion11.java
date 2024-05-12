public class Recursion11{

    //PRINT BINARY STRING --like "00101" but without consecutive 1s.
    public static void printbinstr(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return ;
        }
        printbinstr(n-1, 0, str+"0");
        if(lastplace == 0){
            printbinstr(n-1, 1, str+"1");
        }
    }

    public static void main(String k[]){
        printbinstr(3, 0, "");
    }
}