
public class SingleElementInSortedArr{
    //brute force Approach 1:::
    public static int brute1(int a[]){
        int n=a.length;
        if(n==1) return a[0];
        else if(a[n-1]!=a[n-2]) return a[n-1];
        for(int i=0;i<n;i++){
             if(a[i]!=a[i+1] && a[i]!=a[i-1]) return a[i];

        }
        return -1;
    }


    //brute force approach 2:: Using XOR
    public static int brute2(int a[]){
        int n=a.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=a[i];
        }
        return xor;
    }


    //Optimal  approach :: Binary search :: T.C.:O[log n to the base 2]
    public static int optimal(int a[]){
        int n=a.length;
        //edge cases
        if(n==1) return a[0];
        else if(a[n-1]!=a[n-2]) return a[n-1];
        int l=0,h=n-2;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]!=a[m-1] && a[m]!=a[m+1]) return a[m];
            else if ((m%2==1 && a[m]==a[m-1]) || (m%2==0 && a[m]==a[m+1])) l=m+1;
            else h=m-1;
        }
        return -1;
    }
     public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6));
        int arr[]={1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};
        int ans = optimal(arr);
        System.out.println("The single element is: " + ans);
    }
}