import java.util.*;

public class Stack6{
    //REVERSE A STACK

    public static void pushatbottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushatbottom(s, top);
    }

    public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }

    public static void main(String k[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3-2-1
        reverseStack(s);
        print(s);
        //1-2-3
    } 
}