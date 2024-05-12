import java.util.*;
public class Stack8{

    //NEXT GREATER ELEMENT(in right side)
    public static void main(String k[]){
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextgr[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){   //for left side, change for loop i.e. from 0 to n.
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){  //for next smaller {arr[s.peek()] >= arr[i]}
                s.pop();
            }
            if(s.isEmpty()){
                nextgr[i] = -1;
            }
            else{
                nextgr[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i=0; i<nextgr.length; i++){
            System.out.print(nextgr[i] + " ");
        }
        System.out.println();
    }
}

//OTHER FORMS ARE:
//NEXT GREATER RIGHT OR LEFT
//NEXT SMALLER RIGHT OR LEFT