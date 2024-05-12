import java.util.*;

class M1{
    public static void number(int n){
        int sum = 0;
        for(int i=1; i<=n/2; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(n == sum){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static void main(String k[]){
        Scanner sc = new Scanner(System.in);
         
        while(sc.hasNextLine()){
            String m = sc.nextLine();
            int n = Integer.parseInt(m);
            number(n);
        }
    }
}