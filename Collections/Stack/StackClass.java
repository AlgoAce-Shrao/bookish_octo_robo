//Implementation of stack as LinkedList
public class StackClass{
    static class Node{
        int data;
        Node next;
        //create a node function
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static  class Stack{
         public static Node head;
        public static  void push(int data){//the top of the stack is the head in linked list 
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public static  int  pop(){
            if(head==null){
                System.out.println("Stack is empty");
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static  int peek(){//gives the value of the head or top of stack
            if(head==null)
            {
                System.out.println("Stack is empty");
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(s.head!=null){
            System.out.println(s.peek());
            s.pop();//deletes the top element
        }
    }
}