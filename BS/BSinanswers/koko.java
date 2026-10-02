class koko {
    public static  int findMax(int a[]){
        int n=a.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>maxi) maxi=a[i];
            // maxi=Math.max(a[i],maxi);
        }
        return maxi;
    }
    public static  int  calculateTotalTime(int a[],int m){
        int s=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            	s+=Math.ceil((double)a[i]/(double)m);
        }
        return s;
    }
    public static  int minEatingSpeed(int[] piles, int h) {
        int maxi=findMax(piles);
        int low=1,high=maxi;
        while(low<=high){
            int mid=(low+high)/2;
            int reqTime=calculateTotalTime(piles,mid);
            if(reqTime<=h) high=mid-1;
            else low=mid+1;
        }
        return low;
    }

    //O(N * log(max(a[]))), where max(a[]) is the maximum element in the array and N = size of the array.
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minEatingSpeed(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}

