
class brute {
    //T.C.: O[n^3] || s.C.:O[1]
    public static int brute(int a[], int n) {
        int maxi=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int s=0;
                for(int k=i;k<j;k++){
                    s+=a[k];
                    maxi=Math.max(maxi, s);
                }
            }
        }
        return  maxi;
    }
}
class better{
    //T.C.: O[n^2] || S.c> :O[1]
    public static int better(int a[],int n){
        int maxi=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=a[j];
                maxi=Math.max(maxi, s);
            }
        }
        return maxi;
    }
}
class optimal{
    public static int optimal(int a[],int n){
        int s=0,maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            s+=a[i];
            if(maxi<s) maxi=s;
            if(s<0) s=0;

            
        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;
        }
        return maxi;
    }
}
// to print the subarray instead of the sum
class printSubarray{
    public static void print(int a[],int n){
        int s=0,maxi=Integer.MIN_VALUE;
        int start=0;
        int ansStart=-1,ansEnd=-1;
        for(int i=0;i<n;i++){
            if(s==0) start=i;
            s+=a[i];
            if(maxi<s) {
                maxi=s;
                ansStart=start;ansEnd=i;
            }

            if(s<0)s=0;
        }

        for(int i=ansStart;i<=ansEnd;i++){
            System.out.print(a[i]+ " ");
            if(i<ansEnd)
                System.out.print(" , ");
        }
    }
}
class max_subarray_sum {
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        // long maxSum =optimal.optimal(arr, n);
        // System.out.println("The maximum subarray sum is: " + maxSum);

        //for printing the answer array:
        printSubarray.print(arr, n);
    }
}