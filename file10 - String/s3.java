public class s3{
    //TO CHECK IF STRING IS PALINDROME OR NOT.

    public static boolean palindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String []k){
        String str = "racecar";    //madam, noon.
        String str1 = "Hello";
        System.out.println("Is the string palindrome ?");
        System.out.println(str + " = " + palindrome(str));
        System.out.println(str1 + " = " + palindrome(str1));
    }
}