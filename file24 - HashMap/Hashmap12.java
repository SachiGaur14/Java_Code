import java.util.*;
public class Hashmap12{
    
    //LARGEST SUBARRAY WITH SUM 0
    public static void main(String k[]){
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        HashMap<Integer, Integer> map = new HashMap<>();    //(sum, idx)
        
        int sum = 0;
        int length = 0;
        for(int j=0; j<arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                length = Math.max(length, j - map.get(sum));
            }
            else{
                map.put(sum, j);
            }
        }
        System.out.println("Length of largest subarray with sum 0 = " + length);
    }
}