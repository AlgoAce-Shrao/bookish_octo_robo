/*
reverse the array by optimizing the code...
*/
import java.util.*;

//funstion to print the array 
class printrev{
    public void printrev(int arr[],int n){
        System.out.println("Reversed array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//funstion to reverse the array
class revarr{
    public static void revarr(int arr[],int n){
        int p1=0,p2=n-1,temp=0;
        while(p1<p2){
             temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
        
        printrev obj=new printrev();
        obj.printrev(arr,n);
    }
}
//time complexity : O[n]
//space complexity: O[1]--> thereby optimising the code
class rev_arr1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array :");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // revarr o=new revarr();
        revarr.revarr(arr,n);
    }
}