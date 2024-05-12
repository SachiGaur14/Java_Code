import java.util.ArrayList;
public class Arraylist{

    //ARRAYLIST -- inbuilt data structure in java.(dynamic size)
    //same as Vectors in c++.
    //Java collection framework -- collection of classes & interfaces 
    //that help in using inbuilt data structures in java.  like - arraylist.
    public static void main(String k[]){
       ArrayList<Integer> name = new ArrayList<>();
       ArrayList<String> name2 = new ArrayList<>();
       ArrayList<Float> name3 = new ArrayList<>();
       ArrayList<Boolean> name4 = new ArrayList<>();

       //Operations on arraylist
       //add given element
       name.add(1);
       name.add(2);
       name.add(3);
       name.add(4);
       name.add(5);
       System.out.println(name);

       name.add(2,10);   //(index, element)
       System.out.println(name);

       //get element from the given index
       System.out.println(name.get(3));

       //remove element from given index
       name.remove(4);
       System.out.println(name);

       //set element(index, element)
       name.set(2, 0);
       System.out.println(name);

       //contains -- return true or false and tells element exist or not.
       System.out.println(name.contains(5));
       System.out.println(name.contains(15));

       //.size() method
       System.out.println(name.size());

       //to print arraylist using size method
       for(int i=0; i<name.size(); i++){
        System.out.print(name.get(i) + " ");
       }
       System.out.println();
    }
}