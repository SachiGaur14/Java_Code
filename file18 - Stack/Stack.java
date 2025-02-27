import java.util.ArrayList;

//STACK USING ARRAYLIST
public class Stack{
    static ArrayList<Integer> list = new ArrayList<>();
    
    public static boolean isempty(){
        return list.size() == 0;
    }
    //push
    public static void push(int data){
        list.add(data);
    }
    //pop
    public static int pop(){
        if(isempty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    //peek
    public static int peek(){   //return value at top
    if(isempty()){
        return -1;
    }
       return list.get(list.size()-1); 
    }

    public static void main(String k[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isempty()){
           System.out.println(s.peek());
           s.pop();
        }
    }
}