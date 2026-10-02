//use of sorting algo to arrange in descneding order
import java.util.*;
class slc{
    public static void slc(int arr[],int n){
        for(int i=0;i<=(n-1);i++){
            int max=i;
            for(int j=i;j<=(n-1);j++){
                if(arr[j]>arr[max]) max=j;
            }
            int temp;
            temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
    }
}
class bub{
    public static void bub(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int didswp=0;
            for(int j=0;j<n-i-1;j++){
            if(arr[j]<arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                didswp++;
            }
            if(didswp==0) break;//optimizing the code to O[n]
            }
        }
    }
}
class ins{
    public static void insSort(int arr[],int n){
        for(int i=0;i<=(n-1);i++){
            int j=i;
            while(j>0 && arr[j-1]<arr[j]){
                int temp;
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
class desc_sort{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the size of the array:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("enter the array:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("After sorting:");
            // slc.slc(arr, n);
            // bub.bub(arr, n);
            ins.insSort(arr, n);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
                if(i<(n-1)) System.out.print(" , ");
            }

        }
    }
}