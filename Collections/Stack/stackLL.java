//implementation of stack using linked list

public class stackLL {
    private class stackNode{
        int data;
        stackNode next;
        public stackNode(int data) {
            this.data = data;
            this.next=null;
        }
        
    }

    stackNode top;
    int size=0;
    //operations
    void push(int x){
        stackNode temp=new stackNode(x);
        temp.next=top;
        top=temp;
        size++;
    }

    public int pop(){
        if(top==null)  return -1;
        int topdata=top.data;
        top=top.next;
        size--;
        return topdata;
    }

    public int top(){
        if(top==null) return -1;
        return top.data;
    }

    public int stackSize(){
        return size;
    }

    public boolean stackIsEmpty(){
        return top==null;
    }

    void printStack(){
        //just like traversing a ll and printign the values 

        stackNode temp=top;
        while(temp!=null){
            System.out.print(temp.data+" -- ");
            temp=temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String args[]){
        stackLL s = new stackLL();
        s.push(10);
        s.push(20);
        s.push(30);  // Added another element for better testing
        
        System.out.print("Stack: ");
        s.printStack();
        System.out.println();
        
        System.out.println("Element popped: " + s.pop());
        System.out.println("Stack size: " + s.stackSize());
        System.out.println("Stack is empty: " + s.stackIsEmpty());
        
        System.out.print("Stack after pop: ");
        s.printStack();
        System.out.println();
        
        System.out.println("Top element: " + s.top());
    }
}
