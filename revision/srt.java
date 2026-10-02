import java.util.*;
class selecsrt{
    public static void selecsrt(int arr[],int n){
        for(int i=0;i<=(n-2);i++){
             int min=i;
            for(int j=i;j<=(n-1);j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp;
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
class bubsrt{
    public static void bubsrt(int arr[],int n){
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
                System.out.print(" , ");
        }
    }
}
class inssrt{
    public static void inssrt(int arr[],int n){
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
                System.out.print(" , ");
        }
    }
}
class srt{
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter the size of the array :");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the array :");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            // selecsrt.selecsrt(arr, n);
            // bubsrt.bubsrt(arr, n);
            inssrt.inssrt(arr, n);
            // System.out.println("After sorting:");
            // for(int i=0;i<n;i++){
            //     System.out.print(arr[i]);
            //     if(i<n-1)
            //         System.out.print(" , ");
            // }
        }
    }
}