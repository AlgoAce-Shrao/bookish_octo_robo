/*
program to print the fibonacci number at nth term
*/
import java.util.*;
//by functional recursion
class prntfib{
    public static int  prntfib(int n){
        if(n<=1) return n;
        else
            return (prntfib(n-1)+prntfib(n-2));
    }
}
class fibo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  required nth term for fibonacci ");
        int n=sc.nextInt();
        System.out.println("Sum of  n terms in fibonacci :"+prntfib.prntfib(n));
    }
}
