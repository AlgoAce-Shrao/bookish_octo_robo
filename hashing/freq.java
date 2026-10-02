//to detrermine the highest frequency element 
import java.util.*;
class freq{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter the size of the array:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> mp=new HashMap<>();
            //precompute
            for(int i=0;i<n;i++){
                int key=arr[i];
                int f=0;
                if(mp.containsKey(key)) f=mp.get(key);
                f++;
                mp.put(key,f);
            }
            int maxFrequency = 0;
            int maxFrequencyElement = -1;
            int minFreq=Integer.MAX_VALUE;//By initializing minFreq with Integer.MAX_VALUE, you are setting it to the highest possible integer value. This is often done when you want to find the minimum value in a set of numbers.
            int minFreqElement=-1;
            for(Map.Entry<Integer,Integer> e:mp.entrySet()){
                int cnt=e.getValue();
                int element=e.getKey();
                if(cnt>maxFrequency){
                    maxFrequency=cnt;
                    maxFrequencyElement=element;
                }
                if(cnt<minFreq){
                    minFreq=cnt;
                    minFreqElement=element;
                }
            }
            System.out.println("The highest frequency element is: " + maxFrequencyElement + " with frequency: " + maxFrequency);
            System.out.println("The lowest frequency element is: " + minFreqElement + " with frequency: " + minFreq);
            
        }
    }
}