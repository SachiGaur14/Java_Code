import java.util.*;
public class PQ2{

    //PRIORITY QUEUES FOR OBJECTS
    static class Student implements Comparable<Student>{   //comparable is an interface
        String name;                                        //it helps in comparing objects
        int rank;                                           //using compareTo() function by overriding
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;     //sort in ascending order acc. to rank
        }
    }

    public static void main(String k[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 7));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}