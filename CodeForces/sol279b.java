import java.util.*;
public class sol279b {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=a[0],c=1;
        for(int i=0;i<n-1;i++){
            if((t-s)>=a[i+1]){
                s+=a[i+1];
                c++;
            }else c--;
        }
        System.out.println(c);
    }
}
