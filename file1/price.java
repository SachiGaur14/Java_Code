import java.util.*;

public class price{
    public static void main(String k[]){
        //calculating bill

        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pencil + pen + eraser;
        System.out.println("Total bill is : " + bill);

        // adding GST
       float GST = bill * 0.18f;
       bill += GST;
       System.out.println("With GST : " + bill);

    }
}