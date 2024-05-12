import java.util.*;

public class oddeven{
    public static void main(String k[]){
         
         //To find if the number is even or odd.
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         if(a % 2 == 0)
         System.out.println("Even"); //single statement then we can ignore {}.
         else
         System.out.println("Odd");
    }
}