//implementation of stack using arrays

public class stImpl {
    static class stack {
        int top = -1;
        int st[] = new int[10]; // taking a static array

        void push(int x) {   //O[1]
            if (top >= st.length)
                System.out.println("Invalid !! No space left");
            top++;
            st[top] = x;
        }

        int pop() {   //O[1]
            if (top == -1) {
                System.out.println("No elemenet exists");
                return 0;
            }
            
            int x=st[top];
            top--;
            return x;
        }

        int top() {    //O[1]
            if (top == -1)
                System.out.println("No elemenet exists");
            return st[top];
        }

        int size() {   //O[1]
            return top + 1;
        }

    }

    //disadvantage with static arrays is thst space is not optimised...like maybe for taking 3 elements we are initialising an array of size 10

    public static void main(String args[]) {
        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
    }
}