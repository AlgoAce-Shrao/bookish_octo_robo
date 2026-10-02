import java.util.*;

class brute{
    //T.C.:O[n^3 * log(no,of triplets)] S.C.: O[2*no.of triplets]
    public static List<List<Integer>> brute(int n,int a[]){
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]==0){
                        List<Integer> ls=Arrays.asList(a[i],a[j],a[k]);
                        ls.sort(null);
                        st.add(ls);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
        
    }
}
class better{
    //T.C.: O[n^2 * no.of triplets] || S.C>: O[2*no. of triplets]
    public static List<List<Integer>> better(int n,int a[]){
        Set<List<Integer>>  st=new HashSet<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> hashset=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(a[i]+a[j]);
                if(hashset.contains(third)) {
                    List<Integer> ls=Arrays.asList(a[i],a[j],third);
                    ls.sort(null);;
                    st.add(ls);
                }
                hashset.add(a[j]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>(st);
        return ans;
    }
}
class optimal{
    public static List<List<Integer>> optimal(int n,int a[]){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i>0 && a[i]==a[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=a[i]+a[j]+a[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else {
                    List<Integer> temp=Arrays.asList(a[i],a[j],a[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while( j<k && a[j]==a[j-1]) j++;
                    while(j<k && a[k]==a[k+1]) k--;
                }
            }
        }
        return ans;
    }
}
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans =optimal.optimal(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
