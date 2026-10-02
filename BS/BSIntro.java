public class BSIntro {

    //iterative approach
    public static int iterative(int a[],int target){
        int low=0,high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==target) return mid;
            else if(a[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }


    //recursive approach
    private static  int search(int a[],int low,int high,int target){
        if(low>high)return -1;
        int mid=(low+high)/2;
        if(a[mid]==target) return mid;
        else if(a[mid]<target) return search(a, mid+1, high, target);
        else return search(a, low, mid-1, target);
    }

    public static int recursive(int a[],int target){
         return search(a, 0, a.length-1, target);
    }
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = recursive(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
}
