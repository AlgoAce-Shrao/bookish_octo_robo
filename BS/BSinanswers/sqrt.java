
public class sqrt {
    public static int floorSqrt(int n){

        //Follow the approach 
        int l=1,h=n,ans=1;
        while(l<=h){
            int m=(l+h)/2;
            if(m*m<=n){
                ans=m;
                l=m+1;
            }else h=m-1;
        }
        return ans;
    }


    //after keen observation we see that either of high or low points to the actual answer at the end ...
    public static int floorSqrt1(int n){
        int l=1,h=n;
        while(l<=h){
            int m=(l+h)/2;
            if(m*m<=n) l=m+1;
            else h=m-1;
        }
        return h;
    }
    public static void main(String[] args) {
        int n = 31;
        int ans = floorSqrt1(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}
