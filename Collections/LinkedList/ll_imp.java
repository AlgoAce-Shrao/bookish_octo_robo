
import java.util.Scanner;

class node {
    int data;
    node next;

    // initialise the node
    node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ll_imp {
    private static node convertarr2ll(int[] a) {
        // array to ll
        node head = new node(a[0]);
        node mover = head;
        for (int i = 1; i < a.length; i++) {
            node temp = new node(a[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void traverse(node head) { // -->O[n]
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    private static int lengthofLL(node head) { // -->O[n]
        node temp = head;
        int c = 0;
        while (temp != null) {
            temp = temp.next;
            c++;
        }
        return c;
    }

    private static int checkIfPresent(node head, int ele) { // seraching -->O[n] W.C ....O[1] (B.C-->searhed number is
                                                            // head only) ... O[n/2] Average case
        node temp = head;
        while (temp != null) {
            if (temp.data == ele)
                return 1;
            temp = temp.next;
        }
        return 0;
    }

    private static void removeshead(node head) { // will remove head asnd print the new ll
        // edge case
        if (head == null)
            System.out.println(head);
        head = head.next;
        // return head;
        print(head);

    }

    private static void removetail(node head) {
        if (head == null || head.next == null)
            System.out.print("Null");
        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        print(head);
    }

    private static void deleteAtPos(node head, int k) {
        if (head == null)
            System.out.println("Null");

        if (k == 1) {
            // node temp=head;
            head = head.next;
            // return head;
        }

        node temp = head, prev = null;
        // int cnt=0;
        // while(temp!=null){
        // if(cnt==k){
        // prev.next=prev.next.next;
        // break;
        // }
        // cnt++;

        // prev=temp;
        // temp=temp.next;
        // }


        // this is better code bhadwe
        int cnt = 0;
        while (temp != null) {
            if (cnt == k)
                break;
            prev = temp;
            temp = temp.next;
            cnt++;
        }
        prev.next = temp.next;
        temp.next = null;

        print(head);
    }

    private static void deletebyValue(node head, int ele) {
        if (head == null)
            System.out.println("Null");

        if (head.data == ele) {
            // node temp=head;
            head = head.next;
            // return head;
        }

        node temp = head, prev = null;
        // while (temp != null) {
        //     if (temp.data == ele) {
        //         prev.next = prev.next.next;
        //         break;
        //     }

        //     prev = temp;
        //     temp = temp.next;
        // }

        while(temp!=null){
            if(temp.data==ele){
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        temp.next=null;

        print(head);
    }

    private static void insertAtHead(node head) {
        node temp = new node(100);
        temp.next = head;
        head = temp;
        print(head);
    }

    private static void insertAtEnd(node head) {
        node temp = head;
        if (head == null) {
            System.out.println(new node(69));
        }
        node newNode = new node(69);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        print(head);

    }

    private static void insertAtPos(node head, int k) {
        if (head == null) {
            if (k == 1)
                System.out.println(new node(01));
            else
                System.out.println("Error ..can't add node");
        }

        if (k == 1) {
            node temp = new node(01);
            temp.next = head;
            head = temp;
        }

        node temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            if (c == k - 1) {
                node newNode = new node(01);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        print(head);
    }

    private static void insertbyVAl(node head, int data) { // need to insert an element before the node having the value
        if (head == null) {
            System.out.println("No value brother");
        }

        if (head.data == data) {
            System.out.println(new node(377));
        }

        node temp = head;
        while (temp != null) {
            if (temp.next.data == data) {
                node newNode = new node(377);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        print(head);
    }

    private static void print(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String args[]) {
        int a[] = { 3, 5, 6, 7 };
        Scanner sc = new Scanner(System.in);
        node head = convertarr2ll(a);
        // System.out.print(head.data);

        // traversing in a LL
        // traverse(head);
        // System.out.println("Length of ll:"+lengthofLL(head));

        // chck if element is present in the ll or not
        // System.out.println("Enter the number to be searched:");
        // int n=sc.nextInt();

        // System.out.println(checkIfPresent(head, n));

        // removeshead(head);
        // removetail(head);
        // System.out.println("Enter teh position where u want to delete the node");
        // int k = sc.nextInt();
        // deleteAtPos(head, k);

        System.out.println("Enter teh value which u want to delete the node");
        int ele=sc.nextInt();
        deletebyValue(head, ele);

        // insertAtHead(head);
        // insertAtEnd(head);

        // insertAtPos(head, 3);
        // insertbyVAl(head, 6);

    }
}
