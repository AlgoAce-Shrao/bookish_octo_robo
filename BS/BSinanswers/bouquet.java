
public class bouquet {
    public static int mini(int a[]){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<mini)mini=a[i];
        }
        return mini;
    }
    public static int maxi(int a[]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>maxi)maxi=a[i];
        }
        return maxi;
    }
    public static int count(int a[],int k,int mid){
        int cnt=0,totBou=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=mid) cnt++;
            else{
                totBou+=cnt/k;
                cnt=0;
            }
        }
        totBou+=cnt/k;
        return totBou;
    }
    public static int roseGarden(int a[],int k,int m){
        int l=mini(a),h=maxi(a);
        while(l<=h){
            int  mid=(l+h)/2;
            int reqBou=count(a,k,mid);
            if(reqBou>=m) h=mid-1;
            else l=mid+1;
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = roseGarden(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}
