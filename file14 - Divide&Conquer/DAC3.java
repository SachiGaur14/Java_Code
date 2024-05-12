public class DAC3{
    //SORTED ROTATED ARRAY.

    public static int search(int arr[], int tar, int si, int ei){
        if(si > ei){
            return -1;   //target is not in array
        }
        int mid = si + (ei-si)/2;
        if(arr[mid] == tar){
            return mid;
        }
        
        if(arr[si] <= arr[mid]){     //line 1
           if(arr[si] <= tar && tar <= arr[mid]){    //left
              return search(arr, tar, si, mid-1);
           }
           else{
              return search(arr, tar, mid+1, ei);   //right
           }
        }

        else{    //line 2
            if(arr[mid] <= tar && tar <= arr[ei]){   //right
               return search(arr, tar, mid+1, ei);
            }
            else{
               return search(arr, tar, si, mid-1);  //left
            }
        }
    }

    public static void main(String k[]){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int taridx = search(arr, target, 0, arr.length-1);   //target index
        System.out.println(taridx);
    }
}