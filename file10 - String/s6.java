public class s6{

    //SUBSTRING
    public static String substring(String str, int si, int ei){
        String substring = "";
        for(int i=si; i<ei; i++){
            substring = substring + str.charAt(i);
        }
        return substring;
    }

    public static void main(String k[]){
        String str = "helloworld";
        System.out.println(substring(str, 0, 5));
        System.out.println(substring(str, 2, 8));

        //Inbuilt substring function -- [stringname.substring(si, ei)]
        System.out.println(str.substring(0, 5));
    }
}