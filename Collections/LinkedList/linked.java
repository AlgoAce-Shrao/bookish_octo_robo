import java.util.*;
class linked{
    public static void main(String args[]){
        LinkedList<String> ls=new LinkedList<String>();
        ls.addFirst("a");
        ls.addFirst("is");
        ls.addFirst("This");
        ls.add("Fucking");//add by default adds to the last of the list...but it follows sequence of use...note it by switching the lines up and down
        ls.addLast("List");
        System.out.println(ls);

        System.out.println(ls.size());

        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i)+"->");
        }
        System.out.println("NULL");

        //deletefirst
        // ls.removeFirst();
        // System.out.println(ls);

        ls.remove(3);
        System.out.println(ls);

        

    }
}