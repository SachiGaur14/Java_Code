import java.util.*;
public class Stack9{

    //VALID PARENTHESIS
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch =='(' || ch =='{' || ch =='['){  //opening bracket
                s.push(ch);
            }
            else{
                if(s.isEmpty()){  // no opening bracket
                    return false;
                }
                //closing brackets
                if((s.peek() == '(' && ch ==')') || (s.peek() =='{' && ch =='}') || (s.peek() =='[' && ch ==']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String k[]){
        String str = "({})[]";
        System.out.println(isValid(str));

        String str2 = "(({})[]";
        System.out.println(isValid(str2));
    }
}