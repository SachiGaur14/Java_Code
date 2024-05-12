public class Oops1{
    // class name by convention starts with capital letter.
    //method name starts with small letter.
    //public class before other classes.
    //by default main function must be public static.

    public static void main(String k[]){
        //classname objectname = new class()

        Pen p1 = new Pen();  //created a pen object called p1.
        p1.setcolor("Blue");  // dot operator to access function or properties of object.
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);

        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

class Pen{
    //properties of class
    String color;    
    int tip;

    //functions of class
    void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}