import java.util.*;
public class Stack3{
    
    //STACK BY USING JAVA COLLECTION FRAMEWORK(JCF)
    public static void main(String k[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}