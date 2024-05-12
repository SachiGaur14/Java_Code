import java.util.*;

public class taxcalculator{
    public static void main(String k[]){
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax;
        if(income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = income * (0.2f);   //20%
        }
        else{
            tax = income * (0.3f);   //30%
        }
        System.out.println("Tax : " + tax);

    }
}