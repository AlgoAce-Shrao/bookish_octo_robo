/*
To understand the concept of swap method in list
*/

import java.util.*;
class swap_elements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=0,j=5;
        int arr[]=new int[5];
        
        ArrayList<Integer> a1=new ArrayList<>(5);
        System.err.println("Enter the elements of the list ");
        for(i=0;i<5;i++){
            int n=sc.nextInt();
            a1.add(n);
        }
        System.err.println("The elements of the list is : "+a1);
        Collections.swap(a1, 0, 4);
        System.err.println("After swapping :"+a1);
    }
}