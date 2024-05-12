public class num{
    public static void main(String k[]){

        // to print all odd numbers.
        System.out.println("Odd numbers are : ");
        for(int i=1; i<=10; i++){
            if(i%2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // even numbers.
        System.out.println("Even numbers are : ");
        for(int i=1; i<=10; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}