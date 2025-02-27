import java.util.ArrayList;
public class Arraylist9{

    //PAIR WHOSE SUM RETURN THE TARGET.(2 pointer approach)
    public static boolean pairsum1(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }

    public static void main(String k[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairsum1(list, target));
        System.out.println(pairsum1(list, 30));
    }
}