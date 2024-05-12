public class ifelse{
    public static void main(String k[]){
        int age = 22;
        if(age >= 18){
            System.out.println("Adult");
        }
        age = 15;
        if(age>12 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}