import java.util.*;
public class Greedy6{

    //INDIAN COINS
    public static void main(String k[]){
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        //descending order
        Arrays.sort(coins, Comparator.reverseOrder());

        int countofCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countofCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("Total min coins used = " + countofCoins);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}