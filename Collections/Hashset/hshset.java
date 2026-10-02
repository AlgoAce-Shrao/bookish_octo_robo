import java.util.HashSet;
import java.util.Iterator;
public class hshset{
    public static void main(String  args[]){
        //Creation
        HashSet<Integer> set=new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);// 1 is stored in the set once...so another time it will not be stored..

        // System.out.println(set);

        // //search
        // if(set.contains(1)){
        //     System.out.println("Set contains 1");
        // }

        // //delete
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("1 is removed");
        // }

        // //size
        // System.out.println("Size of set is :"+set.size());

        //iterator
        Iterator it=set.iterator();
        while(it.hasNext()){//.hasNext checks if any element is present after the preesnt element
            System.out.println(it.next());//it returns the value of the next value of the Set
        }

    }
}