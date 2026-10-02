//practice of linked list sccratch code
class ll{
    static Node head;
    class Node{
        static String data;
        static Node next;
        //node creation
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //add-first
    public  void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add-last
    public void addLast(String data){
        Node newNode=new Node(data);
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }

    //print
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.println(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]){
        ll lst=new ll();
        lst.addFirst("am");
        lst.addFirst("I");
        lst.printList();
    }
}