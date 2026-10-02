public class nth_root {
    //brute approach ::T>C.: O[sqrt of m]
    public static int nthroot_brt(int n,int m){
        int ans=-1;
        for(int i=1;i<=m;i++){
            if(Math.pow(i,n)==m){
                return i;
            }
           
        }
        return -1;
    }

    //optimal approach:: T.C.::O[]
    public static int NthRoot(int n,int m){
        int l=1,h=m;
        while(l<=h){
            int mid=(l+h)/2;
            if(Math.pow(mid,n)==m) return mid;
            else if(Math.pow(mid,n)<m) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = 3, m = 27;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }
}
