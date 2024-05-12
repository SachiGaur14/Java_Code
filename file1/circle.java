import java.util.*;
public class circle{
    public static void main(String k[]){
        // Area of a circle.
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        float area = 3.14f*r*r;  // 3.14f to tell it is a float value because by default it is double.
        System.out.println("area = " + area);
    }
}