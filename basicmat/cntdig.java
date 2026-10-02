import java.util.*;
class countdigits{
    public int count(int n){
        int c=0,d;
        while(n!=0){
            d=n%10;
            c++;
            n=n/10;
        }
        return c;
    }
    //better logic--> T.C -->O[log10(num)]
    public int count1(int n){
        return ((int)Math.log10(n)+1);
    }
}
class cntdig{
    public static void main(String []  args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        num=sc.nextInt();
        countdigits ob=new countdigits();
        System.out.println("Numbe of digits are :"+ob.count1(num));
    }
}