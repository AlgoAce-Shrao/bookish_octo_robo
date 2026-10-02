//this is a template for the sliding window pattern ...
//1. --> The first pattern which comes up is -->



//-------------Template 1-------------
//Constant Window:
//Given an array...find the maximum sum by taking subarrays of size k
class constnt_Window{
    public static int constnt_Window(int a[],int k){
        int l=0,r=k-1;
        int s=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=l;i<=r;i++){
            s+=a[i];
        }
        while(r<a.length-1){
            s-=a[l];
            l++;
            r++;
            s+=a[r];
            maxSum=Math.max(maxSum,s);
        }
        return maxSum;
    }
}

public class Sliding_Window_Type1{
    public static void main(String args[]){
        int arr[]={-1,2,3,3,4,5,-1};
        int k=4;
        int maximum=constnt_Window.constnt_Window(arr, k);
        System.out.println("Answer is:"+maximum);
    }
}