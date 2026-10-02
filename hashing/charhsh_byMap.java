
//to do the character hashing by map implementation
import java.util.HashMap;
import java.util.Scanner;

public class charhsh_byMap {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter teh string;");
            String s=sc.next();
            HashMap<Character,Integer> mp=new HashMap<>();
            for(int i=0;i<s.length();i++){
                int freq=0;
                char c=s.charAt(i);
                if(mp.containsKey(c)) freq=mp.get(c);
                freq++;
                mp.put(c, freq);
            }

            //fetch:
            System.out.println("Enter the queries:");
            int q=sc.nextInt();
            while(q-->0){
                System.out.println("Enter the character whose frequency u want to pritn:");
                char ch=sc.next().charAt(0);
                if(mp.containsKey(ch)){
                    System.out.println("Freq of :"+ch+" is "+mp.get(ch));
                }
                else{
                    System.out.println("Freq :0");
                }
            }


        }
    }
    
}
