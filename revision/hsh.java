import java.util.*;
class hsh{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        //input
        int []a=new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){

        }

         //precompute
         int hash[]=new int[13];
         for(int i=0;i<n;i++){
            hash[a[i]]+=1;
         }

         //fetching
         System.out.println("Enter the number whose frequency u want to check");
         int num=sc.nextInt();
         System.out.println("Frequency of "+num+ " is "+ hash[num]);
    }
}