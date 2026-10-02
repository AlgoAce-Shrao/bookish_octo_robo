/*
program to print the fibonacci series upto nth term
*/
import java.util.*;
class prntseries{
    public  static int   prntseries(int n){
        if(n<=1){
            return n;
        }
        else{
            return prntseries(n-2)+prntseries(n-1);
        }
    }
}
class fibo_series{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  required nth term for fibonacci ");
        int n=sc.nextInt();
        System.out.println("Series is :");
        for(int i=0;i<=n;i++){
            System.out.print(prntseries.prntseries(i)+" ");
        }
    }
}