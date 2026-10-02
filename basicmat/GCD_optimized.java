//count the number of digits
// import java.lang.reflect.GenericDeclaration;
import java.util.*;
class gcd{
    public static  int printGcd(int a,int b){
        int gcd = 1;
        for(int i=1;i<=Math.min(a, b);i++){
            if(a%i==0 && b%i==0)
                gcd = i;
        }
        return gcd; // return the greatest common divisor
    }
}
class gcdOptimized {
    public static int printGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return printGcd(b, a % b);
    }
}
class GCD_optimized{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose gcd u want to print: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD: "+gcd.printGcd(a, b));
    }
}