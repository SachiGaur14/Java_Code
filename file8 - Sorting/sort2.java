public class sort2{

    //SELECTION SORT
    public static void selectionsort(int ar[]){
        for(int i=0; i<ar.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<ar.length; j++){
                if(ar[minpos] > ar[j]){   //ascending order
                    minpos = j;           // for descending order ar[minpos]< ar[j].
                }
            }
            int temp = ar[minpos];
            ar[minpos] = ar[i];
            ar[i] = temp;
        }
    }
    public static void print(int ar[]){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String []k){
        int ar[] = {5, 4, 1, 3, 2};
        selectionsort(ar);
        print(ar);
    }
}