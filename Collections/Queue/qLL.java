import java.util.*;

class QueueNode
{
    int val;
    QueueNode next;
    QueueNode(int data)
    {
       val = data;
       next = null;
    }
}  


class Queue
{
    QueueNode start = null, end = null;
    int size = 0;

boolean Empty()
{
    return start == null;
}  
int Peek()
{
    if(Empty())  
     {  System.out.println("Queue is Empty");
        return -1;
     } 
    else 
      return start.val;
}   
void Enqueue(int value)
{
    QueueNode Temp;
    Temp = new QueueNode(value); 
    if (Temp == null)  //When heap exhausted 
        System.out.println("Queue is Full");
    else
    {
        if (start == null)
        {
            start = Temp;
            end = Temp;
        } 
        else
        {
            end.next = Temp;
            end = Temp;
        }
        System.out.println(value+" Inserted into Queue ");
        size++;
    } 
}      
void Dequeue() 
{
    if (start == null) 
        System.out.println("Queue is Empty");
    else
    { 
        System.out.println(start.val+" Removed From Queue");
        QueueNode Temp = start;
        start = start.next;
        size--;
    }  
}  
public static void main(String args[])

{
    Queue Q=new Queue();
    Q.Enqueue(10);
    Q.Enqueue(20);
    Q.Enqueue(30);
    Q.Enqueue(40);
    Q.Enqueue(50);
    Q.Dequeue();
    System.out.println("The size of the Queue is "+Q.size);
    System.out.println("The Peek element of the Queue is "+Q.Peek());
}
}   