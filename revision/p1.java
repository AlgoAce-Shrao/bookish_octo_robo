//revise recursion
//print name n times
import java.util.*;
class fact{
    public static int ft(int n){
        if(n==0) return 1;
        else
         return n*ft(n-1);
    }
}

class p1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit  :");
        int n=sc.nextInt();
        // sum.ptSum(n);
        System.out.println("factorial  is :"+fact.ft(n));
    }
}