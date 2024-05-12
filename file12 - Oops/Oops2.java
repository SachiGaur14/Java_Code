public class Oops2{

    //GETTER AND SETTERS.
    
    public static void main(String k[]){
        Pen p1 = new Pen();  
        p1.setcolor("Blue");  
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());

        p1.setcolor("Yellow");
        System.out.println(p1.getcolor());
    }
}

class Pen{
    private String color;    //private -- not accessible outside class.
    private int tip;

    String getcolor(){      //getters
        return this.color;
    }
    int gettip(){
        return this.tip;
    }

    void setcolor(String newcolor){    //setters
        this.color = newcolor;
    }
    void settip(int tip){
        this.tip = tip;     //this keyword refer to the same object.
    }
}
