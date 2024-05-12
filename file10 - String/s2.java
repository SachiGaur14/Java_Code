import java.util.*;
public class s2{
    public static void main(String k[]){
        //STRING LENGTH
        Scanner sc = new Scanner(System.in);
        String full = "Hello World";
        System.out.println(full.length());

        //STRING CONCATENATION -- to add.
        //adding multiple strings to form one string.
        String first = "Nancy";
        String last = "Gaur";
        String fullname = first + " " + last;
        System.out.println(fullname);  

        //charAt() function.
        System.out.println(last.charAt(0));
        System.out.println(first.charAt(4));
        
        for(int i=0; i<fullname.length(); i++){
            System.out.print(fullname.charAt(i) + " ");
        }
    }
}