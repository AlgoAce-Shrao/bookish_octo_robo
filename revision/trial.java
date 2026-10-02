//merge sort
import java.util.*;
class mergeSort{
    public static  void merge(int arr[],int low, int mid, int high){
        ArrayList <Integer> ls=new ArrayList<>();
        int left=low;
        int rt=mid+1;
        while(left<=mid &&  rt<=high){
            if(arr[left]<=arr[rt]){
                ls.add(arr[left]);
                left++;
            }
            else {
                ls.add(arr[rt]);
                rt++;
            }
        }
        while(left<=mid){
            ls.add(arr[left]);
            left++;
        }
        while(rt<=high){
            ls.add(arr[rt]);
            rt++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=ls.get(i-low);
        }
    }
    public static void mS(int arr[],int low,int high){
        if(low>=high) return;
            int mid=(low+high)/2;
            mS(arr, low, mid);
            mS(arr, mid+1, high);
            merge(arr, low, mid, high);
        
    }
}
class trial{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the size of array");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Ente rthe array elemnets :");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            mergeSort.mS(arr, 0, n-1);
            System.out.println(" After sorting :");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
                if(i<n-1) System.out.print(" , ");
            }
        }
    }
}