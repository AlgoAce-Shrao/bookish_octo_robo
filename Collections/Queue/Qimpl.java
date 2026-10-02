//implementation of queue using arrays

public class Qimpl{
    private int a[];
    int start,end,currSize,maxSize;
    public  Qimpl(){
        int a[]=new int[10];  //lets take it as 10 as of now
        start=-1;
        end=-1;
        currSize=0;

    }

    public Qimpl(int maxSize){
        this.maxSize=maxSize;
        a=new int[maxSize];  //lets take it as 10 as of now
        start=-1;
        end=-1;
        currSize=0;
        
    }

    void push(int n){ //enquque operation
        if(currSize>=maxSize-1) {
            System.out.println("The queue is full");
        }
        if(currSize==0){
            start++;
            end++;
        }
        else end=(end+1)% maxSize;

        a[end]=n;
        currSize++;
    }

    int pop(){   //dequeue operation
        if(currSize==0){
            System.out.println("Queue empty");
        }
        int x=a[start];
        if(currSize==1){
            start=-1;
            end=-1;
        }
        else {
            start=(start+1)%maxSize;
        }
        currSize--;
        return x;
    }

    int top(){
        if(currSize==0) {
            System.out.println("Queue empty");
            return -1;
        }
        else
        return a[start];
    }
    int size(){
        return currSize;
    }

    public static void main(String[] args) {
        Qimpl q = new Qimpl(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size()); 

    }
}