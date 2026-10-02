/*
reverse the array by swap method from list
*/
import java.util.*;

//funsiton to print the reversed array 
// class printreverse{
//     public static  void printreverse( ArrayList ar,int n){
//         System.out.println("Reversed : ");
//         for(int i=0;i<n;i++){
//             ar.get(i);

//         }
//     }
// }
class reversearr{
    public static    void reversearr(ArrayList ar,int n){
            Collections.reverse(ar);
            System.out.println("Reversed : ");
             for(int i=0;i<n;i++){
              ar.get(i);

        }
    }
}
class rev_arr2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        System.out.println("How many elemetns u want store ?");
        int n=sc.nextInt();
        System.out.println("Enter teh elemetns of the list ");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            a.add(num);
        }
        reversearr.reversearr(a,n);
        // printreverse.printreverse(a,n);

    }
}