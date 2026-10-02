
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class brute{
    //T.C.: O[n^2]
    public static  int brute(int a[]){
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==a[i]) c++;
            }
            if(c>a.length/2) return a[i];
        }
        return -1;
    }
}
class better1{
    //hashing
    public static int better1(int a[]){
        HashMap<Integer,Integer> mp=new HashMap<>();
        //storing the elements of the array in the hashmap
        for(int i=0;i<a.length;i++){
            int val=mp.getOrDefault(a[i], 0);
            mp.put(a[i],val+1);
        }
        //searching the majority element
        for(Map.Entry<Integer,Integer> m: mp.entrySet()){
            if(m.getValue()>a.length/2) return m.getKey();
        }
        return -1;
    }
}
class better2{
    //T.C.: O[nlog n]-->sorting takes n log n complexity
    //not applicable for all but good for the easy level one
    public static int better2(int a[]){
        Arrays.sort(a);
        return a[a.length/2];
    }
}
class optimal{
    //moore's voting algo
    //T.C.: O[2n]
    public static int optimal(int a[]){
        int ele=0,cnt=0;
        for(int i=0;i<a.length;i++){
            if(cnt==0){
                cnt=1;
                ele=a[i];
            }
            else if(a[i]==ele){
                cnt++;
            }
            else cnt--;
        }
        int cnt1=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==ele) cnt1++;
        }
        if(cnt1>(a.length/3)) return ele;
        else
        return -1;
    }
}
public class majority {
    public static void main(String[] args) {
        // int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int arr[]={1};
        int ans = optimal.optimal(arr);
        System.out.println("The majority element is: " + ans);
    }
}
