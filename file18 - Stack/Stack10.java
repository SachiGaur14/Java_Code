import java.util.*;
public class Stack10{

    //DUPLICATE PARENTHESIS
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == ')'){   //closing bracket
                int count = 0;
                while(s.peek() != '('){   //can write [s.pop() != '(']
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;  //duplicate parenthesis
                }
                else{   //found opening pair -- '('  then pop and move to next terms.
                    s.pop();
                }
            }
            else{
                s.push(ch); //opening bracket
            }
        }
        return false;
    }

    public static void main(String k[]){
        //Valid String
       String str = "((a+b))";  //true
       String str2 = "(a-b)";   //false
       System.out.println(isDuplicate(str));
       System.out.println(isDuplicate(str2));
    }
}
