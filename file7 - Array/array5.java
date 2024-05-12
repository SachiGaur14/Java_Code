public class array5 {

    // BINARY SEARCH
    public static int binarysearch(int num[], int key){
        int start = 0;
        int end = num.length - 1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(num[mid] == key){
                return mid;
            }
            if(num[mid]< key){  //right
                start = mid + 1;
            }
            else{  //left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String k[]){
        int number[] = {1, 2, 3, 4, 5, 6};
        int key = 5;
        System.out.println("Key is at index : " + binarysearch(number, key));
    } 
}
