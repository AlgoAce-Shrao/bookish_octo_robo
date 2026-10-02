//THE PROGRAM IS INTENDED TO FIND THE LOWER BOUND IN A GIVEN ARRAY
//LOWER BOUND-->  THE SMALLEST INDEX WHERE A[MID]>=TARGET


public class BSlwrbound {
    public static int lowerbound(int a[],int n,int target){
        int l=0,h=n-1;
        int ans=n;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]>=target){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }

     public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = BSlwrbound.lowerbound(arr, n, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}
