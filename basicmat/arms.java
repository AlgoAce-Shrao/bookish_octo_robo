import java.util.*;
class arms{
    public static void main(String args[]){
        int n,s=0,a,b,d,c=0;
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        n=sc.nextInt();
        a=n;
        b=n;
         // count the number of digits
         while(n!=0){
            c++;
            n=n/10;
         }
         while(b!=0){
            d=b%10;
            s=s+(int)Math.pow(d, c);
            b=b/10;
         }
         if(s==a)
            System.out.println("Number is armstrong ");
        else 
            System.out.println("Number is not  armstrong ");

    }
}