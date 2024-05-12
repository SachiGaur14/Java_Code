public class s5{
    public static void main(String []k){
        //string equality or comparison.
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        if(s1==s2){
            System.out.println("yes");
        }
        else{
             System.out.println("No");  
        }
        if(s1==s3){
            System.out.println("yes");
        }
        else{
             System.out.println("No");  
        }

        // .equals() -- boolean type function.
        if(s1.equals(s3)){    // check only string value.
            System.out.println("true");
        }
        else{
            System.out.println("False"); 
        }
    }
}