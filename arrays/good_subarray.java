class brute{
    public static int brute(int a[],int n,int k){
        int maxS=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int s=0;
                if(a[j]-a[i]==k){
                    for(int m=i;m<=j;m++){
                        s+=a[m];
                    }
                    maxS=Math.max(maxS,s);
                }
            }
        }
        return maxS;
    }
}
public class good_subarray {
    public static void main(String[] args) {
        int a[]={-1,3,2,4,5};
        int n=a.length;
        int k=3;
        System.out.println("Maximum sum in the good subarray :"+brute.brute(a, n, k));
    }
}
