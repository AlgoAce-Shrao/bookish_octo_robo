import java.util.Scanner;
class SelectionSort{
    //selection sort 
    public static   void selectionsort(int arr[],int n){
        for(int i=0;i<=(n-2);i++){
            int min=i;
            for(int j=i;j<=(n-1);j++){
                if(arr[j]<arr[min])
                    min=j;
                }
                int temp;
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
            System.out.println("After sorting:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+ " , ");
            }
        }
}
class BubbleSort{ 
    //bubble sort
    public static void bubblesort(int arr[], int n){
        for(int i=(n-1);i>0;i--){
            for(int j=0;j<=(i-1);j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i<n-1)
                System.out.print(", ");
        }
    }
}
class InsertionSort{
    public static void insertionsort(int arr[],int n){
        for(int i=0;i<=(n-1);i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp;
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println("After sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i<n-1)
                System.out.print(", ");
        }
    }
}
class sort{
    
        public static void main(String args[]){
            try(Scanner sc=new Scanner(System.in)){
                System.out.println("Enter the size of the array:");
                int n=sc.nextInt();
                System.out.println("enter teh array:");
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                // SelectionSort.selectionsort(arr, n);
                BubbleSort.bubblesort(arr, n);
                // InsertionSort.insertionsort(arr, n);
                
            }
    }
}
