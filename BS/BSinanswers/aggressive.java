
import java.util.Arrays;

public class aggressive{
    public static boolean canWePlace(int a[],int dist,int k){
        int cntCows=1,last=a[0];
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]-last>=dist){
                cntCows++;
                last=a[i];
            }
            if(cntCows>=k)  return true;
        }
        return false;
    }
    public static int brute(int a[],int k){
        //linear search approach

        //1. sort the array -->inorder to get the minimum distance
        Arrays.sort(a);
        int n=a.length;
        for(int i=1;i<=a[n-1]-a[0];i++){
            if(canWePlace(a,i,k)==true) continue;
            else return i-1;
        }
        return -1;
    }

    //optimal approach ::T.C.:O[nlog n]+O[(max-min)*n]
    public static int optimal(int a[],int k){
        Arrays.sort(a);   //-->O[nlogn]
        int n=a.length;
        int l=1,h=a[n-1]-a[0];
        while(l<=h){
            int m=(l+h)/2;
            if(canWePlace(a, m, k)==true) l=m+1;
            else h=m-1;
        }
        return h;
    }
    public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 10, 9};
        int cows= 4;
        int ans = optimal(stalls, cows);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}