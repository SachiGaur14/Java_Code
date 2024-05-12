public class s8{

    //STRINGBUILDER -- BY THIS WE CAN MODIFY STRINGS.
    //.toString() function -- to convert to string.
    //.append() -- to add after string.

    public static void main(String []k){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
         System.out.println(sb.length());
    }
}