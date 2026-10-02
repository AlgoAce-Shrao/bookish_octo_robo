//count the number of digits
import java.util.*;
class prDiv{
    public void printDiv(int n){
        System.out.println("Divisors :");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
    //optimized-->O[sqrt(n)]
    public void prtDiv(int n){
        ArrayList<Integer> ls=new ArrayList<>();
        System.out.println("Divisors :");
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                ls.add(i);
            if(n/i!=i)
                ls.add(n/i);    
            }
        }
        Collections.sort(ls);
        System.out.print(ls+" ");
    }
}
class printdiv{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose numbers u want to print");
        int n=sc.nextInt();
        prDiv ob=new prDiv();
        ob.prtDiv(n);
    }
}