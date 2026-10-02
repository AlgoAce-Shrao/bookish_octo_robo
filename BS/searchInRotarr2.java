public class searchInRotarr2 {
    public static boolean searchInARotatedSortedArrayII(int a[],int k){
        int l=0,h=a.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]==k) return true;

            //Edge caase
            if(a[l]==a[m] && a[m]==a[h]){
                l=l+1;
                h=h-1;
                continue;
            }
            //check if left sorted
            if(a[l]<=a[m]){
                if(a[l]<=k && k<=a[m]){
                    h=m-1;
                }else{
                    l=m+1;
                }
            }else{
                if(a[m]<=k && k<=a[h]){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 3;
        boolean ans = searchInARotatedSortedArrayII(arr, k);
        if (ans == false)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");
    }
}
