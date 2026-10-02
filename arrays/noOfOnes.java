import java.util.HashMap;
import java.util.Map;

class brute{
    //T.C.: O[n^2] || S.C.: O[1]-->since no exrtra space taken
    public static int brute(int a[]){
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]) c++;
            }
            if(c==1) return a[i];
        }
        return 0;
    }
}
class better1{
    public static int better1(int a[]){
        //hashing-->taking hasharray
        //1. find the maximum element of the array..to initialize the size of the hash array
        int maxi=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>maxi) maxi=a[i];
        }
        int hash[]=new int[maxi+1];
        for(int i=0;i<a.length;i++){
            hash[a[i]]++;
        }
        for(int i=0;i<a.length;i++){
            if((hash[a[i]])==1)  return a[i];
        }
        return 0;
    }
}
class better2{
    //check time complexxity in copy
    public static int better2(int a[]){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int c=mp.getOrDefault(a[i], 0);
            mp.put(a[i], c+1);
        }
        for (Map.Entry<Integer,Integer> en : mp.entrySet()) {
            if(en.getValue()==1) return en.getKey();
        }
        return 0;
    }
}
class optimal{
    public static int optimal(int a[]){
        int xor=0;
        for(int i=0;i<a.length;i++){
            xor=xor^a[i];
        }
        return xor;
    }
}
public class noOfOnes{
    public static void main(String [] args){
        int a[]={1,1,2,3,3,4,4};
        System.out.println("Number"+optimal.optimal(a));
    }
}
