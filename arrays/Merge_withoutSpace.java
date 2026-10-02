
import java.util.Arrays;

//program to merge two sorted arrays without any extra space
//the brute force solution is the one same as that of merge sort algo
class optimal1{
    public static  void optimal1(long a1[],long a2[],int n,int m){
        //first classify the elements in a way that the smaller elements are one the left arr and the greater ones are in the right one
        int left=n-1;
        int right=0;
        while(left>=0 && right<m){
            if(a1[left]>a2[right]){
                long temp=0;
                temp=a1[left];
                a1[left]=a2[right];
                a2[right]=temp;
                left--;right++;

            }else {
                break;
            }

            //now we need to sort the two arrays incase they are not sorted
            Arrays.sort(a1);
            Arrays.sort(a2);
        }
    }
}

class optimal2{
    public static void swapIfGreater(long a1[],long a2[],int ind1,int ind2){
        if(a1[ind1]>a2[ind2]){
            long temp;
            temp=a1[ind1];
            a1[ind1]=a2[ind2];
            a2[ind2]=temp;

        }

    }
    public static void optimal2(long a1[],long a2[],int n,int m){
        int len=n+m;
        int gap=(len/2)+(len%2);
        while(gap>0){
            int left=0;
            int right=left+gap;
            while(right<len){
                if(left<n && right>=n){
                    optimal2.swapIfGreater(a1, a2, left, right-n);
                }else if (left>=n){
                    optimal2.swapIfGreater(a2, a2, left-n, right-n);
                }else{
                    optimal2.swapIfGreater(a1, a1, left, right);
                }
                left++;right++;
            }
            if(gap==1) break;
            else gap=(gap/2)+(gap%2);
        }
    }
}
public class Merge_withoutSpace {
    public static void main(String[] args) {
        long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        optimal2.optimal2(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
