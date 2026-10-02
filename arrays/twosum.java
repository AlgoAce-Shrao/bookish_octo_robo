
import java.util.HashMap;

//two sum problem
class brute{
    //T.C.:O[n^2]
    public static int[] brute(int n,int a[],int target){
        for(int i=0;i<n;i++){
            for(int j=1+1;j<n;j++){
                if(a[i]+a[j]==target) return new int[]{i,j} ;
            }
        }
        return new int[]{};
    }
}
class better{
    // hashing-->T.C.:O[n]->for hashmap || S.C.:O[N]
    public static int[] better(int n,int a[],int target){
        HashMap <Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int oneno=a[i];
            int otherno=target-oneno;
            if(mp.containsKey(otherno)){
                return new int[]{mp.get(otherno),i};//return yes depending on question
            }
            mp.put(a[i],i);
        }
        return new int[]{};//return no depending on question
    }
}
class twosum{
    public static void main(String args[]){
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = better.better(n, arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "+ ans[1] + "]");
    }
}