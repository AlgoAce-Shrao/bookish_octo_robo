//Need to find the first and last occurence of a of a target value in an array
public class first_last{
    private static int lb(int a[],int n,int t){    //function for finding the lower bound
        int l=0,h=n-1,lbans=n;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]>=t) {
                lbans=m;
                h=m-1;
            }
            else l=m+1;
        }
        return lbans;
    }

    private static int ub(int a[],int n,int t){
        int l=0,h=n-1,ubans=n;
        while(l<=h){
            int m=(l+h)/2;
            if(a[m]>t) {
                ubans=m;
                h=m-1;
            }
            else l=m+1;
        }  
        return ubans;
    }

 public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        int n = 8, x = 14;
        if(lb(arr, n, x)==n || arr[lb(arr, n, x)]!=x){
            System.out.println("[-1,-1]");
        } 
        else System.out.println("["+ lb(arr, n, x)+ ","+(ub(arr, n, x)-1)+"]");
        
    }   
}


