public class CircularQueue{
    static class CQue{
        static int data;
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;

        CQue(int size) {
            arr=new int[size];
            this.size=size;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        // enqueue-->add->O[1]
        public static void add(int data){
            if(isFull()){
                System.out.println("Full queue");
                return;
            }
            //1st element add
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //dequeue-->
        public static void remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return;
            }
            front++;
            arr[front]=data;
        }
        
        //peek-->
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            rear=(rear+1)%size;
            return  arr[rear];
        }
    }
    public static void main(String args[]){
        CQue cq=new CQue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        // cq.add(6);

        while(!cq.isEmpty()){
            System.out.println(cq.peek());
            cq.remove();
        }
    }
}