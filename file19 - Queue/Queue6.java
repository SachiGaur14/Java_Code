import java.util.*;
public class Queue6{

    //STACK USING 2 QUEUES
    public static class Stack{
        public static Queue<Integer> q1 = new LinkedList<>();
        public static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        //push
        public static void push(int data){
            if(!q1.isEmpty()){  // q1 is not empty
                q1.add(data);
            }
            else{
                q2.add(data);
            }
        }

        //pop
        public static int pop(){
            if(isEmpty()){
               System.out.println("Stack is empty");
               return -1;
            }
            int top = -1;
            if(!q1.isEmpty()){  //q1 has elements
              while(!q1.isEmpty()){
                top = q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
              }
            }  
            else{   //q2 has elements
              while(!q2.isEmpty()){
                top = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
              }
            }  
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
               System.out.println("Stack is empty");
               return -1;
            }
            int top = -1;
            if(!q1.isEmpty()){  //q1 has elements
              while(!q1.isEmpty()){
                top = q1.remove();
                q2.add(top);
              }
            }  
            else{   //q2 has elements
              while(!q2.isEmpty()){
                top = q2.remove();
                q1.add(top);
              }
            }  
            return top;
        }
    }

    public static void main(String k[]){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);   //stack - LIFO
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}