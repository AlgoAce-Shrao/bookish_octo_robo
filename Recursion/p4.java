import java.util.*;
// class printnum{
//     int num;
//     int c;
//     public void setNum(int num){
//         this.c=num;
//     }
//     public void printnum(){
//         // int c=num;
//         if(c==0) return;   //c==0 because the program will terminate when c==0 so that 1 gets printed
//         //if c==1 -->1 will not get printed...since when c==1 program teerminates (return)
//         else{
//             System.out.print(c+" ");
//             c--;
//             printnum();
//         }
//     }
// }
//Better approach
// Time complexity --> O[n]
// Space complexity --> O[n]--> amount of stack space occupied
class printnum{
    public void printnum( int i,int num){
        if(i>num) return;
        else{
            System.out.print(num+" ");
            printnum(1,(num-1));
        }
        System.out.println();
    }
}
//By backtracking --> by not  using (num-1)
class backtrack{
    public void backtrack(int i,int n){
        if(i>n) return ;
        else    
            backtrack((i+1), n);
            System.out.print(i);
    }
}
class p4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from which u want to print:");
        int n=sc.nextInt();
        printnum ob=new printnum();
        backtrack obj=new backtrack();
        ob.printnum(1,n);
        System.out.println("Same series by backtracking :");
        obj.backtrack(1, n);
    }
}