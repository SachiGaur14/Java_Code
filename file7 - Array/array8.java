public class array8 {

    //SUBARRAYS
    public static void subarray(int num[]){
        int totalsubarray = 0;
        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(num[k] + " ");
                }
                totalsubarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no. of subarrays are : " + totalsubarray);
    }

    public static void main(String k[]){
        int num[] = {2, 4, 6, 8, 10};
        subarray(num);
    }
}
