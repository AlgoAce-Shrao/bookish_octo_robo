//Queue implementation using array
public class Qu{
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        // static int front=-1;

         Queue(int size) {
            arr=new int[size];
            this.size=size;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        //enqueue
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //dequeue--O[n]
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek->get the value of the front --O[n]
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Size of queue:"+q.size);
        // System.out.println(q.peek());

        System.out.println("Printing all the elements of the queue");
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}