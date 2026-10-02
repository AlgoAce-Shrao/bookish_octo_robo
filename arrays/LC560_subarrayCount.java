
import java.util.HashMap;

class brute{
    //T.C.: O[n^3]
    public static int brute(int a[],int k){
        int cnt=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int K=i;K<=j;K++){
                    sum+=a[K];
                }
                if(sum==k) cnt++;
            }
        }
        return cnt;
    }
}
class better{
    //T.C.:O[n^2]
    public static int better(int a[],int k){
        int cnt=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum==k) cnt++;
            }
        }
        return cnt;
    }
}
class optimal{
    public static int optimal(int a[],int k){
        int cnt=0,prefixSum=0;
        HashMap <Integer,Integer> mp=new HashMap<>();
        mp.put(0, 1);
        for(int i=0;i<a.length;i++){
            //add the elements to get the sum upto that particular index
            prefixSum+=a[i];
            //find the x-k portion to check in the map
            int rem=prefixSum-k;

            cnt+=mp.getOrDefault(rem, 0);

            mp.put(prefixSum,mp.getOrDefault(prefixSum, 0)+1);
            
        }
        return cnt;
    }
}
public class LC560_subarrayCount {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = optimal.optimal(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
