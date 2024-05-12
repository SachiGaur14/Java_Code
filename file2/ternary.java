import java.util.*;

public class ternary{
    public static void main(String k[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // ternary operator
        //to check number is even or odd.
       String type = ((number%2) == 0) ? "Even" : "Odd";
       System.out.println("Number : " + type);

       // to check if student is pass or fail.
       int marks = sc.nextInt();
       String result = (marks >= 33) ? "Pass" : "Fail";
       System.out.println("result : " + result);
    }
}