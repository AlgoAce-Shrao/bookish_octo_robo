import java.util.Scanner;

public class SOL572a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n1];
        for (int i = 0; i < n1; i++) {  
            a[i] = sc.nextInt();
        }
        int b[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        
        if(a[k-1]<b[n2-m]) System.out.println("YES");
        else System.out.println("NO");


    }
}
