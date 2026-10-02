/*
program to print name 5 times using Recursion
*/
 import java.util.*;
// class print{
//         int c=0;
//     public void print(int par, String nm, int n){
//         if(c==5) return;
//         else{
//             System.out.println(nm);
//             c++;
//             print(nm);
//         }
//     }
// }
// better approach
// Time complexity --> O[n]
// Space complexity --> O[n]--> amount of stack space occupied
class print{
    public void print(int i,String nm,int lim){
        if(i>lim) return;
        else{
            System.out.println(nm);
            print((i+1),nm,lim);
        }
    }
}
class prntnm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many times u want to print name");
        int n=sc.nextInt();
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Output");
        print ob=new print();
        ob.print(1,name,n);
    }
}