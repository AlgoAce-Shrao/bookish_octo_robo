//program to find the union of two sorted arrays
import java.util.*;
//Brute force approach-->T.C.-->O[nlog x+mlog x]+O[n1+n2]---->x=size of set
//S.C.: -->O[n+m]+O[n+m]-->the secind time we use the same space to return the answer
class unBrt{
    public static  int[] unBrt(int a1[],int a2[],int n,int m){
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(a1[i]);
        }
        for(int i=0;i<m;i++){
            s.add(a2[i]);
        }
        int un[]=new int[s.size()];
        int i=0;
        for(int it:s){
            un[i++]=it;
        }
        return un;
    }
}
//optimized solution-->Two pointers
class unOpt{
    public static ArrayList<Integer> unOpt(int a1[],int a2[],int n,int m){
        ArrayList<Integer> union=new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(a1[i]<=a2[j]){
                if(union.size()==0 || union.get(union.size()-1)!=a1[i]) union.add(a1[i]);
                        i++;
            }
            else {
                if(union.size()==0 || union.get(union.size()-1)!=a2[j]) union.add(a2[j]);
                j++;
            }
            
        }
        while(i<n){//if any elements left  only in the arr1
            if(union.size()==0 || union.get(union.size()-1)!=a1[i]) union.add(a1[i]);
                        i++;
        }
        while(j<m){//if any elements left only in the arr2
            if(union.size()==0 || union.get(union.size()-1)!=a2[j]) union.add(a2[j]);
                j++;
        }
        return union;
    }
}
class union{
    public static void main(String args[]){
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> union = unOpt.unOpt(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: union)
          System.out.print(val+" ");
    }
}