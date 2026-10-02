
import java.util.HashMap;

//to determine the length of the longest subarray of sum k-->only for positive elements
class brute{
    //T.C.:O[n^3]
    public static int brute(int a[],long k){
        int len=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int K=i;K<j;K++){
                    sum+=a[K];
                }
                if(sum==k) {
                    len=Math.max(len, j-1+1);
                }
            }
        }
        return len;
    }
}
class brute1{
    //T.C.:O[n^2]
    public static int brute1(int a[],long k){
        int len=0;
        for(int i=0;i<a.length;i++){
            long s=0;
            for(int j=i;j<a.length;j++){
                s+=a[j];
                if(s==k) len=Math.max(len,j-i+1);
            }
        } 
        return  len;
    }
}
class better{
    //hashing 
    public static int better(int a[],int k){
        int n=a.length;
        int sum=0,maxLen=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum==k) maxLen=Math.max(maxLen, i+1) ;
            int rem=sum-k;
            if(mp.containsKey(rem)){
                int len=i-mp.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!mp.containsKey(sum)){
                mp.put(sum, i);
            }
            // mp.put(sum,i);
        }
        return maxLen;
    }
}
class optimal{
    //T.C.:O[2n]
    public static int optimal(int a[],long k){
        long sum=a[0];
        int maxLen=0,left=0,right=0;
        int n=a.length;
        while(right<n){
            //if sum>k reduce the subarray form left until the sum is back to <=k
            //trim the pointer forward
            while(left<=right && sum>k){
                sum-=a[left];
                left++;
            }
            //if sum==k check the length of the subarray
            if(sum==k) maxLen=Math.max(maxLen, right-left+1);
            //move forward the right pointer
            //keep on adding the numbers of the right pointer
            right++;
            if(right<n) sum+=a[right];
        }
        return maxLen;
    }
}
class subarray{
    public static void main(String[] args) {
        int[] a = {2,0,0,3};
        int  k = 3;
        // int len = optimal.optimal(a, k);
        int len=better.better(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}