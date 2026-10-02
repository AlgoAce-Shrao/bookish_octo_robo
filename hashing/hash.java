
import java.util.*;

/*
to learn the basic concept of hashing
*/
class hash{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //input
        int n;
        System.out.println("Enter the size array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elemeents :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //precomputation
        int hash[]=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }

        //fetching
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements whose frequency u want to know :");
            int num=sc.nextInt();
            System.out.println("Frequency of "+num + "is "+hash[num]);
        }

    }
}