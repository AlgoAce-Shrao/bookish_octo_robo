
import java.util.Scanner;

public class solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Input:");
        int t = sc.nextInt();
        int sx = 0,sy=0,sz=0;
        while (t-- > 0) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            sx+=x;
            sy+=y;
            sz+=z;

        }

        if (sx==0 && sy==0 && sz==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
