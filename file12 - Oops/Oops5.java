public class Oops5{

    //INHERITANCE
    
    public static void main(String k[]){
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}

//Base / Parent class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

//Derived / Child class / subclass
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}