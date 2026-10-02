import java.util.*;
class prntsum{
    public void   prntsum(int i,int s){
        	if(i==0) {
                System.out.println("Sum is :"+s);
            }
            else prntsum((i-1), (s+i));
    }
}
class sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        prntsum ob=new prntsum();
        ob.prntsum(n,0);
    }
}