public class Oops7{
    public static void main(String k[]){
       Deer d1 = new Deer();
       d1.eat();
       Animal a1 = new Animal();
       a1.eat();
    }
}

//METHOD OVERRIDING -- same function in different classes with different definition
class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}
class Deer extends Animal{  //inheritance
    void eat(){
        System.out.println("Eats grass");
    }
}