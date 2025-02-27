public class Tries{
    
    //TRIES IMPLEMENTATION
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;   //End of word

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();

    //insert  -- O(L) where L is length of the largest word.
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

    //search
    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    public static void main(String k[]){
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("thee"));
        System.out.println(search("thor"));
    }
}