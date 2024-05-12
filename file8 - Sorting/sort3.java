public class sort3{

    //INSERTION SORT
    public static void insertionsort(int ar[]){
      for(int i=1; i<ar.length; i++){
        int curr = ar[i];
        int prev = i-1;
        while(prev >= 0 && ar[prev] > curr){  //it is in ascending order
            ar[prev+1] = ar[prev];            // to convert in descending -- ar[prev] < curr.
            prev--;
        }
       ar[prev+1] = curr; 
      }
    }
    public static void print(int ar[]){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] k){
        int ar[] = {5, 4, 1, 3, 2};
        insertionsort(ar);
        print(ar);
    }
}