import java.util.*;
public class string{

    //STRINGS ARE IMMUTABLE.(unchangeable, fixed)
    //if we want to make any changes then make a new string, old one can not be changed.
    public static void main(String k[]){
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz@#1");  // includes all characters.

        System.out.println(arr);
        System.out.println(str);
        System.out.println(str2);

        //input string
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.next();   //It takes single word without any spaces.
        System.out.println(name);

        String Name = sc.nextLine();  //words with spaces.
        System.out.println(Name);
    }
}