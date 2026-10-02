// to print the sum of n numbers
import java.util.*;
// import javax.sound.sampled.SourceDataLine;
// parameterized way
class printsum{
    int s=0;
        public void printsum(int i,int s){
            if(i<1) 
                System.out.println("Sum is :"+s);
            else{
                printsum((i-1), s+i);
            }
        }
}
//funstional way --->values will be returned by functions itself
class sumFunc{
    public int sumFunc(int num){
        if(num==0) {
            return 0;   //-->base condition
        }
        else{ 

            return num+sumFunc(num-1);
        }
    }
        
}
class sum{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto which u want the sum:");
        int n=sc.nextInt();
        printsum ob=new printsum();
        System.out.println("By parameterized method:");
        ob.printsum(n,0);
        System.out.println("By functional method:");
        sumFunc obj=new sumFunc();
        System.out.println("Sum is "+obj.sumFunc(n));

    }
}