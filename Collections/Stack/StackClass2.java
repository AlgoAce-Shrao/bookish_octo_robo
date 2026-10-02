
import java.util.ArrayList;
import java.util.List;

public class StackClass2{
    static class Stack{
        ArrayList<Integer> list = new ArrayList<Integer>();
        public Boolean isEmpty() {
            return list.isEmpty();
        }

        //push-->it adds the elements to the stack
        public void  push(int data){
            list.add(data);
            // return data;
        }

        //pop-->ot deletes the top value ad return it as well
        public void pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }
            list.getLast();
            list.removeLast();
        }

        //peek-->returns the value of the top of the stack
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }
            int top=list.getLast();
            return top;
        }

    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}