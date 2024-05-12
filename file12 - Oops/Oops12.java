public class Oops12{
    public static void main(String k[]){
       Horse h = new Horse();
       System.out.println(h.color);
       Animal a = new Animal();
       System.out.println(a.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called.");
    }
}

//SUPER KEYWORD
class Horse extends Animal{
    Horse(){
        super();   //calls immediate parent class constructor.
        super.color = "Brown";  // by this we can access parent class property.
         System.out.println("Horse constructor called.");
    }
}