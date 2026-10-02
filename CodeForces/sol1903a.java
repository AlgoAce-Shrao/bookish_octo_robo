import java.util.Scanner;

public class sol1903a {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            boolean sorted=true;
        if(k==1){//if k=1 then -->an element in an array is sorted in itself..only if the the next element of that element is smaller..i.e. the subarray is decreasing..then only the answer becomes yes
            for(int i=1;i<n;i++){
                if(a[i]<a[i-1]){
                    sorted=false;
                    break;
                }
            }           
            System.out.println(sorted?"YES": "NO");
        }else{
            System.out.println("YES"); //if k>=2 it can always be sorted...so alsways the answer is yes..
        }
        }
    }
}
