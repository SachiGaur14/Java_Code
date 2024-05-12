import java.util.*;

public class largestof3{
    public static void main(String k[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b){
            if(a > c){
                System.out.println("Largest number is : " + a);
            }
            else{
                System.out.println("Largest number is : " + c);
            }
        }
        else{
            if(b > c){
                System.out.println("Largest number is : " + b);
            }
            else{
                System.out.println("Largest number is : " + c);
            }
        }
    }
}