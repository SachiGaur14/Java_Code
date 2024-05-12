public class Oops11{
    public static void main(String k[]){
       Student s1 = new Student();
       s1.name = "Muskan";
       System.out.println(s1.name);

       s1.schoolname = "DPS";    //as it is static so it will be same for all.
       System.out.println(s1.schoolname);

       Student s2 = new Student();
       System.out.println(s2.name);
       System.out.println(s2.schoolname);

       Student s3 = new Student();
       s3.schoolname = "ABC";   //if we change it then it will be changed for all.
       System.out.println(s3.schoolname);
       System.out.println(s2.schoolname);
    }
}

//STATIC KEYWORD
class Student{
    String name;
    int rollno;
    static String schoolname;
}