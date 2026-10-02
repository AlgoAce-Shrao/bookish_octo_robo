//Rotate an array by one place to the left
class RottoLeft{
    public static int[] RottoLeft(int arr[],int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }
    //rotate an array by one place to the right
    public static int[] RottoRight(int arr[],int n){
        int temp=arr[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
        return arr;
    }
}
class Rot_arr_Oneplc{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int n=7;
        RottoLeft.RottoRight(arr, n);
        System.out.println("Array after rotating by 1th place is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " , ");
        }

    }
}