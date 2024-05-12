public class array6 {

    //REVERSE AN ARRAY.
    public static void reverse(int num[]){
        int first = 0, last = num.length-1;
        while(first < last){
            int temp = num[last];
            num[last] = num[first];
            num[first]  = temp;
            first++;
            last--;
        }
    }
    public static void main(String k[]){
        int number[] = {1, 2, 3, 4, 5};
        reverse(number);
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
    }
    
}
