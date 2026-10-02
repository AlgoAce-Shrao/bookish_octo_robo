//implementation of quick sort algorithm
import java.util.*;
class Sol{
    public static int partition(ArrayList<Integer> arr,int low,int high){
        int pivot=arr.get(low);
        int i=low;
        int j=high;
        while(i<j){
            while(arr.get(i)<=pivot && i<=(high-1)){
                i++;
            }
            while(arr.get(j)>pivot && j>=(low+1)){
                j--;
            }
            if(i<j){
                int temp=arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp=arr.get(low);//can also write    [ temp=pivot; ]
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;

    }
    public static ArrayList<Integer> qS(ArrayList<Integer> arr,int low,int high){
        if(low<high){
            int pIndex=partition(arr, low, high);
            qS(arr, low, pIndex-1);
            qS(arr, pIndex+1, high);
        }
        return arr;
    }
}
class quicksort{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            ArrayList <Integer> arr=new ArrayList<>();
            System.out.println("Enter the size of the array:");
            int n=sc.nextInt();
            System.out.println("Enter the elements of the array:");
            for(int i=0;i<n;i++){
                arr.add(sc.nextInt());
            }
            System.out.println("Array before sorting:");
            for(int i=0;i<n;i++){
                System.out.print(arr.get(i));
            }
            System.out.println();
            arr=Sol.qS(arr, 0, n-1);
            System.out.println("Array after sorting:");
            for(int i=0;i<n;i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
}