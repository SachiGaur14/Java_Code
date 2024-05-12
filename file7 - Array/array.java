import java.util.*;
public class array{

    //ARRAY
    public static void main(String k[]){
        int marks[] = new int[10];

        //input array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        //output array
        System.out.println("physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        //update array
        marks[2] = 100;
        System.out.println("correct marks of Maths : " + marks[2]);

        //length of array
        System.out.println("length of array : " + marks.length);
    }
}