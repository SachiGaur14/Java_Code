public class array2{

    //LINEAR SEARCH
    public static int search(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
     
     public static void main(String k[]){
         int number[] = {2, 4, 6, 8, 10, 12, 14};
         int key = 11;
         int index = search(number, key);
         if(index == -1){
            System.out.println("Not found");
         }
         else{
            System.out.println("index of number : " + index);
         }

     }
}