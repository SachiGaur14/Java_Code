public class Recursion9{

    //REMOVE DUPLICATES FROM STRING
    public static void removeduplicate(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){   //duplicate
            removeduplicate(str, idx+1, newstr, map);
        }
        else{
            map[currchar - 'a'] = true;
            removeduplicate(str, idx+1, newstr.append(currchar), map);
        }
    }

    public static void main(String k[]){
        String str = "appnnacollege";
        removeduplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}