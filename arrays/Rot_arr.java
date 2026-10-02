
import java.util.ArrayList;

//Rotate an array by d places to the left
//brute force approach
class RottoLeft{//-->T.C.-->O[n+d]   S.C.-->O[d]
    public static int[] RottoLeft(int arr[],int n,int d){
        //take a temporary ds 
        //T.C.-->O[d]
        //T.C.-->O[d]
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<d;i++){
            temp.add(arr[i]);
        }
        //shifting
        //T.C.-->O[n-d]
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        //put back temp
        //T.C.-->O[d]
        for(int i=(n-d);i<n;i++){
            arr[i]=temp.get(i-(n-d));
        }
        return arr;
    }
}
//Optimal approach-->Use array reversal algorithm
class opt_RottoLeft{
    public static int [] revarr(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void opt_RottoLeft(int arr[],int n,int d) {
        revarr(arr, 0, d-1);
        revarr(arr, d, n-1);
        revarr(arr, 0, n-1);
    }
}
class Rot_arr{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int n=7;
        int d=2;//by how many places we want to shift the array
        opt_RottoLeft.opt_RottoLeft(arr, n, d);
        System.out.println("Array after rotating by 1th place is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " , ");
        }
    }
}