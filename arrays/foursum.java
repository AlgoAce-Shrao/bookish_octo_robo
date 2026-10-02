import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class brute{
    public static List<List<Integer>> brute(int a[],int t){
        Set<List<Integer>> ans=new HashSet<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int m=k+1;m<n;m++){
                        int s=a[i]+a[j]+a[k]+a[m];
                        if(s==t) {
                            List<Integer> ls=Arrays.asList(a[i],a[j],a[k],a[m]);
                            ls.sort(null);
                            ans.add(ls);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
class better{
    public static List<List<Integer>> better(int a[],int t){
        HashSet<List<Integer>> ans=new HashSet<>();
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Integer> st=new HashSet<>();
                for(int k=j+1;k<n;k++){
                    int frth=t-(a[i]+a[j]+a[k]);
                    if(st.contains(frth)){
                        List<Integer> temp=Arrays.asList(a[i],a[j],a[k],frth);
                        temp.sort(Integer::compareTo);//
                        ans.add(temp);
                    }
                    st.add(a[k]);
                }
            }
        }
        List<List<Integer>> ans1=new ArrayList<>(ans);
        return ans1;
    }
}
class optimal {
    public  static List<List<Integer>> optimal(int [] nums, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        if(nums==null || nums.length<4) return ans;// optimization -->keep in mind for test cases like null or array size less than criteria
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            // int s=0;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;
                int k=j+1,m=nums.length-1;
                while(k<m){
                   long s=(long)nums[i];
                   s+=(long)nums[j];
                   s+=(long)nums[k];
                   s+=(long)nums[m];
                    if(s<target){
                        k++;
                    }else if(s>target){
                        m--;
                    }else if(s==target){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[m]);
                        ans.add(temp);
                        k++;
                        m--;
                        while(k<m && nums[k]==nums[k-1]) k++;
                        while(k<m && nums[m]==nums[m+1]) m--;
                    }
                }
            }
        }
        
        return ans;
    }
}
public class foursum{
    public static void main(String[] args) {
        // int[] nums = {1000000000,1000000000,1000000000,1000000000};//a very good test case...thst's the reason we are takinng sum data type as long
        // int target = -294967296;
        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        List<List<Integer>> ans = optimal.optimal(nums, target);
        System.out.println("The quadruplets are: ");
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}