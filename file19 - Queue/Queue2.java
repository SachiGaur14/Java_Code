public class Queue2{

    //CIRCULAR QUEUE USING ARRAY
    public static class Newqueue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Newqueue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

    public static boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    public static boolean isFull(){
        return (rear+1)%size == front;
    }

    //add (from rear end)
    public static void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear + 1)%size;
        arr[rear] = data;
    }
    //remove (from front end)
    public static int remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        int result = arr[front];
        if(rear == front){  //last element
            rear = front = -1;
        }
        else{
            front = (front+1)%size;
        }
        return result;
    }
    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        } 
        return arr[front];  //return front
    }
    }

    public static void main(String k[]){
        Newqueue q = new Newqueue(3);
        q.add(1);
        q.add(2);
        q.add(3);   //1 2 3
        System.out.println(q.remove());  //1
        q.add(4);   //2 3 4
        System.out.println(q.remove());  //2
        q.add(5);   //3 4 5

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
