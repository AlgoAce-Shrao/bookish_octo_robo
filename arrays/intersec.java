//program to find the intersection of two arrays
import java.util.*;
//Brute force approach
class intrBrt{//T.C.-->O[n^2] S.C.-->O[a2.length](to optimize it a bit)
    public static void intrBrt(int a1[],int a2[],ArrayList<Integer> ans){
        int vis[] = new int[a2.length];
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j] && vis[j]==0){
                    ans.add(a1[i]);
                    vis[j]=1;
                    break;
                }
                //truncate the loop if the value to be searched is absent and next to it comes the next higher element..
                if(a2[j]>a1[i]) break;
            }
        }
    }
}
//optimal
class intrOpt{//O[n1+n2] -->n1 & n2 are the sizes of the two arrays
    public static void intrOpt(int a1[],int a2[],ArrayList<Integer> ans){
        int i=0,j=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]) i++;
            else if(a2[j]<a1[i]) j++;
            else {
                ans.add(a1[i]);
                i++;
                j++;
            }
        }
    }
}
class intersec{
        public static void main(String args[]){
            // int n = 8, m = 7;
            int arr1[] = {1, 2, 2,3,3,4,5,6};
            int arr2[] = {2, 3,3,5,6,6,7};
            ArrayList<Integer> ans=new ArrayList<>();
            // intrBrt.intrBrt(arr1, arr2, ans);
            intrOpt.intrOpt(arr1, arr2, ans);
            System.out.println("Intersection of arr1 and arr2 is ");
            for (int val: ans)
              System.out.print(val+" ");
        }
}
