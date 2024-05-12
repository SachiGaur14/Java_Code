import java.util.*;

public class printn{
  public static void main(String k[]){

     // print 1 to n numbers.
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int i=1;
    
     while(i <= n){
        System.out.print(i +" ");
        i++;
     }
    }
}