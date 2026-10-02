//remove the duplicates and print the modified array 
import java.util.*;
class op{
    public static int op_brt(int arr[]){
        //brute force approach
        //using set...
        /*
         1> insert the elements in set -->O[NlogN]
         2>set is unique i.e. it keeps the elements unique...keeps one element only..doesn't let it repeat
         3>put the set elements in array-->O[N]
         */
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        int j=0;
        for(int x:st){
            arr[j]=x;
            j++;
        }
        return j;
    }
    //optimal approach-->O[N]
    public static  int  op_best(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i-1;
    }
}
class rem_dup{
    public static void main(String args[]){
        int arr[]={1,1,2,2,3,3,3};
        for(int i=0;i<op.op_best(arr);i++){
            System.out.print(arr[i]);
            if(i<op.op_best(arr)-1) System.out.print(" , ");
        }
    }
}