//We can take the max size of array to be 10^6 (Integer type) in the main method
//and to  10^7  (Integer type) when decleared globally..
//to overcome this problem..we use list..reason is understandable by code and written in copy

import java.util.*;
class hsh_byMap {
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            //input 
            System.out.println("enter the size of the array:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            //pre-compute
            HashMap<Integer,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++){
                int key=arr[i];
                int freq=0;
                if(mp.containsKey(key)) freq=mp.get(key);
                    freq++;
                    mp.put(key, freq);
            
            }
            //iterator
            for(Map.Entry<Integer,Integer> e:mp.entrySet()){
                System.out.println(e.getKey()+" -> "+e.getValue());
            }
            //output:-->this shows that it is sorted ..
                // 1 -> 2
                // 2 -> 2
                // 3 -> 2
                // 12 -> 1
            
            //input queries-->number of times the loop runs..or simply number of elements u wan the freq of
            System.out.println("Enter the number of queries:");
            int q=sc.nextInt();
            while(q-->0){
                //fetch
                System.out.println("Enter the number whose frequency u want to print:");
                int num=sc.nextInt();
                if(mp.containsKey(num))
                    System.out.println("Freq of "+num+"is"+mp.get(num));
                else
                    System.out.println("Freq : 0");

            }
        }

    }
}
