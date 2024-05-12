import java.util.*;
public class input{
    public static void main(String k[]){
        // to take input from user.
        Scanner sc = new Scanner(System.in);
        String input = sc.next();  // stop taking input after space.
        System.out.println(input);

        Scanner sca = new Scanner(System.in);
        String in = sca.nextLine(); // to input spaces also.
        System.out.println(in);

        int number = sc.nextInt(); // to input integers.
        System.out.println(number);

        float price = sc.nextFloat(); // to input float values.
        System.out.println(price);

    }
}