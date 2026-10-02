//THE PROGRAM IS INTENDED TO FIND THE UPPER BOUND IN A GIVEN ARRAY
//UPPPER BOUND-->  THE SMALLEST INDEX WHERE A[MID]>TARGET


public class BSupbnd {
    public static int upperbound(int a[],int n,int target){
        int l=0,h=n-1;
        int ans=n;
        while(l<=h){
            int mid=(l+h)/2;

            //MID MAY BE THE ANSWER
            if(a[mid]>target){
                ans=mid;
                //LOOK FOR SMALL INDEX ON THE LEFT
                h=mid-1;
            }else{
                //LOOK FOR ANSWERS ON THE RIGHT
                l=mid+1;
            }
        }
        return ans;
    }

     public static void main(String[] args) {
        int[] arr = {3, 5, 8,9, 15, 19};
        int n = 6, x = 9;
        int ind = BSupbnd.upperbound(arr, n, x);
        System.out.println("The upper bound is the index: " + ind);
    }
}
