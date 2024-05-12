public class Recursion{

    //PRINT NUMBERS IN DECREASING ORDER
    public static void Printdec(int n){
        if(n==1){
            System.out.println("1");
            return ;
        }
        System.out.print(n + " ");
        Printdec(n-1);
    }

    //PRINT IN INCREASING ORDER
    public static void printinc(int n){
        if(n == 1){
            System.out.print("1 ");
            return ;
        }
        printinc(n-1);
        System.out.print(n + " ");
    }

    public static void main(String k[]){
       int n=10;
       Printdec(n);
       printinc(n);
    }
}