import java.util.*;
class brute{

    // T.C.:O[2n](for operation)+O[n](for printing the array)|| S.C.:O[n] if we  manipulate the given array and O[2n] if we don't  manipulate the given array i.e. we are taking another array for storing the answer
    public static void brute(int nums[]){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                pos.add(nums[i]);
            else
                neg.add(nums[i]);
        }
        int p = 0, n = 0;
        int i = 0;
        while (p < pos.size() && n < neg.size()) {
            ans.add(pos.get(p));
            p++;
            ans.add(neg.get(n));
            n++;
        }

        while(p<pos.size()){
            ans.add(pos.get(p));
            p++;
        }
        while(n<neg.size()){
            ans.add(neg.get(n));
            n++;
        }
        // int j = 0;
        for (int a : ans) {
            // arr[j++] = a;
            System.out.print(a+" ");
        }
    }
}

class optimal{
    // T.C.: O[n] || S.C.: O[n]
    public static void optimal(int nums[]){
        int ans[] = new int[nums.length];
        int pos = 0, neg = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ans[neg] = nums[i];
                neg += 2;
            } else {
                ans[pos] = nums[i];
                pos += 2;

            }
        }
        //this loop is not counted since we are using it to prinbt the array
        for(int a:ans){
            System.out.print(a+" ");
        }
    }
}
public class LC2149_Rearrange_array_elements {
    public static void main(String[] args) {
        int a[]={1, 2, -4, -5, 3, 4};
        brute.brute(a);
    }
}
