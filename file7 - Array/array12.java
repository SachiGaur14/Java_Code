public class array12 {

    //TRAPPING RAINWATER
    public static int trappedwater(int height[]){
        int n = height.length;

        int leftmax[] = new int[n];  //Auxiliary array
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        int rightmax[] = new int[n];  //Auxiliary array
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        int trappedwater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            int water = waterlevel - height[i];
            trappedwater += water;
        }
        return trappedwater;
    }

    public static void main(String k[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped RainWater = " + trappedwater(height));
    }
}
