import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
 class brute{
    // T.C.: O[n*n] S.C.:O[2] -->since at max we can have 2 elements as the answer
    public static List<Integer> brute(int a[]){
        //take an answer list
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(ls.size()==0 || ls.get(0)!=a[i]){
                int c=0;
                for(int j=0;j<a.length;j++){
                    if(a[j]==a[i]) c++;
                }
                if(c>a.length/3) ls.add(a[i]);
                if(ls.size()==2) break;
            }
        }
        return ls;
    }
}
class better{
    // T.C.: O[n]|| S.C.: O[soze of array]+O[2]
     public static List<Integer> better(int a[]){
        HashMap<Integer,Integer> mp=new HashMap<>();
        List<Integer> ans=new ArrayList<>();

        //find the minimum oxxurence if the element..for eg: size=6...6/3=2 ..since we need elementd more than n/3 therefore minimum number of elements to fulfifll te criteria is 2+1=3
        int mini=(int)(a.length/3)+1;
        for(int i=0;i<a.length;i++){
            int cnt=mp.getOrDefault(a[i], 0);
            mp.put(a[i], cnt+1);
            
            if(mp.get(a[i])==mini){
                ans.add(a[i]);
            } 
            
            if(ans.size()==2) break;
        }
        
        Collections.sort(ans);
        return  ans;
    }
}
class optimal{
    public static List<Integer> optimal(int a[]){
        //moore's voting algorithm
        int cnt1=0,cnt2=0;
        int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(cnt1==0 && el2!=a[i]){
                cnt1=1;
                el1=a[i];
            }else if(cnt2==0 && el1!=a[i]){
                cnt2=1;
                el2=a[i];
            }else if(a[i]==el1) cnt1++;
            else if(a[i]==el2)cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        int mini=(int)(a.length/3)+1;
        List<Integer> ans =new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]==el1) cnt1++;
            else if(a[i]==el2) cnt2++;
        }
        if(cnt1>=mini) ans.add(el1);
        if(cnt2>=mini) ans.add(el2);
        return ans;
    }
}
public class majority2{
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans =optimal.optimal(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}