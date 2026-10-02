// now it will be done using hashmap
import java.util.*;
public class prac{
    public static void main(String args[]){

        //input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();

        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i), 0)+1);
        }

        
        //fetch
        for(Map.Entry<Character,Integer> e:mp.entrySet()){
            System.out.println(e.getKey()+" --> "+e.getValue());
        }


    }
}