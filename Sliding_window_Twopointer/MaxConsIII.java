class brute{
    public static int brute(int a[],int k){
        int n=a.length;
        int len=0;
        for(int i=0;i<n;i++){
            int zeros=0;
            for(int j=i;j<n;j++){
                if(a[j]==0)zeros++;
                if(zeros<=k){
                    len=Math.max(len,j-i+1);
                }else{
                    break;
                }
            }
        }
        return len;
    }
}
class better{
    //T.C.:O[2n] || S.C.:O[1]
    public static int better(int a[],int k){
        int n=a.length;
        int l=0,r=0,len=0;
        int zeros=0;
        while(r<n){//-->O[n]
            if(a[r]==0) zeros++;
            while(zeros>k){  //-->O[n]
                if(a[l]==0) zeros--;
                l++;
            }
            if(zeros<=k){
                len=Math.max(len,r-l+1);
            }
            r++;
        }
        return len;
    }
}
class optimal{
    //T.C.:O[n]||S.C.:O[1]
     public static int optimal(int a[],int k){
        int n=a.length;
        int l=0,r=0,len=0;
        int zeros=0;
        while(r<n){//-->O[n]
            if(a[r]==0) zeros++;
            if(zeros>k){
                if(a[l]==0) zeros--;
                l++;
            }
            if(zeros<=k){
                len=Math.max(len,r-l+1);
            }
            r++;
        }
        return len;
    }
}
public class MaxConsIII{
    public static void main(String args[]){
        int arr[]={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        int ans=brute.brute(arr, k);
        System.out.println("Output:"+ans);
    }
}