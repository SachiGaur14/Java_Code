public class s7{

    //LARGEST STRING
    //str1.compareTo(str2) function -- lexicographic comparison. 
    public static void main(String []k){
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}