public class array9 {

    //MAXIMUM SUM OF SUBARRAY (BRUTE FORCE).
    public static void maxsubarray(int num[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                currsum = 0;
                for(int k=start; k<=end; k++){
                    System.out.print(num[k] + " ");
                    currsum = currsum + num[k];
                }
                System.out.println(" = " + currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max sum = " + maxsum);
    }

    public static void main(String k[]){
        int num[] = {2, 4, 6, 8, 10};
        maxsubarray(num);
    }
}
