import java.util.ArrayList;
public class Arraylist5{

    //MULTIDIMENSIONAL ARRAYLIST
    public static void main(String k[]){
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*1);  //12345
            list2.add(i*2);  //246810
            list3.add(i*3);  //3691215
        }
        main.add(list1);
        main.add(list2);
        main.add(list3);
        System.out.println(main);

        for(int i=0; i<main.size(); i++){
            ArrayList<Integer> currlist = main.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
    }
}