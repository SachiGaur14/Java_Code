public class Tries6{

    //LONGEST WORD WITH ALL PREFIXES
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;   //End of word

        public Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    //insert  
    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static String ans = "";

    public static void longestword(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestword(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);  //backtrack
            }
        }
    }

    public static void main(String k[]){
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }
        longestword(root, new StringBuilder(""));
        System.out.println(ans);
    }
}