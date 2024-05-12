import java.util.ArrayList;
public class Arraylist4{

    //MULTIDIMENSIONAL ARRAYLIST
    public static void main(String k[]){
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);  list.add(2);
        main.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);  list2.add(4);  list2.add(5);
        main.add(list2);

        for(int i=0; i<main.size(); i++){
            ArrayList<Integer> currlist = main.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(main);
    }
}