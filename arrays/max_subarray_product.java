class brute{
    //T.C.: O[n^3] || S.c.: O[1]
    public static int brute(int a[],int n){
        int maxP=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int prod=1;
                for(int k=i;k<j;k++){
                    prod*=a[k];
                    maxP=Math.max(maxP,prod);
                }
            }

        }
        return maxP;
    }
}
class better{
    //T.C.: O[n^2] || S.C.: O[i]
    public static int better(int a[],int n){
        int maxP=1;
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=i;j<n;j++){
                prod*=a[j];
                maxP=Math.max(maxP,prod);
            }
        }
        return maxP;
    }
}
class optimal{
    public static int optimal(int a[],int n){
        int pre=1,suff=1;
        int maxP=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(pre==0) pre=1;
            if(suff==0) suff=1;
            pre*=a[i];
            suff*=a[a.length-i-1];
            maxP=Math.max(maxP,Math.max(pre,suff));
        }
        return maxP;
    }
}
public class max_subarray_product {
    public static void main(String[] args) {
        int a[]={0,-2,1};
        int n=a.length;
        System.out.println("Maximum productf subarray:"+optimal.optimal(a, n));
    }
}
