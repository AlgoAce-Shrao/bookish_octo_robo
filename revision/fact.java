import java.util.*;
class printfac{
    public int printfac(int n){
        if(n==0) 
            return 1;
        else{
             return n*printfac(n-1);
            
        }
    }
}
class fact{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which u want the factorial :");
        int num=sc.nextInt();
        printfac ob=new printfac();
        System.out.println("Series is : ");
        System.out.println(ob.printfac(num));
    }
}