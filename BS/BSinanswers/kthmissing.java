public class kthmissing {
    //brute
    public static int brute(int a[],int n,int k ){
        for(int i=0;i<n-1;i++){
            if(a[i]<=k) k++;
            else break;
        }
        return k;
    }
    //optimal
    public static int optimal(int a[],int n,int k){
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            int missing=a[m]-(m+1);
            if(missing<k)l=m+1;
            else h=m-1;
        }
        return l+k;
    }
   public static void main(String[] args) {
        int[] a = {4, 7, 9, 10};
        int n = 4, k = 4;
        int ans = optimal(a, n, k);
        System.out.println("The missing number is: " + ans);
    } 
}
