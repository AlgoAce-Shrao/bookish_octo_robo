//code to determine the second largest number and the second smallest number  in an array
import java.util.*;
// import javax.swing./text.StyleContext;
class secLarge{
    public static int secondSmallest(int a[],int n){
        int smallest=a[0];
        int sSmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<smallest){
                sSmallest=smallest;
                smallest=a[i];
            }
            else if (a[i]!=smallest && a[i]<sSmallest) {
                sSmallest=a[i];
            }
        }
        return sSmallest;
    }
    public  static int secondLargest(int a[],int n) {
        int largest=a[0];
        int sLargest=-1;
        for(int i=0;i<n;i++){
            if(a[i]>largest){
                sLargest=largest;
                largest=a[i];
            }
            else if (a[i]<largest && a[i]>sLargest) {
                sLargest=a[i];
            }
        }
        return sLargest;
    }
    public static void main(String args[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the size of the array ;");
            int n=sc.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the array or any similar ds ");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int secLarge=secondLargest(a,n);
            int secSmall=secondSmallest(a,n);
            int ans[]=new int[]{secLarge, secSmall};
            System.out.println("Second largest & Second Smallest:");
            for(int i=0;i<2;i++){
                System.out.print(ans[i]+ " ");
            }
        }
    }
}