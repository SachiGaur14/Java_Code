public class Backtracking3{

    //PERMUTATION
    public static void permutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //str
            String newstr = str.substring(0, i) + str.substring(i+1);   //exclude i index element
            //ans
            permutation(newstr, ans + curr);
        }
    }

    public static void main(String k[]){
        String str = "abc";
        permutation(str, "");
    }
}