//revision of quick sort implementation
import java.util.*;
class soln{
    public static int part(ArrayList<Integer> arr,int low,int high){
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
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp=pivot;
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
    public static void qcksrt(ArrayList<Integer> arr,int low,int high){
        if(low<high){
            int pIndex=part(arr, low, high);
            qcksrt(arr, low, pIndex-1);
            qcksrt(arr, pIndex+1, high);
        }
    }
}
class quickie{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            ArrayList <Integer> arr=new ArrayList<>();
            System.out.println("Enter the size of the array:");
            int n=sc.nextInt();
            System.out.println("Enter the elements of the array :");
            for(int i=0;i<n;i++){
                arr.add(i, sc.nextInt());
            }
            soln.qcksrt(arr, 0, n-1);
            System.out.println("After sorting:");
            for(int i=0;i<n;i++){
               System.out.print(arr.get(i)+" ");
            }

        }
    }
}