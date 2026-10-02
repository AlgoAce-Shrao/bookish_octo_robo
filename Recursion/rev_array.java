/*
program to reverse an array 
*/
import java.util.*;
//by swapping the elements of the array 
class prntrev{
    public   void prntrev(int arr[],int n){
        System.out.println("Elements of the array after reversing  are :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"");;
        }
    }
}
//reversing the array by using an auxialliary array and by swapping manually
class rev{
    public static void rev(int arr[],int n){
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[n-i-1]=arr[i];
        }
        prntrev p1=new prntrev();
        p1.prntrev(ans,n);
    }
}
//time complexity : O[n]
//space complexity: O[n]
class rev_array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of the array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter teh elements of the array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rev ob=new rev();
        ob.rev(arr,n);
        // System.out.println("");
    }
}