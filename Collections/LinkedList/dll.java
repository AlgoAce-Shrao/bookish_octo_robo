
//create a self defined data type

class node {
    int data;
    node next, back;

    // constructors
    node(int data, node next, node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class dll {
    private static node arr2Dll(int[] a) {
        node head = new node(a[0]);
        node prev = head;
        for (int i = 1; i < a.length; i++) {
            node temp = new node(a[i], null, prev);
            prev.next = temp;
            prev = prev.next;
        }

        return head;
    }

    private static node deleteHead(node head) {
        // edge cases
        if (head == null || head.next == null && head.back == null)
            return null;
        node temp = head;
        head = head.next;
        head.back = null;
        temp.next = null;
        return head;
    }

    private static node deletetail(node head) {
        // edge case
        if (head == null)
            return null;

        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next.back = null;
        temp.next = null;
        return head;
    }

    private static node deleteatPos(node head, int k) {
        node temp = head;
        int c = 0;
        if (head == null)
            return null;
        while (temp != null) {
            c++;
            if (c == k)
                break;
            temp = temp.next;
        }
        node prev = temp.back;
        node front = temp.next;

        // cases
        if (prev == null && front == null)
            return null;
        else if (prev == null) {
            return deleteHead(head);
        } else if (front == null) {
            return deletetail(head);
        }
        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;

        return head;
    }


    //Insertion

    private static node  inserthead(node head,int data){
        // node temp=new node(data, head, null);   -->using the other constructor
        node temp=new node(data);

        //headcoded code
        temp.next=head;
        head.back=temp;


        head=temp;
        return head;
    }

    private static node insertTail(node head,int data){
        node newnode=new node(data);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.back=temp;
        return head;
    }

    private static node insertBeforeKth(node head,int k,int data){
        if(k==1){
            return  inserthead(head, data);
        }
        node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            if(c==k) break;
            temp=temp.next;
        }
        node prev=null;
        prev=temp.back;
        node newnNode=new node(data,temp,prev);
        prev.next=newnNode;
        temp.back=newnNode;
        return head;

    }
    private static node revDLL(node head){
        if(head==null || head.next==null) return head;
        node current=head,last=null;
        while(current!=null){
            last=current.back;
            current.back=current.next;
            current.next=last;
            current=current.back;
        }
        head=last.back;
        return head;
    }

    private static void print(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }



    public static void main(String[] args) {
        int a[] = { 12, 5, 6, 7 };
        node head = arr2Dll(a);
        // node newhead=deleteHead(head);
        // node newhead=deletetail(head);

        // node newhead = deleteatPos(head, 3);

        // node newhead=inserthead(head, 34);

        // node newhead=insertTail(head, 34);
        // node newhead=insertBeforeKth(head, 4, 69);

        node newhead=revDLL(head);
        print(newhead);

    }
}