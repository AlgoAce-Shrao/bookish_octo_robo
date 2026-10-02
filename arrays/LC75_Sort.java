class brute{
    public static void brute(int a[],int n){
        //use some sorting algo
    }
}
//better -->take three counters(one of 0 ,ine of 1 and another of 2)...keep a track of them and then just modify the array 
class better{
    //T.C.: O[2n] || S.C.:O[n]
    public static void better(int a[],int n){
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0) cnt0++;
            else if(a[i]==1) cnt1++;
            else cnt2++;
        }
        for(int i=0;i<cnt0;i++) a[i]=0;
        for(int i=cnt0;i<cnt0+cnt1;i++) a[i]=1;
        for(int i=cnt0+cnt1;i<n;i++) a[i]=2;
    }
}
class optimal{
    public static void optimal(int a[],int n){
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(a[mid]==0){
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1) mid++;
            else{
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
    }
}
public class LC75_Sort {
    public static void main(String[] args) {
         int n = 6;
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        int arr[]={0, 2, 1, 2, 0, 1};
        optimal.optimal(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
