public class sort6{

    //COUNTING SORT
    public static void countingsort(int ar[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<ar.length; i++){
            largest = Math.max(largest, ar[i]);
        }

        int count[] = new int[largest +1];
        for(int i=0; i<ar.length; i++){
            count[ar[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                ar[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print(int ar[]){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] k){
        int ar[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingsort(ar);
        print(ar);
    }
}