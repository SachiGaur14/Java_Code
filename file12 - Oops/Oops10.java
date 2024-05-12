public class Oops10{
    public static void main(String k[]){
       Bear b = new Bear();
       b.eatgrass();
       b.eatmeat();
    }
}

//MULTIPLE INHERITANCE BY USING INTERFACE.
interface Herbivore{
    void eatgrass();
}

interface Carnivore{
    void eatmeat();
}

class Bear implements Herbivore, Carnivore{
    public void eatgrass(){
        System.out.println("Eats grass");
    }
    public void eatmeat(){
        System.out.println("Eats meat");
    }
}