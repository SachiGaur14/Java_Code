public class s11{

//STRING COMPRESSION BY STRINGBUILDER.
 public static String compression(String str){
        StringBuilder newstr = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count>1){
                newstr.append(count.toString());
            }
        }
        return newstr.toString();
    }

public static void main(String k[]){
     String str = "aaabbcccdd";
     System.out.println(compression(str));
 }
}

