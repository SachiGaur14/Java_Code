import java.util.*;

    class A<T>{
    
        void sum(T a, T b){
            T c = a + b;
            System.out.println(c);
        }
    }

    public class M3{
        public static void main(String[] k){
        A<Integer> a = new A<>();
        a.sum(4, 3);
        A<String> b = new A<>();
        b.sum("ab", "cd");
        }
    }
