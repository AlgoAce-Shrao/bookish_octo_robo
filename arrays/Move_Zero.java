//Move zeros to the end
import java.util.*;
//Brute Force: T.C.:O[2n]      S.C.:->O[n] 
class Brt{
    public static void brt(int arr[],int n){
        ArrayList<Integer> temp=new ArrayList<>();
        //move the non zero elements in a temporary ds-->T.C.:-->O[n]
        for(int i=0;i<n;i++){
            if(arr[i]!=0) temp.add(arr[i]);
        }
        //put the elements of the temporary ds to the stasrting of the original array ..T.C.-->O[x] ...x=temp.size
        for(int i=0;i<temp.size();i++){
            arr[i]=temp.get(i);
        }
        //assign the rest of the elements of the original ds as zero...T.C.-->O[n-x]
        for(int i=temp.size();i<n;i++){
            arr[i]=0;
        }
    }
}
//optimized solution
class opt{
    public static void opt(int arr[],int n){
        //find the first occurrence of the element which is zero...one pointer is always at zero
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0) {
                j=i;
                break;
            }
        }
        //take the other pointer and put it one step front of j and iterate and swap gradually
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=0;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}
class Move_Zero{
    public static void main(String args[]){
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        // Brt.brt(arr, n);
        opt.opt(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}