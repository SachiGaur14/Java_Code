public class Oops3{

    //CONSTRUCTOR  -- can be multiple in a class.
    public static void main(String k[]){
        Student s1 = new Student("Sachi");  //when we create object constructor is called.
        System.out.println(s1.name);

        Student s2 = new Student();
        Student s3 = new Student(24);
        System.out.println(s3.rollno);
    }
}

class Student{
    String name;
    int rollno;

    Student(String name){  //constructor
       this.name = name;
    }

    Student(){   //non-parameterized constructor
       System.out.println("constructor is called.");
    }

    Student(int rollno){  //parameterized constructor
        this.rollno = rollno;
    }
}