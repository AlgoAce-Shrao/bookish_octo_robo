import java.util.Scanner;

class InsertionSort{
    public static void   insertionsort(int arr[],int n){
        int c=0;
        for(int i=0;i<=(n-1);i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp;
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                c++;
                j--;
            }
        }
        System.out.println("After sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i<n-1)
                System.out.print(", ");
        }
        System.out.println();

        System.out.println("Total number of shifts: "+c);
    }
}

public class p2{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
                System.out.println("Enter the size of the array:");
                int n=sc.nextInt();
                System.out.println("enter teh array:");
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                InsertionSort.insertionsort(arr, n);
                
            }
    }
}