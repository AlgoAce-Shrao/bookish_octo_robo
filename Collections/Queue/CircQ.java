//implementation of circular queue using arrays

import java.util.*;

public class CircQ {
    int val, start, end, currSize, maxSize;
    private int cq[];

    public CircQ(int maxSize) {
        this.maxSize = maxSize;
        start = -1;
        end = -1;
        cq = new int[maxSize];
        currSize = 0;
    }

    void push(int x) {
        if ((end + 1) % maxSize == start) {
            System.out.println("Queue is full");
        }
        // empty
        if (start == -1) {
            System.out.println("Queue is empty");

        }

        else
            end = (end + 1) % maxSize;

        cq[end] = x;
        currSize++;

    }

    int pop() {

        if(start==-1){
            System.out.println("Queue is empty");
        }

        
    }

    int top() {
    }

    int size() {
    }

    public static void main(String args[]) {
        CircQ cq = new CircQ(5);
        cq.push(4);
        cq.push(14);
        cq.push(24);
        cq.push(34);
        System.out.println("The peek of the queue before deleting any element " + cq.top());
        System.out.println("The size of the queue before deletion " + cq.size());
        System.out.println("The first element to be deleted " + cq.pop());
        System.out.println("The peek of the queue after deleting an element " + cq.top());
        System.out.println("The size of the queue after deleting an element " + cq.size());
    }
}