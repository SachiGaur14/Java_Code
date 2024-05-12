import java.util.*;

public class largest{
    public static void main(String k[]){
       
       //to find largest from 2 numbers.
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       if(a > b){
        System.out.println("largest is : " + a);
       }
       else{
        System.out.println("largest is : " + b);
       }
    }
}