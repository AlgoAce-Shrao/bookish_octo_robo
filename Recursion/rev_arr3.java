/*
to reverse an array --> by swapping
*/
import java.util.*;
class revprnt {
  // int p1=0,p2=n-1;
  public static void revprnt(ArrayList<Integer> a, int p1, int p2) {
    if (p1 >= p2) {
      return;
    } else {
      Collections.swap(a, p1, p2);
     revprnt(a, p1 + 1, p2 - 1);
    }

  }
}
 class rev_arr3{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the list :");
    n=sc.nextInt();
    ArrayList<Integer> a=new ArrayList<>(n);
    System.out.println("enter the elements of the list :");
    for(int i=0;i<n;i++){
      a.add(sc.nextInt());
    }
    // revprnt ob=new revprnt();
    revprnt.revprnt(a,0,n-1);
    System.out.println("Reversed:"+a);
  }
}