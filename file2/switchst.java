import java.util.*;

public class switchst{
    public static void main(String k[]){
        // Calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();

        System.out.println("Enter b : ");
        int b = sc.nextInt();
        
        System.out.println("Enter operator : ");
        char operator = sc.next().charAt(0); // to read a character.

        System.out.println("Result : ");
        switch(operator){
            case '+' : System.out.println(a+b);
                       break;
            case '-' : System.out.println(a-b);
                       break;
            case '*' : System.out.println(a*b);
                       break;
            case '/' : System.out.println(a/b);
                       break;
            case '%' : System.out.println(a%b); 
                       break;
            default : System.out.println("Invalid operation"); 
        }
    }
}