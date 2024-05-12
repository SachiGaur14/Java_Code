public class Oops8{

    //ABSTRACTION -- abstract class
    public static void main(String k[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        System.out.println();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
        c.changecolor();
        System.out.println(c.color);

        Mustang m = new Mustang();
    }
}
abstract class Animal{
    String color;
    Animal(){  //constructor
        color = "brown";   //while object creation parent class' constructor is called first.
        System.out.println("Animal constructor called..");
    }
    void eat(){
        System.out.println("Eats anything");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called..");
    }
    void changecolor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor called..");
    }
    void changecolor(){
        color = "Yellow";
    }
   void walk(){
        System.out.println("Walks on 2 legs");
    } 
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called..");
    }
}