class smallestDivisor {
    public static  int mini(int a[]) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {

            if (a[i] < mini)
                mini = a[i];
        }
        return mini;
    }
    public static  int maxi(int a[]) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {

            if (a[i] >maxi)
                maxi = a[i];
        }
        return maxi;
    }
    public static  int calc(int a[],int num){
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=Math.ceil((double)a[i]/(double)num);
        }
        return s;
    }
    public static  int smallestDivisor(int[] nums, int threshold) {
        int l = 1, h = maxi(nums);
        while(l<=h){
            int mid=(l+h)/2;
            int s=calc(nums,mid);
            if(s>threshold) l=mid+1;
            else h=mid-1;
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}