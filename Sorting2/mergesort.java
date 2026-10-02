//Implementation of mergesort algorithm
import java.util.*;
class S{

    public static void merge(int arr[],int low,int mid,int high){
        //teking a temporary storing ds to store the elements of the array
        ArrayList <Integer> temp=new ArrayList<>();
        //take two pointers
        int left=low;//take on at the first index of the left array
        int right=mid+1;//take another pointer at the first index of right array
        while(left<=mid && right<=high){
            if(arr[left]>=arr[right]){//if element of left array is smaller than that of that of right array..then add it to list and increment the left pointer..i.e. point it to next element
                temp.add(arr[left]);
                left++;
            }
            else{//if right one is smaller..add it to temp and increment it 
                temp.add(arr[right]);
                right++;
            }
        }


        //if right  is exhausted i.e.: all elements are still present on left
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }


        //if left  is exhausted i.e.: all elements are  still present on right
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }

        //now copy the elements of the temporary ds to original array
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static void mS(int arr[],int low,int high){
        if(low==high) return;//base case
        int mid=(low+high)/2;
        mS(arr, low, mid);
        mS(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
}
class mergesort{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the size of the array:");
            int n=sc.nextInt();
            System.out.println("Enter the array:");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println();
            S.mS(arr, 0, n-1);
            System.out.println("After sorintg");
            for(int i=0;i<n;i++){
               System.out.print(arr[i]);
               if(i<(n-1)) System.out.print(" , ");
            }
            System.out.println();

        }
    }
}
