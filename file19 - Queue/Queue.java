public class Queue{

    //QUEUE USING ARRAY
    public static class Newqueue{
        static int arr[];
        static int size;
        static int rear;

        Newqueue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

    public static boolean isEmpty(){
        return rear == -1;
    }
    //add (from rear end)
    public static void add(int data){
        if(rear == size-1){
            System.out.println("Queue is full");
            return;
        }
        rear = rear + 1;
        arr[rear] = data;
    }
    //remove (from front end)
    public static int remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        int front = arr[0];
        for(int i=0; i<rear; i++){
            arr[i] = arr[i+1];
        }
        rear = rear - 1;
        return front;
    }
    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        } 
        return arr[0];  //return front
    }
    }

    public static void main(String k[]){
        Newqueue q = new Newqueue(5);
        q.add(1);
        q.add(2);
        q.add(3);   //1-2-3
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}