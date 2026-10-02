import java.util.*;
// class printnum{
//     int c=1;
//     public void printnum(int num){
//         if(c>num) return;
//         else{
//             System.out.print(c+" ");
//             c++;
//             printnum(num);
//         }
//     }
// }
//Better Approach
// Time complexity --> O[n]
// Space complexity --> O[n]--> amount of stack space occupied
class printnum{
    public void printnum( int i,int num){
        if(i>num) return;
        else{
            System.out.print(i+" ");
            printnum((i+1),num);
        }
    }
}
// by backtracking --> by not using i+1
class back{
    public void back(int i,int n){
        if(i<1) return ;
        else  {
            back((i-1), n);
            System.out.print(i+" ");
        }  
            
    }
}
class p3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto which u want to print:");
        int n=sc.nextInt();
        printnum ob=new printnum();
        ob.printnum(1,n);
        back obj=new back();
        System.out.println();
        System.out.println("Same series by backtracking :");
        obj.back(n, n);
    }
}