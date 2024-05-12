public class Oops4{
    public static void main(String k[]){
        Student s1 = new Student();
        s1.name = "Nancy";
        s1.rollno = 1234;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;

        Student s2 = new Student(s1);  //shallow copy constructor
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);   //changes reflect
        }

        Student s3 = new Student(s1, "xyz");  //deep copy constructor
        s1.marks[2] = 94;
        for(int i=0; i<3; i++){
            System.out.println(s3.marks[i]);  //changes doesn't reflect
        }
    }
}
class Student{
    String name;
    int rollno;
    String password;
    int marks[];

    //shallow copy constructor  
    Student(Student s1){
        marks = new int[3];   //need to write in every constructor.
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks;
    }
    //deep copy constructor.
     Student(Student s1, String password){
        marks = new int[3];  
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.password = password;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
     }
     Student(){   
        marks = new int[3];
       System.out.println("constructor is called.");
    }
}