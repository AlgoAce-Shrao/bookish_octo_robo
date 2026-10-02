//implementation of hashmap
import java.util.*;
public class HashMapCode{
    static class HashMap<K,V>{ //generics
    //structure of node
        private  class Node{
            K key;
            V value;
            public Node() {
                this.key=key;
                this.value=value;
            }
        }

    //node created

    private int n;//n->number of nodes
    private int N;//N->number of buckets
    private LinkedList<Node> buckets[];//N--> buckets.length

    @SuppressWarnings("unchecked")
    public HashMap(){
        this.N=4;
        this.buckets=new LinkedList[4];
        for( int i=0;i<4;i++){
            this.buckets[i]=new LinkedList<>();
        }
    }

    public void put(K key,V value){
        //step 1->determine bucket index-->by hash function
    }
    }
}